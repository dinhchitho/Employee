package com.exam.employeemanagement.services.impl;

import com.exam.employeemanagement.entities.Employee;
import com.exam.employeemanagement.repositories.EmployeeRepository;
import com.exam.employeemanagement.services.EmployeeService;
import com.exam.employeemanagement.utils.Calculator;
import com.exam.employeemanagement.utils.Sort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    public List<Employee> up10PercentSalary() {
        List<Employee> employees = employeeRepository.findAll();
        List<Employee> saveAll = null;
        if (employees.size() == 0) return null;
        saveAll = new ArrayList<>();
        for (Employee employee:employees
        ) {
            double up10percent =employee.getSalary() * Calculator.mul(10, 100);
            double value = employee.getSalary() + up10percent;
            employee.setSalary(value);
            saveAll.add(employee);
        }
        return employeeRepository.saveAll(saveAll);
    }

    @Override
    public boolean delete2EmployeeSalaryLowestMonthly() {
        List<Employee> employees = employeeRepository.findAll();
        if (employees.size() <= 2) return false;
        //sort by salary
        employees.sort(new Sort());
        employees.subList(0, employees.size() - 2).clear();
        employeeRepository.deleteAll(employees);
        return true;
    }
}
