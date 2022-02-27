package com.kodilla.patterns2.adapter.company.newhrsystem;

import java.math.BigDecimal;
import java.util.List;

public class SalaryAdaptee implements SalaryProcessor{
    @Override
    public BigDecimal calculateSalaries(List<Employee> employees) {
        CompanySalaryPorcessor theProcessor = new CompanySalaryPorcessor();
        return theProcessor.calculateSalaries(employees);
    }
}
