package com.jgm.app.domain.services;

import java.time.LocalDateTime;

import com.jgm.app.domain.model.Price;
import com.jgm.app.domain.model.PriceRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Slf4j
public class PriceService {

  private final PriceRepository priceRepository;

  public PriceService(PriceRepository priceRepository) {
    this.priceRepository = priceRepository;
  }

  @Transactional(readOnly = true)
  public Price getPrice(LocalDateTime date, Long productId, Long brandId) {
    log.info("PriceService: getPrice() -> date[ {} ], productId[ {} ] and brandId[ {} ]", date, productId, brandId);

    return priceRepository.getPrice(date, productId, brandId);
  }
}
