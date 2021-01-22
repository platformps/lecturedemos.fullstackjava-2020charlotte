package com.github.perscholas;

import com.github.perscholas.person.Person;
import com.github.perscholas.person.PersonServiceImpl;
import com.github.perscholas.person.PersonServiceLogger;
import org.junit.Test;

import java.io.IOException;
import java.util.logging.*;

/**
 * Created by leon on 9/2/2020.
 */
public class PersonServiceLoggerTest {
    @Test
    public void testInfoLogging() {
        // given
        PersonServiceImpl personService = new PersonServiceImpl();
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

    @Test
    public void testConfiguredLogging() {
        // given
        PersonServiceImpl personService = new PersonServiceImpl();
        PersonServiceLogger personServiceLogger = new PersonServiceLogger(personService);
        personServiceLogger.getLogger().setLevel(Level.SEVERE);

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

    @Test
    public void testNoParentInfoConsoleHandlerLogging() {
        // given
        PersonServiceImpl personService = new PersonServiceImpl();
        PersonServiceLogger personServiceLogger = new PersonServiceLogger(personService);
        personServiceLogger.getLogger().setLevel(Level.INFO);
        personServiceLogger.getLogger().setUseParentHandlers(false);
        personServiceLogger.getLogger().addHandler(new ConsoleHandler());

        Person person1 = new Person();
        person1.setId(1L);

        Person person2 = new Person();
        person1.setId(2L);

        // when
        personServiceLogger.create(person1);
    }


    @Test
    public void testNoParentInfoFileHandlerLogging() throws IOException {
        // given
        PersonServiceImpl personService = new PersonServiceImpl();
        PersonServiceLogger personServiceLogger = new PersonServiceLogger(personService);
        personServiceLogger.getLogger().setLevel(Level.INFO);
        personServiceLogger.getLogger().setUseParentHandlers(false);
        personServiceLogger.getLogger().addHandler(new FileHandler("./target/log-file-" + System.nanoTime() + ".xml"));

        Person person1 = new Person();
        person1.setId(1L);

        Person person2 = new Person();
        person1.setId(2L);

        // when
        personServiceLogger.create(person1);
    }


    @Test
    public void testNoParentInfoFileHandlerSimpleFormattedLogging() throws IOException {
        // given
        PersonServiceImpl personService = new PersonServiceImpl();
        PersonServiceLogger personServiceLogger = new PersonServiceLogger(personService);
        personServiceLogger.getLogger().setLevel(Level.INFO);
        personServiceLogger.getLogger().setUseParentHandlers(false);

        String logFilePath = "./target/log-file-" + System.nanoTime() + ".txt";
        Formatter formatter = new SimpleFormatter();
        Handler fileHandler = new FileHandler(logFilePath);
        fileHandler.setFormatter(formatter);
        personServiceLogger.getLogger().addHandler(fileHandler);

        Person person1 = new Person();
        person1.setId(1L);

        Person person2 = new Person();
        person1.setId(2L);

        // when
        personServiceLogger.create(person1);
    }

    @Test
    public void testNoParentInfoFileHandlerXmlFormattedLogging() throws IOException {
        // given
        PersonServiceImpl personService = new PersonServiceImpl();
        PersonServiceLogger personServiceLogger = new PersonServiceLogger(personService);
        personServiceLogger.getLogger().setLevel(Level.INFO);
        personServiceLogger.getLogger().setUseParentHandlers(false);

        String logFilePath = "./target/log-file-" + System.nanoTime() + ".xml";
        Formatter formatter = new XMLFormatter();
        Handler fileHandler = new FileHandler(logFilePath);
        fileHandler.setFormatter(formatter);
        personServiceLogger.getLogger().addHandler(fileHandler);

        Person person1 = new Person();
        person1.setId(1L);

        Person person2 = new Person();
        person1.setId(2L);

        // when
        personServiceLogger.create(person1);
        personServiceLogger.create(person2);
    }

}
