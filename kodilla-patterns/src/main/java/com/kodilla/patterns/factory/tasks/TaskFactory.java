package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    final static String SHOPPING = "SHOPPING";
    final static String DRIVING = "DRIVING";
    final static String PAINTING = "PAINTING";

    public Task makeTask(final String className){

        Task task;
        switch (className){
            case SHOPPING:
                task = new ShoppingTask("Shopping for dinner.", "pasta, red pesto, canned corn", 2);
                break;
            case DRIVING:
                task = new DrivingTask("Driving sister to friend.", "friend's house", "car");
                break;
            case PAINTING:
                task = new PaintingTask("Painting my room.", "white", "walls and celling");
                break;
            default:
                task = null;
        }

        return task;
    }
}
