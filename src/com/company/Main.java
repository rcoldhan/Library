package com.company;

/**
 * Собрать массив Book с разной заполненностью.
 * Создать экземпляр Reader.
 * Выбрать книгу с помощью choiceBook.
 * Прочитать книгу с помощью readBook.
 * Поставить оценку книге с помощью метода оценки.
 */

public class Main {

    public static void main(String[] args) {
        Book[] books = {
                new Book("War and Peace", "Lev Tolstoy", 1, 448),
                new Book("Crime and Punishment", 567),
                new Book(789)
        };
        Reader reader = new Reader();
        Book myBook = reader.choiceBook(books);
        reader.readBook(myBook);
        reader.rateBook(myBook);
        System.out.println(myBook);
    }
}