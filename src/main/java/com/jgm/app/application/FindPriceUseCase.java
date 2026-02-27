package com.jgm.app.application;

import com.jgm.app.domain.model.Price;
import com.jgm.app.domain.services.PriceService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class FindPriceUseCase {

  private final PriceService priceService;

  public FindPriceUseCase(PriceService priceService) {
    this.priceService = priceService;
  }

  public FindPriceUseCaseResponse execute(FindPriceUseCaseRequest findPriceUseCaseRequest) {
    log.info("FindPriceUseCaseResponse: execute() -> findPriceUseCaseRequest[ {} ]", findPriceUseCaseRequest);

    Price price = priceService.getPrice(
        findPriceUseCaseRequest.getDate(),
        findPriceUseCaseRequest.getProductId(),
        findPriceUseCaseRequest.getBrandId());

    return FindPriceUseCaseResponse.builder()
        .price(price)
        .build();
  }
}
