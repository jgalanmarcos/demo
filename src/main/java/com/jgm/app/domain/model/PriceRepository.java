package com.jgm.app.domain.model;

import java.time.LocalDateTime;

public interface PriceRepository {

  Price getPrice(LocalDateTime date, Long productId, Long brandId);
}
