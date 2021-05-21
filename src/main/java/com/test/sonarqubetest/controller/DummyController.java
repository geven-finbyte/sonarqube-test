package com.test.sonarqubetest.controller;

import com.test.sonarqubetest.model.DummyModel;
import java.util.Optional;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;

@RestController
@SessionAttributes("hello") // this is non compliant
@CrossOrigin(origins = "*")
public class DummyController {

  @GetMapping("/dummyEndpoint")
  public ResponseEntity<DummyModel> dummyEndpoint(){
    return ResponseEntity.of(Optional.of(new DummyModel("Ali", "1", 1)));
  }
}
