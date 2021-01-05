package com.kodilla.patterns2.observer.homework;

public interface ObservableHomeWork {
    void registerTeacher(ObserverHomeWork teacher);
    void removeTeacher(ObserverHomeWork teacher);
    void notifyObservers();
}
