package com.kodilla.patterns.prototype;


import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Board extends Prototype<Board>{

    private String name;
    private  Set<TaskList> lists = new HashSet<>();

    public String getName() {
        return name;
    }

    public Set<TaskList> getLists() {
        return lists;
    }

    public Board(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Board board = (Board) o;
        return name.equals(board.name) && lists.equals(board.lists);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lists);
    }

    @Override
    public String toString() {
       String s = "Board [" + name + "]";
       for (TaskList list : lists) {
           s = s + list.toString() + "\n";
       }
       return s;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Board shallowCopy() throws CloneNotSupportedException {
        return super.clone();
    }
    public Board deepCopy() throws CloneNotSupportedException {
        Board cloneBoard = super.clone();
        cloneBoard.lists = new HashSet<>();
        for (TaskList taskList : lists) {
            TaskList cloneList = new TaskList(taskList.getName());
            for (Task task : taskList.getTasks()) {
                cloneList.getTasks().add(task);
            }
            cloneBoard.getLists().add(cloneList);
        }
        return cloneBoard;
    }
}
