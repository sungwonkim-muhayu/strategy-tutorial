package org.github.swsz2.strategy.renew;

import org.github.swsz2.strategy.Animal;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

@Component
public class Strategies {

  private final Map<Animal, Strategy> strategyMap;

  public Strategies(Set<Strategy> strategies) {
    this.strategyMap = new ConcurrentHashMap<>();
    strategies.forEach(strategy -> strategyMap.put(strategy.getAnimal(), strategy));
  }

  public Strategy findStrategy(final Animal animal) {
    return strategyMap.get(animal);
  }
}
