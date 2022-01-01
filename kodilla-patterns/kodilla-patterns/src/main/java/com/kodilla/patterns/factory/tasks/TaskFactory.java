package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String DRIVING = "DRIVING";
    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";

    public final Task taskMaker(final String taskClass) {
        switch (taskClass) {
            case DRIVING:
                return new DrivingTask("driving", "Wroclaw", "car");
            case SHOPPING:
                return new ShoppingTask("shopping", "phone", 1.0);
            case PAINTING:
                return new PaintTask("painting", "blue", "sky");
            default:
                return null;
        }
    }
}


