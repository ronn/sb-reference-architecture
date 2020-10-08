package com.ronn.sbreferencearchitecture.company.infrastructure.api.controller.reading;

import com.ronn.sbreferencearchitecture.company.domain.model.Company;
import com.ronn.sbreferencearchitecture.company.domain.service.company.CompanyFinder;
import com.ronn.sbreferencearchitecture.company.infrastructure.api.mapper.CompanyMapper;
import com.ronn.sbreferencearchitecture.company.infrastructure.api.model.response.CompanyResponse;
import com.ronn.sbreferencearchitecture.shared.util.UUIDUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/company")
public class CompanyReadingController {

  private final CompanyFinder companyFinder;

  public CompanyReadingController(CompanyFinder companyFinder) {
    this.companyFinder = companyFinder;
  }

  @GetMapping
  public ResponseEntity<List<CompanyResponse>> getAll(@RequestParam int page, @RequestParam int size) {
    List<Company> companies = companyFinder.getAll(page, size);
    List<CompanyResponse> companyResponses = CompanyMapper.fromCompanies(companies);

    return ResponseEntity.ok(companyResponses);
  }

  @GetMapping("/{id}")
  public ResponseEntity<CompanyResponse> getOne(@PathVariable String id) {
    Optional<CompanyResponse> company = companyFinder.find(UUIDUtils.from(id))
        .map(CompanyMapper::fromCompany);

    return ResponseEntity.of(company);
  }
}
