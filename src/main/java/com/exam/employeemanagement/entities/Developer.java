package com.exam.employeemanagement.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "developer")
public class Developer extends Employee {
    private String programmingLanguage;


    public Developer(String fistName, String lastName, double salary, String programmingLanguage) {
        super(fistName, lastName, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @ManyToOne
//    @JoinColumn(name = "dev_id")
    private Employee developer;

}
