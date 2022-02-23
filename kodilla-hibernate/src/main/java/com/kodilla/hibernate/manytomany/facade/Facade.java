package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Facade {

    @Autowired
    private EmployeeDao employeeDao;
    @Autowired
    private CompanyDao companyDao;

    public List<Company> returnNameCompany(String companyName) {
        return companyDao.returnNameCompany(companyName);
    }

    @Override
    public String toString() {
        return "Facade{" +
                "employeeDao=" + employeeDao +
                ", companyDao=" + companyDao +
                '}';
    }

    public List<Employee> returnNameEmployee(String employeeName) {
        return employeeDao.returnNameEmployee(employeeName);

    }
}