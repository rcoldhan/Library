package com.company;

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
        String result;
        if (name == null) {
            result = "Прочитана книга: название = Без названия";
        } else {
            result = "Прочитана книга: название = " + name;
        }
        if (author == null) {
            result += ", автор = Не указан";
        } else {
            result += ", автор = " + author;
        }
        if (volume < 1) {
            result += ", том = 0";
        } else {
            result += ", том = " + volume;
        }
        if (pages < 1) {
            result += ", количество страниц = 0";
        } else {
            result += ", количество страниц = " + pages;
        }
        return result;
    }
}