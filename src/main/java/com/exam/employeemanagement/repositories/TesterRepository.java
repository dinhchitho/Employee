package com.exam.employeemanagement.repositories;

import com.exam.employeemanagement.entities.Tester;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TesterRepository extends JpaRepository<Tester, Long> {
}
