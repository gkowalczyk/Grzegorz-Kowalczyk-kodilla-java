package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class World {
    private final List<Continent> finalList = new ArrayList<>();


public void addContinent(Continent continent) {
        finalList.add(continent);
}

        public BigDecimal getGetPeopleQuantityAll() {
            return finalList.stream()
                    .flatMap(continent -> continent.getListCountry().stream())
                    .map(Country::getGetPeopleQuantity)
                    .reduce(BigDecimal.ZERO,(sum,current) -> sum=sum.add(current));
    }
}
