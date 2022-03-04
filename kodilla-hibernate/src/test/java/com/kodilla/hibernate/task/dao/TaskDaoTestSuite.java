package com.kodilla.hibernate.task.dao;

import com.kodilla.hibernate.taskfinancial.TaskFinancialDetails;
import com.kodilla.hibernate.tasklist.dao.TaskList;
import com.kodilla.hibernate.tasklist.dao.TaskListDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

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
        int id = task.getId();
        Optional<Task> readTask = taskDao.findById(id);
        System.out.println("ID===========" + id);
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
        assertEquals(1, readTasks.size());
        System.out.println("duration=============="+ duration);
        System.out.println("readtasks==============" + readTasks);
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
        Task task = new Task("Test 1", 14);
        Task task1 = new Task("Test 2", 10);
        TaskFinancialDetails tfd = new TaskFinancialDetails(new BigDecimal(20), false);
        TaskFinancialDetails tfd2 = new TaskFinancialDetails(new BigDecimal(10), false);
        task.setTaskFinancialDetails(tfd);
        task1.setTaskFinancialDetails(tfd2);
        TaskList taskList = new TaskList(LISTNAME, "To Do tasks");
        taskList.getTasks().add(task);
        taskList.getTasks().add(task1);
        task.setTaskList(taskList);
        task1.setTaskList(taskList);
        //when
        taskListDao.save(taskList);
        int id = taskList.getId();
        //then
        assertNotEquals(0, id);
//cleanUp
        taskListDao.deleteById(id);
    }

    @Test
    void testNamedQueries() {
        //Given
        Task task1 = new Task("Test: Study Hibernate", 3);
        Task task2 = new Task("Test: Practice Named Queries", 6);
        Task task3 = new Task("Test: Study native queries", 7);
        Task task4 = new Task("Test: Makse some tests", 13);

        TaskFinancialDetails tfd1 = new TaskFinancialDetails(new BigDecimal(5), false);
        TaskFinancialDetails tfd2 = new TaskFinancialDetails(new BigDecimal(10), false);
        TaskFinancialDetails tfd3 = new TaskFinancialDetails(new BigDecimal(20), false);
        TaskFinancialDetails tfd4 = new TaskFinancialDetails(new BigDecimal(15), false);

        task1.setTaskFinancialDetails(tfd1);
        task2.setTaskFinancialDetails(tfd2);
        task3.setTaskFinancialDetails(tfd3);
        task4.setTaskFinancialDetails(tfd4);

        TaskList taskList = new TaskList("TODO", "ToDo tasks");
        taskList.getTasks().add(task1);
        taskList.getTasks().add(task2);
        taskList.getTasks().add(task3);
        taskList.getTasks().add(task4);

        task1.setTaskList(taskList);
        task2.setTaskList(taskList);
        task3.setTaskList(taskList);
        task4.setTaskList(taskList);

        taskListDao.save(taskList);
        int id = taskList.getId();

        //When
        List<Task> longTasks = taskDao.retrieveLongTasks();
        List<Task> shortTasks = taskDao.retrieveShortTasks();
        List<Task> enoughTimeTasks = taskDao.retrieveTasksWithEnoughTime();
        List<Task> durationLongerThanTasks = taskDao.retrieveTasksWithDurationLongerThan(6);
        //Then
        try {
            assertEquals(1, longTasks.size());
            assertEquals(3, shortTasks.size());
            assertEquals(3, enoughTimeTasks.size());
            assertEquals(2,durationLongerThanTasks.size());
        } finally {
            //CleanUp
            taskListDao.deleteById(id);
        }

    }
}
