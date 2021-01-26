package com.example.demo;

import com.example.demo.domain.repos.Students;
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
public class StudentsConfigTest {
    @Autowired
    @Qualifier("previousStudents")
    Students students1;

    @Autowired
    @Qualifier("currentStudents")
    Students students2;

    @Test
    public void test() {
        System.out.println(students1.toString());
        System.out.println(students2.toString());
    }
}
