package com.company;

public class Main {

    public static void main(String[] args) {
        Book[] library = {
                new Book(),
                new Book(0),
                new Book("Преступление и наказание", 567),
                new Book("Мастер и Маргарита", "Михаил Булгаков", 0),
                new Book("Война и мир", "Лев Толстой", 2, 448),
        };
        Reader reader = new Reader();
        Book myBook = reader.choiceBook(library);
        reader.readBook(myBook);
        reader.rateBook(myBook);
    }
}