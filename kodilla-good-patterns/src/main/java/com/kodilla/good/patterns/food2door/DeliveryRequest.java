package com.kodilla.good.patterns.food2door;

public class DeliveryRequest {
    private User user;
    private String productName;
    private int quantity;

    public DeliveryRequest(User user, String productName, int quantity) {
        this.user = user;
        this.productName = productName;
        this.quantity = quantity;
    }

    public User getUser() {
        return user;
    }

    public String getProductName() {
        return productName;
    }

    public int getQuantity() {
        return quantity;
    }
}
