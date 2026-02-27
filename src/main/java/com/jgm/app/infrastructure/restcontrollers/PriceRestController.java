package com.jgm.app.infrastructure.restcontrollers;

import com.jgm.app.application.FindPriceUseCase;
import com.jgm.app.application.FindPriceUseCaseRequest;
import com.jgm.app.infrastructure.dtos.PriceDTO;
import com.jgm.app.infrastructure.services.DateService;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(Uris.PRICES)
@Slf4j
public class PriceRestController {

  private final FindPriceUseCase findPriceUseCase;

  private final ModelMapper mapper;

  private final DateService dateService;

  public PriceRestController(FindPriceUseCase findPriceUseCase, ModelMapper mapper, DateService dateService) {
    this.findPriceUseCase = findPriceUseCase;
    this.mapper = mapper;
    this.dateService = dateService;
  }

  @GetMapping
  @CircuitBreaker(name = "getPriceCB", fallbackMethod = "getPriceFallback")
  public ResponseEntity<PriceDTO> getPrice(@RequestParam String date, @RequestParam Long productId, @RequestParam Long brandId) {
    log.info("PriceRestController: getPrice() -> date[ {} ], productId[ {} ] and brandId[ {} ]", date, productId, brandId);

    FindPriceUseCaseRequest findPriceUseCaseRequest = FindPriceUseCaseRequest.builder()
        .date(dateService.getLocalDateTimeFromString(date))
        .productId(productId)
        .brandId(brandId)
        .build();

    return new ResponseEntity<>(
        mapper.map(findPriceUseCase.execute(findPriceUseCaseRequest).getPrice(), PriceDTO.class),
        HttpStatus.OK);
  }

  public ResponseEntity<PriceDTO> getPriceFallback(String date, Long productId, Long brandId, Throwable t) {
    log.error("PriceRestController: getPriceFallback() -> date[ {} ], productId[ {} ] and brandId[ {} ]. Cause: {}",
        date, productId, brandId, t.toString());
    return new ResponseEntity<>(HttpStatus.SERVICE_UNAVAILABLE);
  }
}
