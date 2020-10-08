package com.ronn.sbreferencearchitecture.company.infrastructure.persistence.mapper;

import com.ronn.sbreferencearchitecture.company.domain.model.Company;
import com.ronn.sbreferencearchitecture.company.infrastructure.persistence.model.CompanyDTO;
import com.ronn.sbreferencearchitecture.shared.util.UUIDUtils;

import java.util.Collections;
import java.util.List;
import java.util.UUID;

import static java.util.stream.Collectors.toList;

public class CompanyMapper {

  public static Company toCompany(CompanyDTO dto) {
    return new Company(
        null != dto.getId() ? UUIDUtils.from(dto.getId()) : UUID.randomUUID(),
        dto.getName(),
        Collections.emptyList()
    );
  }

  public static CompanyDTO fromCompany(Company company) {
    return new CompanyDTO(
        company.getId().toString(),
        company.getName()
    );
  }

  public static List<Company> toCompanies(List<CompanyDTO> dtos) {
    return dtos.stream()
        .map(CompanyMapper::toCompany)
        .collect(toList());
  }

  public static List<CompanyDTO> fromCompanies(List<Company> companies) {
    return companies.stream()
        .map(CompanyMapper::fromCompany)
        .collect(toList());
  }
}
