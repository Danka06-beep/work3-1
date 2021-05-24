package com.company;

public class Book {

    User user;
    Author author;
    String bookName;
    int year;

    public Book (User user,Author author, String bookName, int year){

        this.user = user;
        this.author = author;
        this.bookName = bookName;
        this.year = year;

    }

    @Override
    public String toString() {
        return "User: " + user.surname +" "+ user.name +" "+ user.email + ", Book: " + author.name + " " + author.surname + " " + bookName + " " + year;
    }
}
