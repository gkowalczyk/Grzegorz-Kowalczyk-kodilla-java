package com.kodilla.stream.portfolio;

import java.util.LinkedList;
import java.util.List;

public class TaskList {

    private final List<Task> tasks = new LinkedList<>();
    private final String name;



    public TaskList(String name) {
        this.name = name;
    }

    public List<Task> getTasks() {
        return new LinkedList<>(tasks);
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "TaskList{" +
                "tasks=" + tasks +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TaskList taskList = (TaskList) o;

        if (!getTasks().equals(taskList.getTasks())) return false;
        return getName().equals(taskList.getName());
    }

    @Override
    public int hashCode() {
        int result = getTasks().hashCode();
        result = 31 * result + getName().hashCode();
        return result;
    }
    public void addTask(Task task) {
        tasks.add(task);
    }
    public boolean remove(Task task) {
        return tasks.remove(task);
    }
}




