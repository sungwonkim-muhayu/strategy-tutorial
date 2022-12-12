package org.github.swsz2.strategy.renew;

import org.github.swsz2.strategy.Animal;
import org.springframework.stereotype.Component;

@Component
public class DogStrategy extends AbstractStrategy {
  public DogStrategy() {
    super(Animal.DOG);
  }
}
