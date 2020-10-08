package com.ronn.sbreferencearchitecture.company.infrastructure.api.controller.writing;

import org.springframework.http.ResponseEntity;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.util.UUID;

public abstract class BaseController {

  protected final ResponseEntity<UUID> build(UUID id) {
    return ResponseEntity.created(
        ServletUriComponentsBuilder
            .fromCurrentRequest().path("/{id}")
            .buildAndExpand(id).toUri()
    ).build();
  }
}
