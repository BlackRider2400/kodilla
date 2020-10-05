package com.kodilla.good.patterns.challenges;

public class CupSellRepository implements SellRepository{

    private int quantity;

    public CupSellRepository(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public int getQuantity() {
        return quantity;
    }

    @Override
    public void lowerInventory(int number) {
        quantity -= number;
    }
}
