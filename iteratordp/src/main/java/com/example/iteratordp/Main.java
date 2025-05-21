package com.example.iteratordp;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
                new Book("The Catcher in the Rye", "J.D. Salinger"),
                new Book("To Kill a Mockingbird", "Harper Lee"),
                new Book("1984", "George Orwell"));

        Library library = new Library(books);
        Iterator iterator = library.createIterator();
        while (iterator.hasNext()) {
            Book book = (Book) iterator.next();
            System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor());
        }

        // outside of loop
        Book book = (Book) iterator.next();
        if (book == null) {
            System.out.println("No more books in the library.");
        } else {
            System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor());
        }

    }
}