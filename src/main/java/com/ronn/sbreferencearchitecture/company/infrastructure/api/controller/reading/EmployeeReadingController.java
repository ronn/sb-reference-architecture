package com.ronn.sbreferencearchitecture.company.infrastructure.api.controller.reading;

import com.ronn.sbreferencearchitecture.company.domain.model.Employee;
import com.ronn.sbreferencearchitecture.company.domain.service.employee.EmployeeFinder;
import com.ronn.sbreferencearchitecture.company.infrastructure.api.controller.writing.BaseController;
import com.ronn.sbreferencearchitecture.company.infrastructure.api.mapper.EmployeeMapper;
import com.ronn.sbreferencearchitecture.company.infrastructure.api.model.response.EmployeeResponse;
import com.ronn.sbreferencearchitecture.shared.util.UUIDUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employee")
public class EmployeeReadingController extends BaseController {

  private final EmployeeFinder employeeFinder;

  public EmployeeReadingController(EmployeeFinder employeeFinder) {
    this.employeeFinder = employeeFinder;
  }

  @GetMapping
  public ResponseEntity<List<EmployeeResponse>> getAll(@RequestParam int page, @RequestParam int size) {
    List<Employee> employees = employeeFinder.getAll(page, size);
    List<EmployeeResponse> employeesResponse = EmployeeMapper.fromEmployees(employees);

    return ResponseEntity.ok(employeesResponse);
  }

  @GetMapping("/{id}")
  public ResponseEntity<EmployeeResponse> getOne(@PathVariable String id) {
    Optional<EmployeeResponse> employee = employeeFinder.find(UUIDUtils.from(id))
        .map(EmployeeMapper::fromEmployee);

    return ResponseEntity.of(employee);
  }
}
