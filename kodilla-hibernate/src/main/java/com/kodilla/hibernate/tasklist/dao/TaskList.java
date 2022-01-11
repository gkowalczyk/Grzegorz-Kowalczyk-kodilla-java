package com.kodilla.hibernate.tasklist.dao;

import com.sun.istack.NotNull;
import javax.persistence.*;

@Entity
@Table(name = "TASKSLISTS")
public class TaskList {

    private int id;
    private String description;
    private String listName;

    public TaskList() {
    }
    public TaskList(String description, String listName) {
        this.description = description;
        this.listName = listName;
    }
    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ID", unique = true)
    public int getId() {
        return id;
    }
    @Column(name = "DESCRIPTION")
    public String getDescription() {
        return description;
    }
    @Column(name = "LISTNAME")
    public String getListName() {
        return listName;
    }
    private void setId(int id) {
        this.id = id;
    }
    private void setDescription(String description) {
        this.description = description;
    }
    private void setListName(String listName) {
        this.listName = listName;
    }
}
