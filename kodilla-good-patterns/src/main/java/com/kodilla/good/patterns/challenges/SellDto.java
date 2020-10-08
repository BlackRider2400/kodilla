package com.kodilla.good.patterns.challenges;

public class SellDto {

    private User user;
    private int quantity;

    public SellDto(User user, int quantity) {
        this.user = user;
        this.quantity = quantity;
    }

    public User getUser() {
        return user;
    }

    public int getQuantity() {
        return quantity;
    }
}
