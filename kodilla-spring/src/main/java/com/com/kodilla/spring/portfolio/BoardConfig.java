package com.com.kodilla.spring.portfolio;

import com.kodilla.spring.library.Library;
import com.kodilla.spring.library.LibraryDbController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BoardConfig {
    @Autowired
    @Qualifier("toDoList") private TaskList toDoList;

    @Autowired
    @Qualifier ("inProgressList") private TaskList inProgressList;

    @Autowired
    @Qualifier ("doneList") private TaskList doneList;

    @Bean
    public Board board() {
        return new Board(getToDoList(), getInProgressList(), getDoneList());
    }
    @Bean (name="toDoList")
    @Scope("prototype")
    public TaskList getToDoList() {
        return new TaskList();
    }
    @Bean (name="inProgressList")
    @Scope("prototype")
    public TaskList getInProgressList() {
        return new TaskList();
    }
    @Bean (name="doneList")
    @Scope("prototype")
    public TaskList getDoneList() {
        return new TaskList();
    }
}