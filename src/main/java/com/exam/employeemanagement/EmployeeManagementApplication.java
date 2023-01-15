package com.exam.employeemanagement;

import com.exam.employeemanagement.services.DeveloperService;
import com.exam.employeemanagement.services.EmployeeService;
import com.exam.employeemanagement.services.TesterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeeManagementApplication implements CommandLineRunner {

	@Autowired
	private DeveloperService developerService;
	@Autowired
	private TesterService testerService;

	@Autowired
	private EmployeeService employeeService;

	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagementApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//Create 5 Developer objects and save them into the database.
		developerService.initSaveDev();
		//Create 5 Tester objects and save them into the database.
		testerService.initSaveTester();
		//Give each employee a 10% raise and save them into the database again.
		employeeService.up10PercentSalary();
		//Delete 2 employees that have the lowest monthly salary from the database.
		employeeService.delete2EmployeeSalaryLowestMonthly();
	}
}
