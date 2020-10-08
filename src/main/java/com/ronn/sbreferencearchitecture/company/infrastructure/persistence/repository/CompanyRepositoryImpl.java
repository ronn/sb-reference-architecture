package com.ronn.sbreferencearchitecture.company.infrastructure.persistence.repository;

import com.ronn.sbreferencearchitecture.company.domain.model.Company;
import com.ronn.sbreferencearchitecture.company.domain.model.Employee;
import com.ronn.sbreferencearchitecture.company.domain.repo.CompanyRepository;
import com.ronn.sbreferencearchitecture.company.infrastructure.persistence.dao.CompanyDAO;
import com.ronn.sbreferencearchitecture.company.infrastructure.persistence.dao.EmployeeDAO;
import com.ronn.sbreferencearchitecture.company.infrastructure.persistence.mapper.CompanyMapper;
import com.ronn.sbreferencearchitecture.company.infrastructure.persistence.mapper.EmployeeMapper;
import com.ronn.sbreferencearchitecture.company.infrastructure.persistence.model.CompanyDTO;
import com.ronn.sbreferencearchitecture.company.infrastructure.persistence.model.EmployeeDTO;
import com.ronn.sbreferencearchitecture.shared.util.UUIDUtils;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public class CompanyRepositoryImpl implements CompanyRepository {

  private final CompanyDAO companyDAO;
  private final EmployeeDAO employeeDAO;

  public CompanyRepositoryImpl(CompanyDAO companyDAO, EmployeeDAO employeeDAO) {
    this.companyDAO = companyDAO;
    this.employeeDAO = employeeDAO;
  }

  @Override
  public Optional<Company> find(UUID id) {
    return companyDAO.findById(id.toString())
        .map(CompanyMapper::toCompany);
  }

  @Override
  public List<Company> getAll(int page, int size) {
    PageRequest pageRequest = PageRequest.of(page, size);
    List<CompanyDTO> dtos = companyDAO.findAll(pageRequest).toList();

    return CompanyMapper.toCompanies(dtos);
  }

  @Override
  public UUID save(Company company) {
    CompanyDTO companyDTO = CompanyMapper.fromCompany(company);
    String id = companyDAO.save(companyDTO).getId();

    return UUIDUtils.from(id);
  }

  @Override
  public Optional<Employee> findEmployee(UUID id) {
    return employeeDAO.findById(id.toString())
        .map(EmployeeMapper::toEmployee);
  }

  @Override
  public List<Employee> getAllEmployees(int page, int size) {
    PageRequest pageRequest = PageRequest.of(page, size);
    List<EmployeeDTO> dtos = employeeDAO.findAll(pageRequest).toList();

    return EmployeeMapper.toEmployees(dtos);
  }

  @Override
  public UUID save(Employee employee) {
    EmployeeDTO employeeDTO = EmployeeMapper.fromEmployee(employee);
    String id = employeeDAO.save(employeeDTO).getId();

    return UUIDUtils.from(id);
  }
}
