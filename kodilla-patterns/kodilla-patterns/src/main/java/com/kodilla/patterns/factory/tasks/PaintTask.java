package com.kodilla.patterns.factory.tasks;

public class PaintTask implements Task {

    private final String taskName;
    private final String color;
    private final String whatToPaint;
    private boolean task = false;

    public PaintTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    @Override
    public String executeTask() {
        task = true;
        return "TASK:" + taskName + ":DONE. YOU SHOULD PAINT IN:" + color + ":" + whatToPaint;
    }

    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return task;
    }

    public String getColor() {
        return color;
    }

    public String getWhatToPaint() {
        return whatToPaint;
    }
}

