package com.ronn.sbreferencearchitecture.company.domain.service.company;

import com.ronn.sbreferencearchitecture.company.domain.model.Company;

import java.util.UUID;

public interface CompanyCreator {

  UUID create(Company company);
}
