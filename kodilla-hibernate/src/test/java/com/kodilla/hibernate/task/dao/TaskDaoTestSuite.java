package com.kodilla.hibernate.task.dao;

import net.bytebuddy.agent.builder.AgentBuilder;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest

 class TaskDaoTestSuite {
    private static final String DESCRIPTION = "Test : Learn Hibernate";

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

}
