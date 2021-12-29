package com.kodilla.patterns.prototype;

import java.util.Objects;

public class Task {

    private final String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return name.equals(task.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public String getName() {
        return name;
    }

    public Task(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "        Task [" + name + "]";

    }
}
