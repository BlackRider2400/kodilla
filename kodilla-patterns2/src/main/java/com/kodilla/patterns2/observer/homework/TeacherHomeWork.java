package com.kodilla.patterns2.observer.homework;

public class TeacherHomeWork implements ObserverHomeWork {
    private final String name;
    private int updatesCount;

    public TeacherHomeWork(String name) {
        this.name = name;
        updatesCount = 0;
    }

    @Override
    public void update(StudentHomeWorks student) {
        System.out.println(name + ": You have " + student.getHomeworks().size() + " homeworks completed from " + student.getName());
        updatesCount++;
    }

    public String getName() {
        return name;
    }

    public int getUpdatesCount() {
        return updatesCount;
    }
}
