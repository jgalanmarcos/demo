package com.jgm.app.infrastructure.configs;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.jgm.app.domain.vos.Currency;
import com.jgm.app.infrastructure.entities.PriceEntity;
import com.jgm.app.infrastructure.repositories.PriceEntityJpaRepository;
import com.jgm.app.infrastructure.services.DateService;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

  private final PriceEntityJpaRepository priceRepository;

  private final DateService dateService;

  public DataLoader(PriceEntityJpaRepository priceRepository, DateService dateService) {
    this.priceRepository = priceRepository;
    this.dateService = dateService;
  }

  public void run(ApplicationArguments args) {
    LocalDateTime date = LocalDateTime.now();

    PriceEntity price1 = new PriceEntity();
    price1.setId(null);
    price1.setCreated(date);
    price1.setModified(date);
    price1.setBrandId(1L);
    price1.setStartDate(dateService.getLocalDateTimeFromString("2020-06-14-00.00.00"));
    price1.setEndDate(dateService.getLocalDateTimeFromString("2020-12-31-23.59.59"));
    price1.setPriceList(1);
    price1.setProductId(35455L);
    price1.setPriority(0);
    price1.setPrice(BigDecimal.valueOf(35.5));
    price1.setCurrency(Currency.EUR);
    priceRepository.save(price1);

    PriceEntity price2 = new PriceEntity();
    price2.setId(null);
    price2.setCreated(date);
    price2.setModified(date);
    price2.setBrandId(1L);
    price2.setStartDate(dateService.getLocalDateTimeFromString("2020-06-14-15.00.00"));
    price2.setEndDate(dateService.getLocalDateTimeFromString("2020-06-14-18.30.00"));
    price2.setPriceList(2);
    price2.setProductId(35455L);
    price2.setPriority(1);
    price2.setPrice(BigDecimal.valueOf(25.45));
    price2.setCurrency(Currency.EUR);
    priceRepository.save(price2);

    PriceEntity price3 = new PriceEntity();
    price3.setId(null);
    price3.setCreated(date);
    price3.setModified(date);
    price3.setBrandId(1L);
    price3.setStartDate(dateService.getLocalDateTimeFromString("2020-06-15-00.00.00"));
    price3.setEndDate(dateService.getLocalDateTimeFromString("2020-06-15-11.00.00"));
    price3.setPriceList(3);
    price3.setProductId(35455L);
    price3.setPriority(1);
    price3.setPrice(BigDecimal.valueOf(30.5));
    price3.setCurrency(Currency.EUR);
    priceRepository.save(price3);

    PriceEntity price4 = new PriceEntity();
    price4.setId(null);
    price4.setCreated(date);
    price4.setModified(date);
    price4.setBrandId(1L);
    price4.setStartDate(dateService.getLocalDateTimeFromString("2020-06-15-16.00.00"));
    price4.setEndDate(dateService.getLocalDateTimeFromString("2020-12-31-23.59.59"));
    price4.setPriceList(4);
    price4.setProductId(35455L);
    price4.setPriority(1);
    price4.setPrice(BigDecimal.valueOf(38.95));
    price4.setCurrency(Currency.EUR);
    priceRepository.save(price4);
  }
}
