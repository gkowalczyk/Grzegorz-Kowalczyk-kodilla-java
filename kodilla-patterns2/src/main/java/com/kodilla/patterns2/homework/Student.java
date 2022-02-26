package com.kodilla.patterns2.homework;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Student implements Observable {
    private final List<Observer> observers;
    private final Deque<String> dequeTasks;
    private final String name;

    public Student(String name) {
        observers = new ArrayList<>();
        dequeTasks = new ArrayDeque<>();
        this.name = name;
    }

    public void addTask(String post) {
        dequeTasks.offer(post);
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public List<Observer> getObservers() {
        return observers;
    }

    public Deque<String> getDequeTasks() {
        return dequeTasks;
    }

    public String getName() {
        return name;
    }
}
