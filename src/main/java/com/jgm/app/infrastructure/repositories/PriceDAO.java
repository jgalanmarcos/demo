package com.jgm.app.infrastructure.repositories;

import java.time.LocalDateTime;
import java.util.Comparator;

import com.jgm.app.domain.model.Price;
import com.jgm.app.domain.model.PriceRepository;
import com.jgm.app.infrastructure.entities.PriceEntity;
import com.jgm.app.infrastructure.exceptions.PriceNotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class PriceDAO implements PriceRepository {

  private final PriceEntityJpaRepository priceEntityJpaRepository;

  private final ModelMapper mapper;

  public PriceDAO(PriceEntityJpaRepository priceEntityJpaRepository, ModelMapper mapper) {
    this.priceEntityJpaRepository = priceEntityJpaRepository;
    this.mapper = mapper;
  }

  @Override
  public Price getPrice(LocalDateTime date, Long productId, Long brandId) {
    log.info("PriceDAO: getPrice() -> date[ {} ], productId[ {} ] and brandId[ {} ]", date, productId, brandId);

    return priceEntityJpaRepository.findByDateAndProductIdAndBrandId(date, productId, brandId)
        .stream()
        .max(Comparator.comparing(PriceEntity::getPriority))
        .map(p -> mapper.map(p, Price.class))
        .orElseThrow(() -> new PriceNotFoundException(date, productId, brandId));
  }
}
