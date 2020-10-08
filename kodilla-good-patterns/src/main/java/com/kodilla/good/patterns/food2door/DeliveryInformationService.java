package com.kodilla.good.patterns.food2door;

public interface DeliveryInformationService {
    void sendConfirmationMessage(User user);
    void sendFailureMessage(User user);
}
