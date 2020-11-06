package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

@SpringBootTest
public class TaskListDaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;

    private static final String LISTNAME = "ToDo";
    private static final String DESCRIPTION = "Testing description.";

    @Test
    void testFindByListName(){
        //Given
        TaskList taskList = new TaskList(LISTNAME, DESCRIPTION);
        taskListDao.save(taskList);
        int id = taskList.getId();

        //When
        List<TaskList> readTaskLists = taskListDao.findByListName(LISTNAME);

        //Then
        assertEquals(readTaskLists.size(), 1);

        //CleanUp
        taskListDao.deleteById(id);
    }
}
