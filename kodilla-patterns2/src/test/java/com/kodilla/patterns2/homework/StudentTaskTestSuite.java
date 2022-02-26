package com.kodilla.patterns2.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentTaskTestSuite {

    @Test
    void testUpdate() {
        Student student = new Student("Grzesiek");
        Student student1 = new Student("Klaudia");

        Mentor mentor = new Mentor("mentor1");
        Mentor mentor1 = new Mentor("mentor2");

        student.registerObserver(mentor);
        student1.registerObserver(mentor1);

        student.addTask("Moduł 1");
        student.addTask("Moduł 2");

        student1.addTask("Moduł 1");
        student1.addTask("Moduł 2");

        assertEquals(2, mentor.getUpdateCount());
        assertEquals(2, mentor1.getUpdateCount());
            }
}
