package com.example.demo;

import com.example.demo.domain.repos.Instructors;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by leon on 9/9/2020.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class InstructorsConfigTest {
    @Autowired
    @Qualifier("previousInstructors")
    Instructors instructors1;

    @Autowired
    @Qualifier("currentInstructors")
    Instructors instructors2;

    @Autowired
    @Qualifier("allInstructors")
    Instructors instructors3;

    @Test
    public void test() {
        System.out.println(instructors1.toString());
        System.out.println(instructors2.toString());
        System.out.println(instructors3.toString());
    }
}
