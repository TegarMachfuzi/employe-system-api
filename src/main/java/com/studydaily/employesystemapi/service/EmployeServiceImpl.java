package com.studydaily.employesystemapi.service;

import com.studydaily.employesystemapi.entity.EmployeeEntity;
import com.studydaily.employesystemapi.model.Employee;
import com.studydaily.employesystemapi.repository.EmployeeRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class EmployeServiceImpl implements EmployeeService{

    private EmployeeRepository employeeRepository;

    public EmployeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Employee createEmployee(Employee employee) {

        EmployeeEntity employeeEntity = new EmployeeEntity();

        BeanUtils.copyProperties(employee, employeeEntity);
        employeeRepository.save(employeeEntity);
        return employee;
    }
}
