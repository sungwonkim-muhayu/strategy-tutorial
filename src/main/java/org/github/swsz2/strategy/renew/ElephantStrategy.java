package org.github.swsz2.strategy.renew;

import org.github.swsz2.strategy.Animal;
import org.springframework.stereotype.Component;

@Component
public class ElephantStrategy extends AbstractStrategy {

  public ElephantStrategy() {
    super(Animal.ELEPHANT);
  }
}
