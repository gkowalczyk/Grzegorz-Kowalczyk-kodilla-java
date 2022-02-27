package com.kodilla.patterns2.adapter.company.newhrsystem;

import java.math.BigDecimal;
import java.util.Objects;

public class Employee {

      final private String peselId;
      final private String firstname;
      final private String lastname;
      final private BigDecimal baseSalary;

      public Employee(String peselId, String firstname, String lastname, BigDecimal baseSalary) {
         this.peselId = peselId;
         this.firstname = firstname;
         this.lastname = lastname;
         this.baseSalary = baseSalary;
      }

      public String getFirstname() {
         return firstname;
      }

      public String getLastname() {
         return lastname;
      }

      public BigDecimal getBaseSalary() {
         return baseSalary;
      }

      public String getPeselId() {
         return peselId;
      }

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      Employee employee = (Employee) o;
      return peselId.equals(employee.peselId) && firstname.equals(employee.firstname) && lastname.equals(employee.lastname) && baseSalary.equals(employee.baseSalary);
   }

   @Override
   public int hashCode() {
      return Objects.hash(peselId, firstname, lastname, baseSalary);
   }

   @Override
   public String toString() {
      return "Employee{" +
              "peselId='" + peselId + '\'' +
              ", firstname='" + firstname + '\'' +
              ", lastname='" + lastname + '\'' +
              ", baseSalary=" + baseSalary +
              '}';
   }
}