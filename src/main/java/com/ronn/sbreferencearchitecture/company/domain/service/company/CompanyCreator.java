package com.ronn.sbreferencearchitecture.company.domain.service.company;

import com.ronn.sbreferencearchitecture.company.domain.model.Company;

import java.util.UUID;

public interface CompanyCreator {

  //TODO RONN do i have to create an abstract class insted? to make sure the outer layer use only my contract
  UUID create(Company company);
}
