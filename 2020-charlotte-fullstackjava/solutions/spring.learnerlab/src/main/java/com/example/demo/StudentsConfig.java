package com.example.demo;

import com.example.demo.domain.model.Student;
import com.example.demo.domain.repos.Students;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by leon on 9/9/2020.
 */
@Configuration
public class StudentsConfig {
    @Bean
    public Students previousStudents() {
        return new Students(
                new Student(0L, "Fernando"),
                new Student(1L, "Tiery"),
                new Student(2L, "Susan"));
    }

    @Bean
    public Students currentStudents() {
        return new Students(
                new Student(0L, "Chris"),
                new Student(1L, "Deepti"),
                new Student(2L, "Yirchott"));
    }


}
