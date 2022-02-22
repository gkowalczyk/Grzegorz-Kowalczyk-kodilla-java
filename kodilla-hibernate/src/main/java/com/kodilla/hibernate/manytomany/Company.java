package com.kodilla.hibernate.manytomany;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@NamedNativeQueries({
@NamedNativeQuery(
        name = "Company.returnFirstThreeSignFromCompanyName",
        query = "SELECT *FROM COMPANY" + "WHERE  SUBSTRING(COMPANY_NAME,1,3) = :NAME" , //https://www.w3schools.com/sql/func_sqlserver_substring.asp
        resultClass = Company.class
),
@NamedNativeQuery(
        name = "Company.returnNameCompany",
        query = "SELECT *FROM COMPANY" + " WHERE COMPANY_NAME LIKE CONCAT('%', :COMPANYNAME, '%')",
        resultClass = Company.class
)
        })

@Entity
@Table(name = "COMPANIES")
public class Company {

    private int id;
    private String name;
    private List<Employee> employees = new ArrayList<>();

    public Company() {
    }

    public Company(String name) {
        this.name = name;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "COMPANY_ID", unique = true)
    public int getId() {
        return id;
    }

    @NotNull
    @Column(name = "COMPANY_NAME")
    public String getName() {
        return name;
    }

    private void setId(int id) {
        this.id = id;
    }
    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "companies")
    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    private void setName(String name) {
        this.name = name;
    }
}