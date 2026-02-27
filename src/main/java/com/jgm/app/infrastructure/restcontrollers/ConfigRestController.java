package com.jgm.app.infrastructure.restcontrollers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(Uris.CONFIG)
@Slf4j
public class ConfigRestController {

  @Value("${spring.profiles.active}")
  private String profile;

  @GetMapping(Uris.PROFILE)
  public ResponseEntity<String> getConfig() {
    log.info("ConfigRestController: getConfig() -> profile[ {} ]", profile);

    return new ResponseEntity<>(profile, HttpStatus.OK);
  }
}
