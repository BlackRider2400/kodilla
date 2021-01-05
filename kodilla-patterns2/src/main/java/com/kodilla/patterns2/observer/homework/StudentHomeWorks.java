package com.kodilla.patterns2.observer.homework;


import java.util.ArrayList;
import java.util.List;

public class StudentHomeWorks implements ObservableHomeWork {
    private final List<ObserverHomeWork> observers;
    private final List<String> homeworks;
    private final String name;

    public StudentHomeWorks(String name) {
        this.observers = new ArrayList<>();
        this.homeworks = new ArrayList<>();
        this.name = name;
    }

    public void addHomeWork(String string){
        homeworks.add(string);
        notifyObservers();
    }

    @Override
    public void registerTeacher(ObserverHomeWork teacher) {
        observers.add(teacher);
    }

    @Override
    public void removeTeacher(ObserverHomeWork teacher) {
        observers.remove(teacher);
    }

    @Override
    public void notifyObservers() {
        for(ObserverHomeWork observer : observers){
            observer.update(this);
        }
    }

    public List<ObserverHomeWork> getObservers() {
        return observers;
    }

    public List<String> getHomeworks() {
        return homeworks;
    }

    public String getName() {
        return name;
    }
}
