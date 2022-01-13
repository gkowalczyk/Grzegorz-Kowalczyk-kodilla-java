package com.kodilla.hibernate.task.dao;

import com.kodilla.hibernate.taskfinancial.TaskFinancialDetails;
import com.kodilla.hibernate.tasklist.dao.TaskList;
import com.kodilla.hibernate.tasklist.dao.TaskListDao;
import net.bytebuddy.agent.builder.AgentBuilder;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest

 class TaskDaoTestSuite {
    @Autowired
    private TaskListDao taskListDao;
    private static final String DESCRIPTION = "Test : Learn Hibernate";
    private static final String LISTNAME = "TEST LISTNAME";
@Autowired
    private TaskDao taskDao; // referencja do kontorlera repozytorium

    @Test
    void testTaskDaoSave() {
        //given
        Task task = new Task(DESCRIPTION, 7);

        //when

        taskDao.save(task);
        //then
        int id  = task.getId();
        Optional<Task> readTask = taskDao.findById(id);
        assertTrue(readTask.isPresent());
        //cleanUp
        taskDao.deleteById(id);
    }
    @Test
    void testTaskDaoFindByDuration() {
        //given
        Task task = new Task(DESCRIPTION, 7);
        taskDao.save(task);
        int duration = task.getDuration();
        //when
        List<Task> readTasks = taskDao.findByDuration(duration);
        //Then
        assertEquals(1,readTasks.size());

        //cleanUp
        int id = readTasks.get(0).getId();
        taskDao.deleteById(id);
    }
    @Test
    void testTaskDaoSaveWithFinancialDetails() {
        //Given
        Task task = new Task(DESCRIPTION, 30);
        task.setTaskFinancialDetails(new TaskFinancialDetails(new BigDecimal(120), false));
        //when
        taskDao.save(task);
        int id = task.getId();
        //then
        assertEquals(0, id);
    }
    @Test
    void testTaskListDaoSaveWithTasks() {
        //given
        Task task = new Task("Test 1",14);
        Task task1 = new Task("Test 2",10);
        TaskFinancialDetails tfd = new TaskFinancialDetails(new BigDecimal(20),false);
        TaskFinancialDetails tfd2 = new TaskFinancialDetails(new BigDecimal(10),false);
        task.setTaskFinancialDetails(tfd);
        task1.setTaskFinancialDetails(tfd2);
        TaskList taskList = new TaskList(LISTNAME,"To Do tasks");
        taskList.getTasks().add(task);
        taskList.getTasks().add(task1);
        task.setTaskList(taskList);
        task1.setTaskList(taskList);
        //when
        taskListDao.save(taskList);
        int id = taskList.getId();
        //then
        assertNotEquals(0,id);
//cleanUp
        taskListDao.deleteById(id);
    }
}
