package com.jgm.app;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.Month;

import com.jgm.app.application.FindPriceUseCaseRequest;
import com.jgm.app.application.FindPriceUseCaseResponse;
import com.jgm.app.domain.model.Price;
import com.jgm.app.domain.vos.Currency;
import com.jgm.app.infrastructure.dtos.PriceDTO;
import com.jgm.app.infrastructure.entities.PriceEntity;
import com.jgm.app.infrastructure.services.DateService;

public class Data {

  private static final DateService dateService = new DateService();

  private static final LocalDateTime date = LocalDateTime.now();

  public static FindPriceUseCaseRequest inputFindPriceUseCase1() {

    return FindPriceUseCaseRequest.builder()
        .date(LocalDateTime.of(2020, Month.JUNE, 14, 10, 0, 0))
        .productId(35455L)
        .brandId(1L)
        .build();
  }

  public static FindPriceUseCaseRequest inputFindPriceUseCase2() {
    return FindPriceUseCaseRequest.builder()
        .date(LocalDateTime.of(2020, Month.JUNE, 14, 16, 0, 0))
        .productId(35455L)
        .brandId(1L)
        .build();
  }

  public static FindPriceUseCaseRequest inputFindPriceUseCase3() {
    return FindPriceUseCaseRequest.builder()
        .date(LocalDateTime.of(2020, Month.JUNE, 14, 21, 0, 0))
        .productId(35455L)
        .brandId(1L)
        .build();
  }

  public static FindPriceUseCaseRequest inputFindPriceUseCase4() {
    return FindPriceUseCaseRequest.builder()
        .date(LocalDateTime.of(2020, Month.JUNE, 15, 10, 0, 0))
        .productId(35455L)
        .brandId(1L)
        .build();
  }

  public static FindPriceUseCaseRequest inputFindPriceUseCase5() {
    return FindPriceUseCaseRequest.builder()
        .date(LocalDateTime.of(2020, Month.JUNE, 16, 21, 0, 0))
        .productId(35455L)
        .brandId(1L)
        .build();
  }

  public static Price getPrice1() {
    Price p1 = new Price();
    p1.setId(1L);
    p1.setCreated(date);
    p1.setModified(date);
    p1.setBrandId(1L);
    p1.setStartDate(dateService.getLocalDateTimeFromString("2020-06-14-00.00.00"));
    p1.setEndDate(dateService.getLocalDateTimeFromString("2020-12-31-23.59.59"));
    p1.setPriceList(1);
    p1.setProductId(35455L);
    p1.setPriority(0);
    p1.setPrice(BigDecimal.valueOf(35.5));
    p1.setCurrency(Currency.EUR);

    return p1;
  }

  public static Price getPrice2() {
    Price p2 = new Price();
    p2.setId(2L);
    p2.setCreated(date);
    p2.setModified(date);
    p2.setBrandId(1L);
    p2.setStartDate(dateService.getLocalDateTimeFromString("2020-06-14-15.00.00"));
    p2.setEndDate(dateService.getLocalDateTimeFromString("2020-06-14-18.30.00"));
    p2.setPriceList(2);
    p2.setProductId(35455L);
    p2.setPriority(1);
    p2.setPrice(BigDecimal.valueOf(25.45));
    p2.setCurrency(Currency.EUR);

    return p2;
  }

  public static Price getPrice3() {
    Price p3 = new Price();
    p3.setId(3L);
    p3.setCreated(date);
    p3.setModified(date);
    p3.setBrandId(1L);
    p3.setStartDate(dateService.getLocalDateTimeFromString("2020-06-15-00.00.00"));
    p3.setEndDate(dateService.getLocalDateTimeFromString("2020-06-15-11.00.00"));
    p3.setPriceList(3);
    p3.setProductId(35455L);
    p3.setPriority(1);
    p3.setPrice(BigDecimal.valueOf(30.5));
    p3.setCurrency(Currency.EUR);

    return p3;
  }

  public static Price getPrice4() {
    Price p4 = new Price();
    p4.setId(4L);
    p4.setCreated(date);
    p4.setModified(date);
    p4.setBrandId(1L);
    p4.setStartDate(dateService.getLocalDateTimeFromString("2020-06-15-16.00.00"));
    p4.setEndDate(dateService.getLocalDateTimeFromString("2020-12-31-23.59.59"));
    p4.setPriceList(4);
    p4.setProductId(35455L);
    p4.setPriority(1);
    p4.setPrice(BigDecimal.valueOf(38.95));
    p4.setCurrency(Currency.EUR);

    return p4;
  }

  public static PriceEntity getPriceEntity1() {
    PriceEntity p1 = new PriceEntity();
    p1.setId(null);
    p1.setCreated(date);
    p1.setModified(date);
    p1.setBrandId(1L);
    p1.setStartDate(dateService.getLocalDateTimeFromString("2020-06-14-00.00.00"));
    p1.setEndDate(dateService.getLocalDateTimeFromString("2020-12-31-23.59.59"));
    p1.setPriceList(1);
    p1.setProductId(35455L);
    p1.setPriority(0);
    p1.setPrice(BigDecimal.valueOf(35.5));
    p1.setCurrency(Currency.EUR);

    return p1;
  }

  public static PriceEntity getPriceEntity2() {
    PriceEntity p2 = new PriceEntity();
    p2.setId(null);
    p2.setCreated(date);
    p2.setModified(date);
    p2.setBrandId(1L);
    p2.setStartDate(dateService.getLocalDateTimeFromString("2020-06-14-15.00.00"));
    p2.setEndDate(dateService.getLocalDateTimeFromString("2020-06-14-18.30.00"));
    p2.setPriceList(2);
    p2.setProductId(35455L);
    p2.setPriority(1);
    p2.setPrice(BigDecimal.valueOf(25.45));
    p2.setCurrency(Currency.EUR);

    return p2;
  }

  public static PriceEntity getPriceEntity3() {
    PriceEntity p3 = new PriceEntity();
    p3.setId(null);
    p3.setCreated(date);
    p3.setModified(date);
    p3.setBrandId(1L);
    p3.setStartDate(dateService.getLocalDateTimeFromString("2020-06-15-00.00.00"));
    p3.setEndDate(dateService.getLocalDateTimeFromString("2020-06-15-11.00.00"));
    p3.setPriceList(3);
    p3.setProductId(35455L);
    p3.setPriority(1);
    p3.setPrice(BigDecimal.valueOf(30.5));
    p3.setCurrency(Currency.EUR);

    return p3;
  }

  public static PriceEntity getPriceEntity4() {
    PriceEntity p4 = new PriceEntity();
    p4.setId(null);
    p4.setCreated(date);
    p4.setModified(date);
    p4.setBrandId(1L);
    p4.setStartDate(dateService.getLocalDateTimeFromString("2020-06-15-16.00.00"));
    p4.setEndDate(dateService.getLocalDateTimeFromString("2020-12-31-23.59.59"));
    p4.setPriceList(4);
    p4.setProductId(35455L);
    p4.setPriority(1);
    p4.setPrice(BigDecimal.valueOf(38.95));
    p4.setCurrency(Currency.EUR);

    return p4;
  }

  public static PriceDTO getPriceDTO1() {

    return PriceDTO.builder()
        .brandId(1L)
        .startDate(dateService.getLocalDateTimeFromString("2020-06-14-00.00.00"))
        .endDate(dateService.getLocalDateTimeFromString("2020-12-31-23.59.59"))
        .priceList(1)
        .productId(35455L)
        .price(BigDecimal.valueOf(35.5))
        .currency("EUR")
        .build();
  }

  public static PriceDTO getPriceDTO2() {

    return PriceDTO.builder()
        .brandId(1L)
        .startDate(dateService.getLocalDateTimeFromString("2020-06-14-15.00.00"))
        .endDate(dateService.getLocalDateTimeFromString("2020-12-31-18.30.00"))
        .priceList(2)
        .productId(35455L)
        .price(BigDecimal.valueOf(25.45))
        .currency("EUR")
        .build();
  }

  public static PriceDTO getPriceDTO3() {

    return PriceDTO.builder()
        .brandId(1L)
        .startDate(dateService.getLocalDateTimeFromString("2020-06-15-00.00.00"))
        .endDate(dateService.getLocalDateTimeFromString("2020-06-15-11.00.00"))
        .priceList(3)
        .productId(35455L)
        .price(BigDecimal.valueOf(30.5))
        .currency("EUR")
        .build();
  }

  public static PriceDTO getPriceDTO4() {

    return PriceDTO.builder()
        .brandId(1L)
        .startDate(dateService.getLocalDateTimeFromString("2020-06-15-16.00.00"))
        .endDate(dateService.getLocalDateTimeFromString("2020-12-31-23.59.59"))
        .priceList(4)
        .productId(35455L)
        .price(BigDecimal.valueOf(38.95))
        .currency("EUR")
        .build();
  }

  public static FindPriceUseCaseResponse findPriceUseCaseResponse1() {

    return FindPriceUseCaseResponse.builder()
        .price(Price.builder()
            .id(1L)
            .created(date)
            .modified(date)
            .brandId(1L)
            .startDate(dateService.getLocalDateTimeFromString("2020-06-14-00.00.00"))
            .endDate(dateService.getLocalDateTimeFromString("2020-12-31-23.59.59"))
            .priceList(1)
            .productId(35455L)
            .priority(0)
            .price(BigDecimal.valueOf(35.5))
            .currency(Currency.EUR)
            .build())
        .build();
  }

  public static FindPriceUseCaseResponse findPriceUseCaseResponse2() {

    return FindPriceUseCaseResponse.builder()
        .price(Price.builder()
            .id(2L)
            .created(date)
            .modified(date)
            .brandId(1L)
            .startDate(dateService.getLocalDateTimeFromString("2020-06-14-15.00.00"))
            .endDate(dateService.getLocalDateTimeFromString("2020-12-31-18.30.00"))
            .priceList(2)
            .productId(35455L)
            .priority(1)
            .price(BigDecimal.valueOf(25.45))
            .currency(Currency.EUR)
            .build())
        .build();
  }

  public static FindPriceUseCaseResponse findPriceUseCaseResponse3() {

    return FindPriceUseCaseResponse.builder()
        .price(Price.builder()
            .id(3L)
            .created(date)
            .modified(date)
            .brandId(1L)
            .startDate(dateService.getLocalDateTimeFromString("2020-06-15-00.00.00"))
            .endDate(dateService.getLocalDateTimeFromString("2020-06-15-11.00.00"))
            .priceList(3)
            .productId(35455L)
            .priority(1)
            .price(BigDecimal.valueOf(30.5))
            .currency(Currency.EUR)
            .build())
        .build();
  }

  public static FindPriceUseCaseResponse findPriceUseCaseResponse4() {

    return FindPriceUseCaseResponse.builder()
        .price(Price.builder()
            .id(4L)
            .created(date)
            .modified(date)
            .brandId(1L)
            .startDate(dateService.getLocalDateTimeFromString("2020-06-15-16.00.00"))
            .endDate(dateService.getLocalDateTimeFromString("2020-12-31-23.59.59"))
            .priceList(4)
            .productId(35455L)
            .priority(1)
            .price(BigDecimal.valueOf(38.95))
            .currency(Currency.EUR)
            .build())
        .build();
  }

}
