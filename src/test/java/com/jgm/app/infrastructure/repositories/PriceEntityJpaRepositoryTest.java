package com.jgm.app.infrastructure.repositories;

import static com.jgm.app.Data.getPriceEntity1;
import static com.jgm.app.Data.getPriceEntity2;
import static com.jgm.app.Data.getPriceEntity3;
import static com.jgm.app.Data.getPriceEntity4;
import static com.jgm.app.Data.inputFindPriceUseCase1;
import static com.jgm.app.Data.inputFindPriceUseCase2;
import static com.jgm.app.Data.inputFindPriceUseCase3;
import static com.jgm.app.Data.inputFindPriceUseCase4;
import static com.jgm.app.Data.inputFindPriceUseCase5;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import com.jgm.app.application.FindPriceUseCaseRequest;
import com.jgm.app.infrastructure.entities.PriceEntity;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@DataJpaTest
class PriceEntityJpaRepositoryTest {

  @Autowired
  private TestEntityManager entityManager;

  @Autowired
  private PriceEntityJpaRepository priceRepository;

  @BeforeEach
  void setUp() {
    entityManager.persistAndFlush(getPriceEntity1());
    entityManager.persistAndFlush(getPriceEntity2());
    entityManager.persistAndFlush(getPriceEntity3());
    entityManager.persistAndFlush(getPriceEntity4());
  }

  @Test
  void findByDateAndProductIdAndBrandIdTest1() throws Exception {
    // given case 1
    FindPriceUseCaseRequest request = inputFindPriceUseCase1();

    List<PriceEntity> result =
        priceRepository.findByDateAndProductIdAndBrandId(request.getDate(), request.getProductId(), request.getBrandId());

    assertNotNull(result);
    assertEquals(1, result.size());
  }

  @Test
  void findByDateAndProductIdAndBrandIdTest2() throws Exception {
    // given case 2
    FindPriceUseCaseRequest request = inputFindPriceUseCase2();

    List<PriceEntity> result =
        priceRepository.findByDateAndProductIdAndBrandId(request.getDate(), request.getProductId(), request.getBrandId());

    assertNotNull(result);
    assertEquals(2, result.size());
  }

  @Test
  void findByDateAndProductIdAndBrandIdTest3() throws Exception {
    // given case 3
    FindPriceUseCaseRequest request = inputFindPriceUseCase3();

    List<PriceEntity> result =
        priceRepository.findByDateAndProductIdAndBrandId(request.getDate(), request.getProductId(), request.getBrandId());

    assertNotNull(result);
    assertEquals(1, result.size());
  }

  @Test
  void findByDateAndProductIdAndBrandIdTest4() throws Exception {
    // given case 4
    FindPriceUseCaseRequest request = inputFindPriceUseCase4();

    List<PriceEntity> result =
        priceRepository.findByDateAndProductIdAndBrandId(request.getDate(), request.getProductId(), request.getBrandId());

    assertNotNull(result);
    assertEquals(2, result.size());
  }

  @Test
  void findByDateAndProductIdAndBrandIdTest5() throws Exception {
    // given case 5
    FindPriceUseCaseRequest request = inputFindPriceUseCase5();

    List<PriceEntity> result =
        priceRepository.findByDateAndProductIdAndBrandId(request.getDate(), request.getProductId(), request.getBrandId());

    assertNotNull(result);
    assertEquals(2, result.size());
  }
}
