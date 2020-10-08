package com.kodilla.good.patterns.food2door;

public class User {
    private String name;
    private String email;
    private String adres;

    public User(String name, String adres, String email) {
        this.name = name;
        this.email = email;
        this.adres = adres;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getAdres() {
        return adres;
    }
}
