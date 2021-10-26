package com.kodilla.stream.world;

import com.kodilla.stream.sand.SandStorage;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class Country {

    private final String nameCountry;
    private final BigDecimal getPeopleQuantity;

    public Country(final String nameCountry, final BigDecimal getPeopleQuantity) {
        this.nameCountry = nameCountry;
        this.getPeopleQuantity = getPeopleQuantity;
    }
    public BigDecimal getGetPeopleQuantity() {
        return getPeopleQuantity;
    }

    public String getNameCountry() {
        return nameCountry;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Country country = (Country) o;

        if (getNameCountry() != null ? !getNameCountry().equals(country.getNameCountry()) : country.getNameCountry() != null)
            return false;
        return getGetPeopleQuantity() != null ? getGetPeopleQuantity().equals(country.getGetPeopleQuantity()) : country.getGetPeopleQuantity() == null;
    }
    @Override
    public String toString() {
        return "Country{" +
                "nameCountry='" + nameCountry + '\'' +
                ", getPeopleQuantity=" + getPeopleQuantity +
                '}';
    }
    @Override
    public int hashCode() {
        int result = getNameCountry() != null ? getNameCountry().hashCode() : 0;
        result = 31 * result + (getGetPeopleQuantity() != null ? getGetPeopleQuantity().hashCode() : 0);
        return result;
    }
}
