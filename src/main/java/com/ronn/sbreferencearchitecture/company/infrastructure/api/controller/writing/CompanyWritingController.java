package com.ronn.sbreferencearchitecture.company.infrastructure.api.controller.writing;

import com.ronn.sbreferencearchitecture.company.domain.model.Company;
import com.ronn.sbreferencearchitecture.company.domain.service.company.CompanyCreator;
import com.ronn.sbreferencearchitecture.company.infrastructure.api.mapper.CompanyMapper;
import com.ronn.sbreferencearchitecture.company.infrastructure.api.model.request.CompanyRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.UUID;

@RestController
@RequestMapping("/company")
public class CompanyWritingController extends BaseController {

  private final CompanyCreator companyCreator;

  public CompanyWritingController(CompanyCreator companyCreator) {
    this.companyCreator = companyCreator;
  }

  @PostMapping
  private ResponseEntity<UUID> create(@Valid @RequestBody CompanyRequest request) {
    Company company = CompanyMapper.toCompany(request);
    UUID uuid = companyCreator.create(company);

    return build(uuid);
  }
}
