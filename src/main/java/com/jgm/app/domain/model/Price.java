package com.jgm.app.domain.model;

import com.jgm.app.domain.vos.Currency;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Price {

  private Long id;

  private LocalDateTime created;

  private LocalDateTime modified;

  private Long brandId;

  private LocalDateTime startDate;

  private LocalDateTime endDate;

  private Integer priceList;

  private Long productId;

  private Integer priority;

  private BigDecimal price;

  private Currency currency;
}
