package com.kodilla.good.patterns.food2door;

public class DeliveryDto {
    private User user;
    private int quantity;

    public DeliveryDto(User user, int quantity) {
        this.user = user;
        this.quantity = quantity;
    }
}
