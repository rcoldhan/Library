package com.company;

/**
 * У Book есть поля (свойства книги): "Название", "Автор", "Порядковый номер в серии"
 * "Количество страниц".
 * <p>
 * Для того, чтобы можно было создавать книги с разным набором свойств,
 * у класса Book сделать перегруженные конструкторы(не менее трех).
 * <p>
 * Для красивого вывода описания книги в консоль переопределить метод toString() для класса Book;
 */

public class Book {
    String bookName;
    String author;
    int volume;
    int pages;

    //конструктор без параметров
    Book(int pagesNumber) {
        this.pages = pagesNumber;
    }

    //конструктор с 4 параметрами
    Book(String bookName, String author, int volumeNumber, int pagesNumber) {
        this.bookName = bookName;
        this.author = author;
        this.volume = volumeNumber;
        this.pages = pagesNumber;
    }

    //конструктор с 2 параметрами
    Book(String bookName, int pagesNumber) {
        this.bookName = bookName;
        this.pages = pagesNumber;
    }

    @Override
    public String toString() {

        return this.bookName + ", " + this.author + ", volume " + this.volume + ", " + this.pages + " pages";
    }
}