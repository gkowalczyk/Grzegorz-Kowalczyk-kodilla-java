package com.kodilla.patterns2.decorator.taxiportal;

import java.math.BigDecimal;

public interface TaxiOrder {
    BigDecimal getCost(); //łączna kwota za przejazd
    String getDescription();// opis zamówienia
}
