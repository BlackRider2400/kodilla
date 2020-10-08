package com.kodilla.good.patterns.food2door;

public interface InformationService {
    void sendConfirmationMessage(User user);
    void sendFailureMessage(User user);
}
