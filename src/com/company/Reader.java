package com.company;

import java.util.Random;

public class Reader {

    Random rnd = new Random();

    public Book choiceBook(Book[] library) {
        int index = rnd.nextInt(library.length);
        return library[index];
    }

    public void readBook(Book myBook) {
        System.out.println(myBook);
    }

    public void rateBook(Book myBook) {
        int rating = 0;

        if (myBook.name != null) {
            rating += myBook.name.replaceAll("\\s", "").length();
        } else {
            rating -= rnd.nextInt(100);
        }
        if (myBook.author != null) {
            rating += myBook.author.replaceAll("\\s", "").length();
        } else {
            rating -= rnd.nextInt(100);
        }
        if (myBook.volume > 0) {
            rating -= myBook.volume;
        } else {
            rating -= rnd.nextInt(100);
        }
        if (myBook.pages > 0) {
            rating += myBook.pages;
        } else {
            rating -= rnd.nextInt(100);
        }
        if (myBook.name == null) {
            System.out.println("Без названия: оценка " + rating);
        } else {
            System.out.println(myBook.name + ": оценка " + rating);
        }
    }
}