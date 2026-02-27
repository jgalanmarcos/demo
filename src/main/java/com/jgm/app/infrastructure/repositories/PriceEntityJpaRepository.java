package com.jgm.app.infrastructure.repositories;

import java.time.LocalDateTime;
import java.util.List;

import com.jgm.app.infrastructure.entities.PriceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PriceEntityJpaRepository extends JpaRepository<PriceEntity, Long> {

  @Query("SELECT p FROM PriceEntity p WHERE p.startDate <= ?1 AND p.endDate >= ?1 AND p.productId = ?2 AND p.brandId = ?3")
  List<PriceEntity> findByDateAndProductIdAndBrandId(LocalDateTime date, Long productId, Long brandId);
}
