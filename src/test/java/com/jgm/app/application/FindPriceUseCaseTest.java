package com.jgm.app.application;

import static com.jgm.app.Data.getPrice1;
import static com.jgm.app.Data.getPrice2;
import static com.jgm.app.Data.getPrice3;
import static com.jgm.app.Data.getPrice4;
import static com.jgm.app.Data.inputFindPriceUseCase1;
import static com.jgm.app.Data.inputFindPriceUseCase2;
import static com.jgm.app.Data.inputFindPriceUseCase3;
import static com.jgm.app.Data.inputFindPriceUseCase4;
import static com.jgm.app.Data.inputFindPriceUseCase5;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

import com.jgm.app.domain.services.PriceService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
class FindPriceUseCaseTest {

  @Mock
  private PriceService priceService;

  @InjectMocks
  FindPriceUseCase findPriceUseCase;

  @Test
  void testCase1() {
    // given case 1
    FindPriceUseCaseRequest request = inputFindPriceUseCase1();

    when(priceService.getPrice(request.getDate(), request.getProductId(), request.getBrandId())).thenReturn(getPrice1());

    FindPriceUseCaseResponse result = findPriceUseCase.execute(request);

    assertNotNull(result);
    assertEquals(1L, result.getPrice().getId());
  }

  @Test
  void testCase2() {
    // given case 2
    FindPriceUseCaseRequest request = inputFindPriceUseCase2();

    when(priceService.getPrice(request.getDate(), request.getProductId(), request.getBrandId())).thenReturn(getPrice2());

    FindPriceUseCaseResponse result = findPriceUseCase.execute(request);

    assertNotNull(result);
    assertEquals(2L, result.getPrice().getId());
  }

  @Test
  void testCase3() {
    // given case 3
    FindPriceUseCaseRequest request = inputFindPriceUseCase3();

    when(priceService.getPrice(request.getDate(), request.getProductId(), request.getBrandId())).thenReturn(getPrice1());

    FindPriceUseCaseResponse result = findPriceUseCase.execute(request);

    assertNotNull(result);
    assertEquals(1L, result.getPrice().getId());
  }

  @Test
  void testCase4() {
    // given case 4
    FindPriceUseCaseRequest request = inputFindPriceUseCase4();

    when(priceService.getPrice(request.getDate(), request.getProductId(), request.getBrandId())).thenReturn(getPrice3());

    FindPriceUseCaseResponse result = findPriceUseCase.execute(request);

    assertNotNull(result);
    assertEquals(3L, result.getPrice().getId());
  }

  @Test
  void testCase5() {
    // given case 5
    FindPriceUseCaseRequest request = inputFindPriceUseCase5();

    when(priceService.getPrice(request.getDate(), request.getProductId(), request.getBrandId())).thenReturn(getPrice4());

    FindPriceUseCaseResponse result = findPriceUseCase.execute(request);

    assertNotNull(result);
    assertEquals(4L, result.getPrice().getId());
  }
}
