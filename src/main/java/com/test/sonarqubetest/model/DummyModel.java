package com.test.sonarqubetest.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import org.springframework.lang.Nullable;

@Data
@AllArgsConstructor
public class DummyModel {

  private String name;
  @NonNull
  private String id = null;
  @Nullable
  private int score;
}
