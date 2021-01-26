package com.example.demo;

import com.example.demo.domain.model.Instructor;
import com.example.demo.domain.repos.Instructors;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * Created by leon on 9/9/2020.
 */
@Configuration
public class InstructorsConfig {
    @Bean
    public Instructors previousInstructors() {
        return new Instructors(
                new Instructor(0L, "Hunter"),
                new Instructor(1L, "Haseeb"),
                new Instructor(2L, "Shahparan"));
    }

    @Bean
    public Instructors currentInstructors() {
        return new Instructors(
                new Instructor(3L, "Leon"),
                new Instructor(4L, "Muhammad"),
                new Instructor(5L, "Ahm"));
    }

    @Bean
    @Primary
    public Instructors allInstructors(
            @Qualifier("previousInstructors") Instructors prevInstructors,
            @Qualifier("currentInstructors") Instructors currInstructors) {
        Instructors allInstructors = new Instructors();
        prevInstructors.forEach(allInstructors::add);
        currInstructors.forEach(allInstructors::add);
        return allInstructors;
    }
}
