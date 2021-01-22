package com.github.curriculeon;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by leon on 8/4/2020.
 */
public enum Classroom {
    INSTANCE;

    private Students students = Students.getInstance();
    private Instructors instructors = Instructors.getInstance();

    public void hostLecture(Teacher teacher, double numberOfHours) {
        teacher.lecture(students.toArray(), numberOfHours);
    }

    public void hostLecture(Long instructorId, double numberOfHours) {
        Teacher teacherToLectureToStudents = instructors.findById(instructorId);
        hostLecture(teacherToLectureToStudents, numberOfHours);
    }

    public Map<Student, Double> getStudyMap() {
        Map<Student, Double> map = new HashMap<>();
        for(Student student : students) {
            map.put(student, student.getTotalStudyTime());
        }
        return map;
    }


//    alternative implementation
//    public Map<Student, Double> getStudyMap() {
//        Map<Student, Double> map = new HashMap<>();
//        for(Student student : students) {
//            map.put(student, student.getTotalStudyTime());
//        }
//        return students
//                .personList
//                .stream()
//                .collect(Collectors.toMap(student -> student, Student::getTotalStudyTime));
//    }

}
