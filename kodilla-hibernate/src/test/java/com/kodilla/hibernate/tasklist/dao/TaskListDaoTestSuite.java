package com.kodilla.hibernate.tasklist.dao;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
@SpringBootTest
 class TaskListDaoTestSuite {



        @Autowired
        private TaskListDao taskListDao;
        private static final String LISTNAME = "TEST LISTNAME";
        private static final String DESCRIPTION = "TEST DESCRIPTION";

        @Test
        void testFindByListName() {

            //given
            TaskList taskList = new TaskList(DESCRIPTION, LISTNAME);
            taskListDao.save(taskList);
            String listName = taskList.getListName();

            //when
            List<TaskList> readTaskList = taskListDao.findByListName(listName);

            //Then
            assertEquals(1, readTaskList.size());

            //CleanUp
            int id = readTaskList.get(0).getId();
            taskListDao.deleteById(id);
        }
    }

