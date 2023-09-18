package KnapsackProblem;

import java.util.*;

class GreedyAlgorithm {

    static class Item {
        private double ratio;
        private int index;

        @Override
        public String toString() {
            return "Item{" +
                    "ratio=" + ratio +
                    ", index=" + index +
                    '}';
        }
    }

    public static int KnapsackProblemSolve(int position, int capacity, int[] values, int[] weight) {

        Item[] items = new Item[position];
        for (int i = 0; i < position; i++) {
            items[i] = new Item();
            items[i].index = i;
            items[i].ratio = (double) values[i] / weight[i];

        }
        Arrays.sort(items, new Comparator<Item>() {
            @Override
            public int compare(Item o1, Item o2) {
                return Double.compare(o2.ratio, o1.ratio);
            }
        });

        int totalWeight = 0;
        int totalValue = 0;

        for (Item item : items) {
            if (totalWeight + weight[item.index] < capacity) {
                totalWeight += weight[item.index];
                totalValue += totalValue + values[item.index];
            }
        }
        return totalValue;
    }

    public static void main(String[] args) {
        int position = 3;
        int capacity = 8;
        int[] values = {1, 2, 3};
        int[] weights = {4, 5, 1};
        System.out.println(KnapsackProblemSolve(position, capacity, values, weights));
    }
}

