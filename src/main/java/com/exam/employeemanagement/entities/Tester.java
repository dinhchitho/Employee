package com.exam.employeemanagement.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tester")
public class Tester extends Employee  {
    private boolean automated;

    public Tester(String fistName, String lastName, double salary, boolean automated) {
        super(fistName, lastName, salary);
        this.automated = automated;
    }

    @ManyToOne
    private Employee tester;
}
