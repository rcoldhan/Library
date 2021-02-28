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
    String name;
    String author;
    int volume;
    int pages;

    Book() {

    }

    Book(int pages) {
        this.pages = pages;
    }

    Book(String name, int pages) {
        this.name = name;
        this.pages = pages;
    }

    Book(String name, String author, int volume) {
        this.name = name;
        this.author = author;
        this.volume = volume;
    }

    Book(String name, String author, int volume, int pages) {
        this.name = name;
        this.author = author;
        this.volume = volume;
        this.pages = pages;
    }

    @Override
    public String toString() {
        if (name == null) {
            name = "Без названия";
        }
        if (author == null) {
            author = "Не указан";
        }
        if (volume < 1) {
            volume = 0;
        }
        if (pages < 1) {
            pages = 0;
        }
        return "Информация о книге: название = " + name +
                ", автор = " + author +
                ", том = " + volume +
                ", количество страниц = " + pages;
    }
}