package com.kodilla.patterns.prototype.library;

public class PrototypeCloning<T> implements Cloneable{

    @Override
    public T clone() throws CloneNotSupportedException{
        return (T)super.clone();
    }
}
