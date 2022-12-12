package org.github.swsz2.strategy;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Payload {
  private String foo;
  private String bar;
  private String foobar;
  private String baz;
  private Animal animal;
}
