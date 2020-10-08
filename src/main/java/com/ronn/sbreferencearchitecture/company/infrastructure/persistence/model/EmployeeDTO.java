package com.ronn.sbreferencearchitecture.company.infrastructure.persistence.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class EmployeeDTO {

  @Id
  private final String id;

  @Column(name = "born_date")
  private final LocalDateTime bornDate;
  private final Integer age;

  @Column(name = "full_name")
  private final String fullName;

  @Column(name = "company_id")
  private final String companyId;

  public EmployeeDTO(String id, LocalDateTime bornDate, Integer age, String fullName, String companyId) {
    this.id = id;
    this.bornDate = bornDate;
    this.age = age;
    this.fullName = fullName;
    this.companyId = companyId;
  }

  public EmployeeDTO() {
    id = null;
    this.bornDate = null;
    this.age = null;
    this.fullName = null;
    this.companyId = null;
  }

  public String getId() {
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

  public String getCompanyId() {
    return companyId;
  }
}
