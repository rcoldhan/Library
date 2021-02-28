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
        Book[] library = {
                new Book(),
                new Book(-2),
                new Book("Преступление и наказание", 567),
                new Book("Мастер и Маргарита", "Михаил Булгаков", -3),
                new Book("Война и мир", "Лев Толстой", 2, 448),
        };
        Reader reader = new Reader();
        Book myBook = reader.choiceBook(library);
        reader.readBook(myBook);
        reader.rateBook(myBook);
        System.out.println(myBook);
    }
}