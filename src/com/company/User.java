package com.company;

public class User {
    static int totalOnline = 0;
    String email;
    String name;
    String surname;

    public User (String email, String name, String surname){

        this.email = email;
        this.name = name;
        this.surname = surname;
        totalOnline++;
    }
}
