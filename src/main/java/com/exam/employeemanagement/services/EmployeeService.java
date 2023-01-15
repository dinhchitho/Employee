package com.exam.employeemanagement.services;

import com.exam.employeemanagement.entities.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> up10PercentSalary();

    boolean delete2EmployeeSalaryLowestMonthly();
}
