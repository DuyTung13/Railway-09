package com.example.railway_lab_department.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Department {

    private String name;
    private Long ID;

    public void setId(Long ID) {
        this.ID = ID;
    }

    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
