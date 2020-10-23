package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task{
    private String name;
    private String color;
    private String whatToPaint;
    private boolean executed = false;

    public PaintingTask(String name, String color, String whatToPaint) {
        this.name = name;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    @Override
    public void executeTask() {
        System.out.println("Execute " + name + " painting task.");
        executed = true;
    }

    @Override
    public String getTaskName() {
        return name;
    }

    @Override
    public boolean isTaskExecuted() {
        return executed;
    }
}
