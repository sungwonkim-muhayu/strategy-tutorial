package org.github.swsz2.strategy.renew;

import org.github.swsz2.strategy.Animal;
import org.springframework.stereotype.Component;

@Component
public class CatStrategy extends AbstractStrategy {
  public CatStrategy() {
    super(Animal.CAT);
  }
}
