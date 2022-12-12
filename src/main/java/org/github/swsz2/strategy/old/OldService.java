package org.github.swsz2.strategy.old;

import org.github.swsz2.strategy.Animal;
import org.github.swsz2.strategy.Payload;
import org.github.swsz2.strategy.Response;
import org.springframework.stereotype.Service;

@Service
public class OldService {

  public void saveCatMetadata() {
    // - 조회 페이로드 생성을 위한 타 서비스의 API 호출
    final Response payloadMetadata = requestPayloadMetadataResponse();

    // 조회 페이로드 생성
    final Payload payload =
        Payload.builder()
            .animal(Animal.CAT)
            .foo(payloadMetadata.getFoo())
            .bar(payloadMetadata.getBar())
            .foobar(payloadMetadata.getFoobar())
            .baz(payloadMetadata.getBaz())
            .build();

    // 조회 페이로드 유효성 검증
    if (payload.getFoo() == null
        || payload.getBar() == null
        || payload.getFoobar() == null
        || payload.getBaz() == null
        || payload.getAnimal() == null) {
      throw new IllegalArgumentException();
    }

    // FETCH API 호출
    final Response fetched = fetch(payload);

    // 유효성 검증
    if (fetched.getFoo() == null
        || fetched.getBar() == null
        || fetched.getFoobar() == null
        || fetched.getBaz() == null) {
      throw new IllegalArgumentException();
    }

    save(fetched);
  }

  public void saveElephantMetadata() {

    // - 조회 페이로드 생성을 위한 타 서비스의 API 호출
    final Response payloadMetadata = requestPayloadMetadataResponse();

    // 조회 페이로드 생성
    final Payload payload =
        Payload.builder()
            .animal(Animal.ELEPHANT)
            .foo(payloadMetadata.getFoo())
            .bar(payloadMetadata.getBar())
            .foobar(payloadMetadata.getFoobar())
            .baz(payloadMetadata.getBaz())
            .build();

    // 조회 페이로드 유효성 검증
    if (payload.getFoo() == null
        || payload.getBar() == null
        || payload.getFoobar() == null
        || payload.getBaz() == null
        || payload.getAnimal() == null) {
      throw new IllegalArgumentException();
    }

    // FETCH API 호출
    final Response fetched = fetch(payload);

    // 유효성 검증
    if (fetched.getFoo() == null
        || fetched.getBar() == null
        || fetched.getFoobar() == null
        || fetched.getBaz() == null) {
      throw new IllegalArgumentException();
    }

    save(fetched);
  }

  public void saveDogMetadata() {

    // - 조회 페이로드 생성을 위한 타 서비스의 API 호출
    final Response payloadMetadata = requestPayloadMetadataResponse();

    // 조회 페이로드 생성
    final Payload payload =
        Payload.builder()
            .animal(Animal.DOG)
            .foo(payloadMetadata.getFoo())
            .bar(payloadMetadata.getBar())
            .foobar(payloadMetadata.getFoobar())
            .baz(payloadMetadata.getBaz())
            .build();

    // 조회 페이로드 유효성 검증
    if (payload.getFoo() == null
        || payload.getBar() == null
        || payload.getFoobar() == null
        || payload.getBaz() == null
        || payload.getAnimal() == null) {
      throw new IllegalArgumentException();
    }

    // FETCH API 호출
    final Response fetched = fetch(payload);

    // 유효성 검증
    if (fetched.getFoo() == null
        || fetched.getBar() == null
        || fetched.getFoobar() == null
        || fetched.getBaz() == null) {
      throw new IllegalArgumentException();
    }

    save(fetched);
  }

  private Response requestPayloadMetadataResponse() {
    return new Response();
  }

  private Response fetch(final Payload payload) {
    // do fetch
    return new Response();
  }

  private Response save(final Response response) {
    // do save
    return response;
  }
}