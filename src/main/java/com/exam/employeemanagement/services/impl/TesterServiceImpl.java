package com.exam.employeemanagement.services.impl;

import com.exam.employeemanagement.entities.Employee;
import com.exam.employeemanagement.entities.Tester;
import com.exam.employeemanagement.repositories.EmployeeRepository;
import com.exam.employeemanagement.repositories.TesterRepository;
import com.exam.employeemanagement.services.TesterService;
import com.exam.employeemanagement.utils.Calculator;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
@RequiredArgsConstructor
public class TesterServiceImpl implements TesterService  {

    private final TesterRepository testerRepository;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public boolean initSaveTester() {
        List<Tester> testers = testerRepository.saveAll(Arrays.asList(
                new Tester("Ha","Nguyen",10.600,true),
                new Tester("Chau","Dinh",500.000,false),
                new Tester("Trinh","Le",300.000,true),
                new Tester("Hanh","Phu",400.000,false),
                new Tester("Thien","Nguyen",700.000,true)
        ));
        return testers.size() > 0;
    }
}
