package com.ronn.sbreferencearchitecture.company.application.service;

import com.ronn.sbreferencearchitecture.company.application.exception.model.EmployeeNotFound;
import com.ronn.sbreferencearchitecture.company.application.util.UUIDUtils;
import com.ronn.sbreferencearchitecture.company.domain.model.Employee;
import com.ronn.sbreferencearchitecture.company.infrastructure.api.mapper.EmployeeMapper;
import com.ronn.sbreferencearchitecture.company.infrastructure.persistence.dao.EmployeeDAO;
import com.ronn.sbreferencearchitecture.company.infrastructure.persistence.model.EmployeeDTO;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class EmployeeService {

  private final EmployeeDAO employeeRepo;

  public EmployeeService(EmployeeDAO employeeRepo) {
    this.employeeRepo = employeeRepo;
  }

  public List<EmployeeDTO> findAll(Pageable pageable) {
    List<Employee> employees = employeeRepo.findAll(pageable).toList();

    return EmployeeMapper.fromEmployees(employees);
  }

  public EmployeeDTO findBy(String id) {
    return EmployeeMapper.fromEmployee(
        employeeRepo.findById(UUIDUtils.from(id))
            .orElseThrow(() -> new EmployeeNotFound(id))
    );
  }

  public UUID create(EmployeeDTO dto) {
    dto.setId(UUID.randomUUID().toString());

    return employeeRepo.save(EmployeeMapper.toEmployee(dto)).getId();
  }

  public void delete(String id){
    employeeRepo.deleteById(UUIDUtils.from(id));
  }

  public void update(EmployeeDTO dto) {
    employeeRepo.save(EmployeeMapper.toEmployee(dto));
  }
}
