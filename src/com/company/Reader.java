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

    public Book choiceBook(Book[] books) {
        int index = rnd.nextInt(books.length);
        System.out.println(index);
        return books[index];
    }

    public void readBook(Book book) {
        if (book.bookName != null) {
            System.out.println("Книга " + book.bookName + " прочитана!");
        } else {
            System.out.println("У прочитанной книги нет названия");
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

    public void rateBook(Book book) {
        int rating = 0;
        if (book.bookName != null) {
            rating += book.bookName.length();
        } else {
            rating -= rnd.nextInt(book.pages);
        }
        if (book.author != null) {
            rating += book.author.length();
        } else {
            rating -= rnd.nextInt(book.pages);
        }
        if (book.volume != 0) {
            rating -= book.volume;
        } else {
            rating -= rnd.nextInt(book.pages);
        }
        if (book.pages != 0) {
            rating += book.pages;
        } else {
            rating -= rnd.nextInt(book.pages);
        }
        if (book.bookName != null) {
            System.out.println(book.bookName + ": оценка " + rating);
        } else {
            System.out.println("Название неизвестно: оценка " + rating);
        }
    }
}