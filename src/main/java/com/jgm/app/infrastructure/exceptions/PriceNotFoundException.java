package com.jgm.app.infrastructure.exceptions;

import java.time.LocalDateTime;

public class PriceNotFoundException extends RuntimeException {

  public PriceNotFoundException(LocalDateTime date, Long productId, Long brandId) {
    super(String.format("Unable to find price with date[ %s ], productId[ %d ] and brandId[ %d ]", date, productId, brandId));
  }
}
