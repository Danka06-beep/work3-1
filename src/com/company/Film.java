package com.company;

import java.time.LocalDate;

public class Film {

    LocalDate release;
    String title;
    String[] countries;

    public Film(LocalDate release, String title, String[] countries) {
        this.release = release;
        this.title = title;
        this.countries = countries;
    }
}
