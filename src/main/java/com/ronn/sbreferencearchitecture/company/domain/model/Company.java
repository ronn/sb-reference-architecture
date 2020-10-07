package com.ronn.sbreferencearchitecture.company.domain.model;

import java.util.List;
import java.util.UUID;

public final class Company {

  private final UUID id;
  private final String name;
  private final List<Employee> employees;


  public Company(UUID id, String name, List<Employee> employees) {
    this.id = id;
    this.name = name;
    this.employees = employees;
  }

  public UUID getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public List<Employee> getEmployees() {
    return employees;
  }
}
