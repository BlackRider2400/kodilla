package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements Task{
    private String name;
    private String whatToBuy;
    private double quantity;
    private boolean executed = false;

    public ShoppingTask(String name, String whatToBuy, double quantity) {
        this.name = name;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    @Override
    public void executeTask() {
        System.out.println("Executing " + name + " shopping list.");
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
