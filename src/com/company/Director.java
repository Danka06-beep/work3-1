package com.company;

import java.time.LocalDate;

public class Director {

    LocalDate birthday;
    String name;
    String surname;
    Film [] films;

    public Director(LocalDate birthday, String name, String surname, Film[] films) {
        this.birthday = birthday;
        this.name = name;
        this.surname = surname;
        this.films = films;
    }

}
