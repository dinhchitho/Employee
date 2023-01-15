package com.exam.employeemanagement.repositories;

import com.exam.employeemanagement.entities.Developer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeveloperRepository extends JpaRepository<Developer, Long> {
}
