package com.kodilla.patterns.builder;

import java.util.ArrayList;
import java.util.List;

public final class BigMac {

    private final String roll;
    private final int burgers;
    private List<String> ingredients = new ArrayList<>();
    private final String sauce;

   public BigMac(final String roll, final int burgers, List<String> ingredients, final String sauce) {
        this.roll = roll;
        this.burgers = burgers;
        this.ingredients = new ArrayList<>(ingredients);
        this.sauce = sauce;
    }
    public int getBurgers() {
        return burgers;
    }
    public List<String> getIngredients() {
        return ingredients;
    }
    public String getSauce() {
        return sauce;
    }
    @Override
    public String toString() {
        return "BigMac{" +
                "roll='" + roll + '\'' +
                ", burgers=" + burgers +
                ", ingredients=" + ingredients +
                ", sauce='" + sauce + '\'' +
                '}';
    }
    public static class BigMacBuilder {
        private String roll;
        private int burgers;
        private String sauce;
        private List<String> ingredients = new ArrayList<>();

        public BigMacBuilder roll(String roll) {
            this.roll = roll;
            return this;
        }
        public BigMacBuilder burgers(int burgers) {
            this.burgers = burgers;
            return this;
        }
        public BigMacBuilder ingredients(String ingredients) {
            this.ingredients.add(ingredients);
            return this;
        }
        public BigMacBuilder sauce(String sauce) {
            this.sauce = sauce;
            return this;
        }
        public BigMac build() {
            return new BigMac(roll, burgers, ingredients, sauce);
        }
    }
}