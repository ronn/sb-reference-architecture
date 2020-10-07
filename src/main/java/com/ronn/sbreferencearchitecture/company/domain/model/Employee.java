package com.ronn.sbreferencearchitecture.company.domain.model;

import java.time.LocalDateTime;
import java.util.UUID;

public final class Employee {

  private final UUID id;
  private final LocalDateTime bornDate;
  private final Integer age;
  private final String fullName;

  public Employee(UUID id, LocalDateTime bornDate, Integer age, String fullName) {
    this.id = id;
    this.bornDate = bornDate;
    this.age = age;
    this.fullName = fullName;
  }

  public UUID getId() {
    return id;
  }

  public LocalDateTime getBornDate() {
    return bornDate;
  }

  public Integer getAge() {
    return age;
  }

  public String getFullName() {
    return fullName;
  }
}
