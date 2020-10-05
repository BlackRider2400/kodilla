package com.kodilla.good.patterns.challenges;

public class User {

    private String name;
    private String adres;
    private String email;

    public User(String name, String adres, String email) {
        this.name = name;
        this.adres = adres;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getAdres() {
        return adres;
    }

    public String getEmail() {
        return email;
    }
}
