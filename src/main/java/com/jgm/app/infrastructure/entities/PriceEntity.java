package com.jgm.app.infrastructure.entities;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.jgm.app.domain.vos.Currency;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "prices")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class PriceEntity extends BaseEntity {

  @Column(name = "brand_id")
  private Long brandId;

  @Column(name = "start_date")
  private LocalDateTime startDate;

  @Column(name = "end_date")
  private LocalDateTime endDate;

  @Column(name = "price_list")
  private Integer priceList;

  @Column(name = "product_id")
  private Long productId;

  private Integer priority;

  private BigDecimal price;

  @Enumerated(value = EnumType.STRING)
  private Currency currency;
}
