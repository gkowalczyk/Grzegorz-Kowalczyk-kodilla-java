package com.com.kodilla.spring.portfolio;

import com.kodilla.spring.library.Library;
import com.kodilla.spring.library.LibraryDbController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BoardConfig {

    @Bean
    public Board board() {
        return new Board(getToDoList(), getInProgressList(), getDoneList());
    }

    public TaskList getToDoList() {
        return new TaskList();
    }

    public TaskList getInProgressList() {
        return new TaskList();
    }

    public TaskList getDoneList() {
        return new TaskList();
    }
}