package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 8/4/2020.
 */
public class TestClassroom {
    @Test
    public void testLectureAsEducator() {
        // given
        Classroom classroom = Classroom.INSTANCE;
        Teacher educator = Educator.LEON;
        double numberOfHours = Students.getInstance().count();

        // when
        classroom.hostLecture(educator, numberOfHours);

        // then
        for(Student student : Students.getInstance()) {
            Assert.assertEquals(student.getTotalStudyTime(), 1, 0);
        }
    }

    @Test
    public void testLectureAsInstructor() {
        // given
        Classroom classroom = Classroom.INSTANCE;
        Teacher educator = Instructors.getInstance().findById(0L);
        double numberOfHours = Students.getInstance().count();

        // when
        classroom.hostLecture(educator, numberOfHours);

        // then
        for(Student student : Students.getInstance()) {
            Assert.assertEquals(student.getTotalStudyTime(), 1, 0);
        }
    }

    @Test
    public void leonLecture() {


    }
}
