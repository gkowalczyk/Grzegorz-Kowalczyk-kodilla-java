package com.kodilla.hibernate.task.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;


@Transactional
@Repository
public interface TaskDao extends CrudRepository<Task,Integer> {
List<Task> findByDuration(int duration);
}
