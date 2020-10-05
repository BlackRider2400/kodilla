package com.kodilla.good.patterns.challenges;

public interface SellRepository {
    int getQuantity();
    void lowerInventory(int number);
}
