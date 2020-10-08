package com.kodilla.good.patterns.food2door;

public class MailService implements InformationService{

    @Override
    public void sendConfirmationMessage(User user) {
        System.out.println(user.getEmail() + "\n delivery request succeed");
    }

    @Override
    public void sendFailureMessage(User user){
        System.out.println(user.getEmail() + "\n deliver request failure");
    }
}
