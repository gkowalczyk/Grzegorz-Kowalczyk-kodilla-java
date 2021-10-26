package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class Continent {
        private final String nameContinent;
        private  final List<Country> listContinent = new ArrayList<>();

        public Continent(String nameContinent) {
                this.nameContinent = nameContinent;
        }
        public String getNameContinent() {
                return nameContinent;
        }
        public List<Country> getListCountry() {
                return listContinent;
        }
        @Override
        public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;

                Continent continent = (Continent) o;

                if (!getNameContinent().equals(continent.getNameContinent())) return false;
                return getListCountry().equals(continent.getListCountry());
        }
        @Override
        public int hashCode() {
                int result = getNameContinent().hashCode();
                result = 31 * result + getListCountry().hashCode();
                return result;
        }
         public void addCountry(Country country) {
        listContinent.add(country);
}
        }







