package com.task3Q1;

import java.util.ArrayList;

import java.util.Arrays;

public class Library {
    private Book[] books;

    // Constructor
    public Library(int size) {
        this.books = new Book[size];
    }

    // Add a book to the library
    public void addBook(Book book) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = book;
                return;
            }
        }
        System.out.println("Library is full, cannot add more books.");
    }

    // Remove a book from the library
    public void removeBook(int bookID) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null && books[i].getBookID() == bookID) {
                books[i] = null;
                return;
            }
        }
        System.out.println("Book with ID " + bookID + " not found in the library.");
    }

    // Display all books in the library
    public void displayBooks() {
        for (Book book : books) {
            if (book != null) {
                System.out.println("Book ID: " + book.getBookID() + ", Title: " + book.getTitle() + ", Author: " + book.getAuthor() + ", Available: " + book.isAvailable());
            }
        }
    }

    public static void main(String[] args) {
        Library library = new Library(5);

        // Adding books to the library
        library.addBook(new Book(1, "Java Programming", "John Doe", true));
        library.addBook(new Book(2, "Data Structures and Algorithms", "Jane Smith", true));
        library.addBook(new Book(3, "Introduction to OOP", "Alice Johnson", true));

        // Displaying all books in the library
        System.out.println("Books in the library:");
        library.displayBooks();

        // Removing a book from the library
        library.removeBook(2);

        // Displaying all books in the library after removal
        System.out.println("\nBooks in the library after removal:");
        library.displayBooks();
    }
}
