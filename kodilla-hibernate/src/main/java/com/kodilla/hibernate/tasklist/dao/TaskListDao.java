package com.kodilla.hibernate.tasklist.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public interface TaskListDao extends CrudRepository<TaskList,Integer> {
    List<TaskList> findByListName(String listName);
}
