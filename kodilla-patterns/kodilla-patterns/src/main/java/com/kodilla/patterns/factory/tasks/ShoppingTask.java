package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements Task {

    private final String taskName;
    private final String whatToBuy;
    private final double quantity;
    private boolean task = false;

    public ShoppingTask(String taskName, String whatToBuy, double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    @Override
    public String executeTask() {
        task = true;
        return "TASK:" + taskName + ":DONE. YOU BUY:" + quantity + ":" + whatToBuy;
    }

    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return task;
    }

    public String getWhatToBuy() {
        return whatToBuy;
    }

    public double getQuantity() {
        return quantity;
    }
}
