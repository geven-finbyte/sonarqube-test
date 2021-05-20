package com.test.sonarqubetest.controller;

import com.test.sonarqubetest.DummyModel;
import java.util.Optional;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DummyController {

  @GetMapping("/dummyEndpoint")
  public ResponseEntity<DummyModel> dummyEndpoint(){
    return ResponseEntity.of(Optional.of(new DummyModel("Ali", "1")));
  }
}
