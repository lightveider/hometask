package com.ifmo.jjd.hometask6;

public class Book {

    public String bookName;
    public String authors;
    public int pages;
    public int publishedAt;

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", authors='" + authors + '\'' +
                ", pages=" + pages +
                ", publishedAt=" + publishedAt +
                '}';
    }
}
