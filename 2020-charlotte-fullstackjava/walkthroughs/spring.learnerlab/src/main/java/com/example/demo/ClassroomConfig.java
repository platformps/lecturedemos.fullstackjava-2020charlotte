package com.example.demo;

import com.example.demo.domain.dtos.Classroom;
import com.example.demo.domain.repos.Instructors;
import com.example.demo.domain.repos.Students;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

/**
 * Created by leon on 9/9/2020.
 */
@Configuration
public class ClassroomConfig {

    @Bean
    public Classroom currentCohort(
            @Qualifier("currentInstructors") Instructors currentInstructors,
            @Qualifier("currentStudents") Students currentStudents) {
        return new Classroom(currentStudents, currentInstructors);
    }

    @Bean
    public Classroom previousCohort(
            @Qualifier("previousInstructors") Instructors previousInstructors,
            @Qualifier("previousStudents") Students previousStudents) {
        return new Classroom(previousStudents, previousInstructors);
    }
}
