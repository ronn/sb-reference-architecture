package com.ronn.sbreferencearchitecture.company.infrastructure.api.mapper;

import com.ronn.sbreferencearchitecture.company.domain.model.Company;
import com.ronn.sbreferencearchitecture.company.infrastructure.api.model.request.CompanyRequest;
import com.ronn.sbreferencearchitecture.company.infrastructure.api.model.response.CompanyResponse;
import com.ronn.sbreferencearchitecture.shared.util.UUIDUtils;

import java.util.Collections;
import java.util.List;
import java.util.UUID;

import static java.util.stream.Collectors.toList;

public final class CompanyMapper {

  public static Company toCompany(CompanyRequest req) {
    return new Company(
        null != req.getId() ? UUIDUtils.from(req.getId()) : UUID.randomUUID(),
        req.getName(),
        Collections.emptyList()
    );
  }

  public static CompanyResponse fromCompany(Company company) {
    return new CompanyResponse(
        company.getId().toString(),
        company.getName()
    );
  }

  public static List<CompanyResponse> fromCompanies(List<Company> companies) {
    return companies.stream()
        .map(CompanyMapper::fromCompany)
        .collect(toList());
  }
}
