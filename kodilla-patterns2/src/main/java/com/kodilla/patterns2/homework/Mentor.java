package com.kodilla.patterns2.homework;

public class Mentor implements Observer{

    private final String username;
    private int updateCount;

    public Mentor(String username) {
        this.username = username;
            }


    public String getUsername() {
        return username;
    }

    public int getUpdateCount() {
        return updateCount;
    }

    @Override
    public void update(Student student) {
        System.out.println(username + ":got a new task to check: " + student.getDequeTasks().getLast() +
                ":from student:" + student.getName() + "\n" +
                "total in que: " + student.getDequeTasks().size() + "tasks"
                );
        updateCount++;
    }
}
