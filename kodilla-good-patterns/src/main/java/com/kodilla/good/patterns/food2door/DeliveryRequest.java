package com.kodilla.good.patterns.food2door;

public class DeliveryRequest {
    private User user;
    private String productName;
    private int quantity;

    public DeliveryRequest(String productName, int quantity) {
        this.user = new User("John", "Green street",
                "johnsmith@gmail.com");
        this.productName = productName;
        this.quantity = quantity;
    }

    public DeliveryRequest(com.kodilla.good.patterns.challenges.User user, String glutenFreeWater, int quantity) {
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
