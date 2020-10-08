package com.ronn.sbreferencearchitecture.shared.util;

import com.ronn.sbreferencearchitecture.company.application.exception.model.UUIDNotValid;
import org.springframework.util.Assert;

import java.util.UUID;

public class UUIDUtils {

  public static UUID from(String stringUuid) {
    Assert.notNull(stringUuid, "Uuid in string format is required");

    try {
      return UUID.fromString(stringUuid);
    } catch (IllegalArgumentException e) {
      throw new UUIDNotValid(stringUuid);
    }
  }
}
