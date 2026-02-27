package com.jgm.app.infrastructure.services;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DateService {

  public LocalDateTime getLocalDateTimeFromString(String date) {
    log.info("DateService: getLocalDateTimeFromString() -> date[ {} ]", date);

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DatePatterns.DATE_TIME_PATTERN);

    return LocalDateTime.parse(date, formatter);
  }
}
