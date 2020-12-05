package com.example.entity;

public class Book {
    private String title;
    private double price;
    private String authorName;

    public Book() {
    }

    public Book(final String title, final double price, final String authorName) {
        this.title = title;
        this.price = price;
        this.authorName = authorName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(final String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(final double price) {
        this.price = price;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(final String authorName) {
        this.authorName = authorName;
    }
}
