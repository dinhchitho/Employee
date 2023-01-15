package com.exam.employeemanagement.services.impl;

import com.exam.employeemanagement.entities.Developer;
import com.exam.employeemanagement.entities.Employee;
import com.exam.employeemanagement.entities.Tester;
import com.exam.employeemanagement.repositories.DeveloperRepository;
import com.exam.employeemanagement.services.DeveloperService;
import com.exam.employeemanagement.utils.Calculator;
import com.exam.employeemanagement.utils.Sort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Service
@RequiredArgsConstructor
public class DeveloperServiceImpl implements DeveloperService {

    private final DeveloperRepository developerRepository;

    /**
     *
     * @return boolean
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public boolean initSaveDev() {
        List<Developer> developers = developerRepository.saveAll(Arrays.asList(
                new Developer("A","Nguyen",100.500,"Java"),
                new Developer("B","Nguyen",502.300,"C#"),
                new Developer("C","Nguyen",305.210,"JavaScript"),
                new Developer("D","Nguyen",49.006,"Python"),
                new Developer("E","Nguyen",70.008,"GO")
        ));
        return developers.size() > 0;
    }

}
