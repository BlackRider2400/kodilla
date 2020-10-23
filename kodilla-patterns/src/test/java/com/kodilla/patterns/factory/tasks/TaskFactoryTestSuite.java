package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskFactoryTestSuite {

    @Test
    void testFactoryShoppingTask(){
        //Given
        TaskFactory taskFactory = new TaskFactory();
        Task task = taskFactory.makeTask(taskFactory.SHOPPING);

        //When & Then
        assertEquals(task.getTaskName(), "Shopping for dinner.");
    }

    @Test
    void testFactoryDrivingTask(){
        //Given
        TaskFactory taskFactory = new TaskFactory();
        Task task = taskFactory.makeTask(taskFactory.DRIVING);

        //When & Then
        assertEquals(task.getTaskName(), "Driving sister to friend.");
    }

    @Test
    void testFactoryPaintingTask(){
        //Given
        TaskFactory taskFactory = new TaskFactory();
        Task task = taskFactory.makeTask(taskFactory.PAINTING);

        //When & Then
        assertEquals(task.getTaskName(), "Painting my room.");
    }
}
