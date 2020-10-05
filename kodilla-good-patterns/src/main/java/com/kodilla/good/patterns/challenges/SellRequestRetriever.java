package com.kodilla.good.patterns.challenges;

public class SellRequestRetriever {

    public SellRequest retrieve(){
        User user = new User("Chris", "St. Green 12", "chris@gmail.com");

        return new SellRequest(user, 5);

    }
}
