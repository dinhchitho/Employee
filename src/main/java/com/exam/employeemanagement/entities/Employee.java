package com.exam.employeemanagement.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
//@MappedSuperclass
@Inheritance(strategy = InheritanceType.JOINED)
@Entity
@Table(name = "employee")
public abstract class Employee implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fistName;

    private String lastName;

    private double salary;

    public Employee(String fistName, String lastName, double salary) {
        this.fistName = fistName;
        this.lastName = lastName;
        this.salary = salary;
    }

    @OneToMany(mappedBy = "developer",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<Developer> developers = new ArrayList<>();

    @OneToMany(mappedBy = "tester",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<Tester> testers = new ArrayList<>();
}


