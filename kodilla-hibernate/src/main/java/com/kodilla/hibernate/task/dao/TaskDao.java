package com.kodilla.hibernate.task.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

//ata Access Object – komponent dostarczający jednolity interfejs
// do komunikacji
// między aplikacją a źródłem danych (np. bazą danych czy plikiem).
@Transactional//wywołanie metody w ramach jednej transakcji
@Repository // intefejs użyty do tworzenia beana
public interface TaskDao extends CrudRepository<Task, Integer> {
    List<Task> findByDuration(int duration);

    @Query
    List<Task> retrieveLongTasks();

    @Query
    List<Task> retrieveShortTasks();

    @Query(nativeQuery = true)
    List<Task> retrieveTasksWithEnoughTime();

    @Query
    List<Task> retrieveTasksWithDurationLongerThan(@Param("DURATION") int duration);
}
