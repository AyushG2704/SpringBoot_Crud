package com.first_project.crud.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Student {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String course;
    private int fee;
    public Student() {
        super();
    }
    public Student(Long id, String name, String course, int fee) {
        super();
        this.id = id;
        this.name = name;
        this.course = course;
        this.fee = fee;
    }
}
