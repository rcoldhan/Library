package com.company;

import java.util.Random;

/**
 * В классе Reader должен быть метод, который рандомно определяет,
 * какую книгу будет читать пользователь choiceBook.
 * <p>
 * choiceBook Принимает в себя массив книг и с помощью java.util.Random выбирает одну книгу и возвращает ее.
 * <p>
 * В классе Reader должен быть метод readBook, который принимает входным аргументом Book
 * и выводит его в консоль с помощью переопределенного toString.
 * <p>
 * В классе Reader должен быть метод оценки пользователем прочитанной книги,
 * на вход он должен принимать Book.
 */

public class Reader {

    Random rnd = new Random();

    public Book choiceBook(Book[] library) {
        int index = rnd.nextInt(library.length);
        return library[index];
    }

    public void readBook(Book myBook) {
        if (myBook.name != null) {
            System.out.println("Книга " + myBook.name + " прочитана!");
        } else {
            System.out.println("Книга без названия прочитана!");
        }
    }

    /**
     * Считать оценку следующим образом:
     * (Количество символов в названии)+(Количество символов в поле Автор)
     * -(Порядковый номер в серии)+(Количество страниц).
     * <p>
     * За каждое незаполненное поле вычитать рандомное (с помощью java.util.Random) число из оценки.
     * <p>
     * Оценку пользователя после подсчетов вывести в консоль с указанием названия книги.
     */

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
            System.out.println("Название неизвестно: оценка " + rating);
        } else {
            System.out.println(myBook.name + ": оценка " + rating);
        }
    }
}