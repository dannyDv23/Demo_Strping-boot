package com.example.demo.controllers;

import com.example.demo.model.Student;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
@Service
public class StudentService {
    public List<Student> getStudents(){
        return List.of(
                new Student(
                        1L,
                        "Dat",
                        "choecl263@gmail.com",
                        LocalDate.of(2003, Month.MARCH, 26),
                        21
                )
        );
    }

}
