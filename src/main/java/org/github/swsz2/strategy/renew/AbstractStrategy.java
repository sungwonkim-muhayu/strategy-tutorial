package org.github.swsz2.strategy.renew;

import org.github.swsz2.strategy.Animal;
import org.github.swsz2.strategy.Payload;
import org.github.swsz2.strategy.Response;

public abstract class AbstractStrategy implements Strategy {

  private final Animal animal;

  public AbstractStrategy(final Animal animal) {
    this.animal = animal;
  }

  @Override
  public Response requestPayloadMetadataResponse() {
    return new Response();
  }

  @Override
  public Response fetch(final Payload payload) {
    throwWhenPayloadIsNotValid(payload);
    // do fetch
    final Response response = new Response();
    throwWhenResponseNotValid(response);

    return response;
  }

  @Override
  public Animal getAnimal() {
    return animal;
  }

  @Override
  public Payload createPayload(final Response response) {
    return Payload.builder()
        .animal(getAnimal())
        .foo(response.getFoo())
        .bar(response.getBar())
        .foobar(response.getFoobar())
        .baz(response.getBaz())
        .build();
  }

  private void throwWhenPayloadIsNotValid(final Payload payload) {
    if (payload.getFoo() == null
        || payload.getBar() == null
        || payload.getFoobar() == null
        || payload.getBaz() == null
        || payload.getAnimal() == null) {
      throw new IllegalArgumentException();
    }
  }

  private void throwWhenResponseNotValid(final Response response) {
    if (response.getFoo() == null
        || response.getBar() == null
        || response.getFoobar() == null
        || response.getBaz() == null) {
      throw new IllegalArgumentException();
    }
  }
}
