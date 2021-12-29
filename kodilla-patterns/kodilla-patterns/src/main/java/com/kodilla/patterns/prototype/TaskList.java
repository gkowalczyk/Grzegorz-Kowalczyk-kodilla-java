package com.kodilla.patterns.prototype;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class TaskList {

    private final String name;
    private final List<Task> tasks = new ArrayList<>();

    public String getName() {
        return name;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public TaskList(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TaskList taskList = (TaskList) o;
        return name.equals(taskList.name) && tasks.equals(taskList.tasks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, tasks);
    }

    @Override
    public String toString() {
        String s = "    List [" + name + "]";
        for (Task task: tasks) {
            s = s + "\n" + task.toString();
        }
        return s;
    }
}
