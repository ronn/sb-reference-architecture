package com.ronn.sbreferencearchitecture.company.infrastructure.persistence.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CompanyDTO {

  @Id
  private final String id;
  private final String name;

  public CompanyDTO(String id, String name) {
    this.id = id;
    this.name = name;
  }

  public CompanyDTO() {
    this.name = null;
    this.id = null;
  }

  public String getId() {
    return id;
  }

  public String getName() {
    return name;
  }
}
