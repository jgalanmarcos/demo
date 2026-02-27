package com.jgm.app.domain.vos;

import java.util.Arrays;

import lombok.Getter;

@Getter
public enum Currency {
  EUR("Euro"),
  USD("Dollar");

  private final String displayName;

  Currency(String displayName) {
    this.displayName = displayName;
  }

  public static Currency fromDisplayName(String name) {

    return Arrays.stream(Currency.values())
        .filter(enumValue -> enumValue.displayName.equalsIgnoreCase(name))
        .findAny()
        .orElse(null);
  }
}
