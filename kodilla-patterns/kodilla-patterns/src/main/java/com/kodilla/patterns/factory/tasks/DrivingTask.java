package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Task {

    private final String taskName;
    private final String where;
    private final String using;
    private boolean task = false;

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    public String getWhere() {
        return where;
    }

    public String getUsing() {
        return using;
    }

    @Override
    public String executeTask() {
        task = true;
        return "TASK:" + taskName + ":DONE. YOU HAVE TO:" + using + ":to:" + where;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return task;
    }
}
