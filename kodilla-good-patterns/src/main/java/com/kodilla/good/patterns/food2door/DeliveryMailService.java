package com.kodilla.good.patterns.food2door;

public class DeliveryMailService implements DeliveryInformationService{

    @Override
    public void sendConfirmationMessage(User user) {
        System.out.println(user.getEmail() + "\ndelivery request succeed");
    }

    @Override
    public void sendFailureMessage(User user){
        System.out.println(user.getEmail() + "\ndeliver request failure");
    }
}
