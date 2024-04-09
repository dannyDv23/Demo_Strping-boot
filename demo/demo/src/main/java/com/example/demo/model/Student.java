package com.example.demo.model;

import java.time.LocalDate;

public class Student {
    private Long id;
    private String name;
    private String eamil;
    private LocalDate date;
    private Integer age;

    public Student(Long id, String name, String eamil, LocalDate date, Integer age) {
        this.id = id;
        this.name = name;
        this.eamil = eamil;
        this.date = date;
        this.age = age;
    }

    public Student( String name, String eamil, LocalDate date, Integer age) {
        this.name = name;
        this.eamil = eamil;
        this.date = date;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEamil() {
        return eamil;
    }

    public void setEamil(String eamil) {
        this.eamil = eamil;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", eamil='" + eamil + '\'' +
                ", date=" + date +
                ", age=" + age +
                '}';
    }
}
