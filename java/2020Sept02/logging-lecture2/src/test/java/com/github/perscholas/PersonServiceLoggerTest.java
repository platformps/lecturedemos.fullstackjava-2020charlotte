package com.github.perscholas;

import com.github.perscholas.person.Person;
import com.github.perscholas.person.PersonService;
import com.github.perscholas.person.PersonServiceLogger;
import org.junit.Test;

/**
 * Created by leon on 9/2/2020.
 */
public class PersonServiceLoggerTest {
    @Test
    public void test() {
        // given
        PersonService personService = new PersonService();
        PersonServiceLogger personServiceLogger = new PersonServiceLogger(personService);
        Person person1 = new Person();
        person1.setId(1L);

        Person person2 = new Person();
        person1.setId(2L);

        // when
        personServiceLogger.create(person1);
        personServiceLogger.create(person2);

        // then
        // should expect some output to be logged

    }
}
