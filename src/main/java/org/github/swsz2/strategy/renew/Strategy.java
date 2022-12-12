package org.github.swsz2.strategy.renew;

import org.github.swsz2.strategy.Animal;
import org.github.swsz2.strategy.Payload;
import org.github.swsz2.strategy.Response;

public interface Strategy {
  Response requestPayloadMetadataResponse();

  Response fetch(final Payload payload);

  Payload createPayload(final Response response);

  Animal getAnimal();
}
