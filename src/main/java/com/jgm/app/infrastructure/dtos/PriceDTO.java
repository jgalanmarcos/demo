package com.jgm.app.infrastructure.dtos;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class PriceDTO {

  private Long brandId;

  private LocalDateTime startDate;

  private LocalDateTime endDate;

  private Integer priceList;

  private Long productId;

  private BigDecimal price;

  private String currency;
}
