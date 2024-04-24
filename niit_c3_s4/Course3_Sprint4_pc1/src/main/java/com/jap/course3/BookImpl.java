package com.jap.course3;
public class BookImpl {
    public static void main(String[] args) {
        Author author = new Author("JK Rowling", "J.K.");
        Book book = new Book("123456546", "Harry Potter", "This is a Non-Fiction Book.", 21.99, author);
        book.displayBookDetails();
    }
}