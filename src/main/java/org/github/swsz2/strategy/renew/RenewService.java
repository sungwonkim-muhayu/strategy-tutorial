package org.github.swsz2.strategy.renew;

import lombok.RequiredArgsConstructor;
import org.github.swsz2.strategy.Animal;
import org.github.swsz2.strategy.Payload;
import org.github.swsz2.strategy.Response;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RenewService {

  private final Strategies strategies;

  public void saveAnimalMetadata(final Animal animal) {
    final Strategy strategy = strategies.findStrategy(animal);
    final Response payloadMetadataResponse = strategy.requestPayloadMetadataResponse();
    final Payload payload = strategy.createPayload(payloadMetadataResponse);
    final Response fetched = strategy.fetch(payload);

    // 저장은 전략의 역할이 아니기 때문에 외부에서 구현
    save(fetched);
  }

  private Response save(final Response response) {
    // do save
    return response;
  }
}
