package com.jap.course3;

public class Book {
    private String isbn;
    private String title;
    private String bookDescription;
    private double price;
    private Author author;

    public Book(String isbn, String title, String bookDescription, double price, Author author) {
        this.isbn = isbn;
        this.title = title;
        this.bookDescription = bookDescription;
        this.price = price;
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBookDescription() {
        return bookDescription;
    }

    public void setBookDescription(String bookDescription) {
        this.bookDescription = bookDescription;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void displayBookDetails() {
        System.out.println("ISBN: " + isbn);
        System.out.println("Title: " + title);
        System.out.println("Description: " + bookDescription);
        System.out.println("Price: $" + price);
        System.out.println("Author: " + author.getAuthorName());
    }
}
