package com.jgm.app.application;

import com.jgm.app.domain.model.Price;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class FindPriceUseCaseResponse {

  private Price price;
}
