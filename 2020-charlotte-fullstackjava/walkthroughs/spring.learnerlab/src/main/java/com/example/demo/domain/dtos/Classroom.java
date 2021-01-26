package com.example.demo.domain.dtos;

import com.example.demo.domain.model.Student;
import com.example.demo.domain.model.Teacher;
import com.example.demo.domain.repos.Instructors;
import com.example.demo.domain.repos.Students;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by leon on 7/27/2020.
 */
public class Classroom {
    private Students students;
    private Instructors instructors;

    public Classroom(Students students, Instructors instructors) {
        this.students = students;
        this.instructors = instructors;
    }

    public void hostLecture(Teacher teacher, Double numberOfHours) {
        teacher.lecture(students.toArray(), numberOfHours);
    }

    public void hostLecture(long id, double numberOfHours) {
        Teacher instructor = instructors.findById(id);
        instructor.lecture(students.toArray(), numberOfHours);
    }

    public Map<Student, Double> getStudyMap() {
        Map<Student, Double> result = new HashMap<>();
        for(Student student : students.toArray()) {
            Double studyTime = student.getTotalStudyTime();
            result.put(student, studyTime);
        }
        return result;
    }

    public Students getStudents() {
        return students;
    }

    public void setStudents(Students students) {
        this.students = students;
    }

    public Instructors getInstructors() {
        return instructors;
    }

    public void setInstructors(Instructors instructors) {
        this.instructors = instructors;
    }
}
