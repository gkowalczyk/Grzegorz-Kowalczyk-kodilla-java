package com.kodilla.hibernate.taskfinancial;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public interface TaskFinancialDetailsDao extends CrudRepository<TaskFinancialDetails,Integer> {
    List<TaskFinancialDetails> findByPaid(boolean paid);
}
