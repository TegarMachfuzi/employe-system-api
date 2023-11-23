package com.studydaily.employesystemapi.service;

import com.studydaily.employesystemapi.model.Employee;

import java.util.List;

public interface EmployeeService {
    Employee createEmployee(Employee employee);

    List<Employee> getAllemployees();
}
