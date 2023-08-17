package com.kodilla.spring.portfolio1;

import org.springframework.context.annotation.Configuration;

@Configuration
public class BoardConfig {

    public Boards boards() {
        return new Boards(taskListsToDo(), taskListsDone(), taskListsInProgress());
    }

    public TaskLists taskListsToDo() {
        return new TaskLists();

    }
    public TaskLists taskListsDone() {
        return new TaskLists();

    }
    public TaskLists taskListsInProgress() {
        return new TaskLists();

    }
}
