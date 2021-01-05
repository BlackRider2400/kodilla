package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentHomeWorksTestSuite {

    @Test
    void testUpdate(){
        //Given
        StudentHomeWorks john = new StudentHomeWorks("John Smith");
        StudentHomeWorks max = new StudentHomeWorks("Max Brown");
        StudentHomeWorks alex = new StudentHomeWorks("Alex Smith");
        TeacherHomeWork bill = new TeacherHomeWork("Bill");
        TeacherHomeWork peter = new TeacherHomeWork("Peter");
        john.registerTeacher(bill);
        max.registerTeacher(bill);
        alex.registerTeacher(peter);
        //When
        john.addHomeWork("Poem about tree.");
        john.addHomeWork("Poem about rock.");
        john.addHomeWork("Poem about river.");
        max.addHomeWork("Poem about hardness of live.");
        max.addHomeWork("Poem about wife.");
        alex.addHomeWork("Poem about Poland.");
        //Then
        assertEquals(peter.getUpdatesCount(), 1);
        assertEquals(bill.getUpdatesCount(), 5);
    }
}