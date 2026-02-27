package com.jgm.app.infrastructure.restcontrollers;

import static com.jgm.app.Data.findPriceUseCaseResponse1;
import static com.jgm.app.Data.findPriceUseCaseResponse2;
import static com.jgm.app.Data.findPriceUseCaseResponse3;
import static com.jgm.app.Data.findPriceUseCaseResponse4;
import static com.jgm.app.Data.getPriceDTO1;
import static com.jgm.app.Data.getPriceDTO2;
import static com.jgm.app.Data.getPriceDTO3;
import static com.jgm.app.Data.getPriceDTO4;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.jgm.app.application.FindPriceUseCase;
import com.jgm.app.infrastructure.services.DateService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

@ExtendWith(SpringExtension.class)
@WebMvcTest(PriceRestController.class)
class PriceRestControllerTest {

  @MockBean
  private FindPriceUseCase findPriceUseCase;

  @MockBean
  private ModelMapper mapper;

  @MockBean
  private DateService dateService;

  @Autowired
  private MockMvc mockMvc;

  private ObjectMapper objectMapper;

  @BeforeEach
  void setUp() {
    objectMapper = new ObjectMapper();
    objectMapper.registerModule(new JavaTimeModule());
    objectMapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
  }

  @Test
  void getPriceTest1() throws Exception {
    // given URL endpoint parameters
    String date = "2020-06-14-10.00.00";
    long brandId = 1L;
    long productId = 35455L;

    when(findPriceUseCase.execute(any())).thenReturn(findPriceUseCaseResponse1());
    when(mapper.map(any(), any())).thenReturn(getPriceDTO1());

    // dto to json
    String result = objectMapper.writeValueAsString(getPriceDTO1());

    mockMvc.perform(
            get(Uris.PRICES + "?" +
                "brandId=" + brandId +
                "&date=" + date +
                "&productId=" + productId)
                .accept(MediaType.APPLICATION_JSON))
        .andExpect(status().isOk())
        .andExpect(content().json(result)
        );
  }

  @Test
  void getPriceTest2() throws Exception {
    // given URL endpoint parameters
    String date = "2020-06-14-16.00.00";
    long brandId = 1L;
    long productId = 35455L;

    when(findPriceUseCase.execute(any())).thenReturn(findPriceUseCaseResponse2());
    when(mapper.map(any(), any())).thenReturn(getPriceDTO2());

    // dto to json
    String result = objectMapper.writeValueAsString(getPriceDTO2());

    mockMvc.perform(
            get(Uris.PRICES + "?" +
                "brandId=" + brandId +
                "&date=" + date +
                "&productId=" + productId)
                .accept(MediaType.APPLICATION_JSON))
        .andExpect(status().isOk())
        .andExpect(content().json(result)
        );
  }

  @Test
  void getPriceTest3() throws Exception {
    // given URL endpoint parameters
    String date = "2020-06-14-21.00.00";
    long brandId = 1L;
    long productId = 35455L;

    when(findPriceUseCase.execute(any())).thenReturn(findPriceUseCaseResponse1());
    when(mapper.map(any(), any())).thenReturn(getPriceDTO1());

    // dto to json
    String result = objectMapper.writeValueAsString(getPriceDTO1());

    mockMvc.perform(
            get(Uris.PRICES + "?" +
                "brandId=" + brandId +
                "&date=" + date +
                "&productId=" + productId)
                .accept(MediaType.APPLICATION_JSON))
        .andExpect(status().isOk())
        .andExpect(content().json(result)
        );
  }

  @Test
  void getPriceTest4() throws Exception {
    // given URL endpoint parameters
    String date = "2020-06-15-10.00.00";
    long brandId = 1L;
    long productId = 35455L;

    when(findPriceUseCase.execute(any())).thenReturn(findPriceUseCaseResponse3());
    when(mapper.map(any(), any())).thenReturn(getPriceDTO3());

    // dto to json
    String result = objectMapper.writeValueAsString(getPriceDTO3());

    mockMvc.perform(
            get(Uris.PRICES + "?" +
                "brandId=" + brandId +
                "&date=" + date +
                "&productId=" + productId)
                .accept(MediaType.APPLICATION_JSON))
        .andExpect(status().isOk())
        .andExpect(content().json(result)
        );
  }

  @Test
  void getPriceTest5() throws Exception {
    // given URL endpoint parameters
    String date = "2020-06-16-21.00.00";
    long brandId = 1L;
    long productId = 35455L;

    when(findPriceUseCase.execute(any())).thenReturn(findPriceUseCaseResponse4());
    when(mapper.map(any(), any())).thenReturn(getPriceDTO4());

    // dto to json
    String result = objectMapper.writeValueAsString(getPriceDTO4());

    mockMvc.perform(
            get(Uris.PRICES + "?" +
                "brandId=" + brandId +
                "&date=" + date +
                "&productId=" + productId)
                .accept(MediaType.APPLICATION_JSON))
        .andExpect(status().isOk())
        .andExpect(content().json(result)
        );
  }

  @Test
  void getPriceFallback_returnsServiceUnavailable() {
    PriceRestController controller = new PriceRestController(null, null, null);

    ResponseEntity<?> response = controller.getPriceFallback(
        "2020-06-14-10.00.00", 35455L, 1L, new RuntimeException("Simulated error"));

    assertEquals(HttpStatus.SERVICE_UNAVAILABLE, response.getStatusCode());
    assertNull(response.getBody());
  }
}
