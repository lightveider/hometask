package com.ifmo.jjd.hometask6;

public class Book {

    public String bookName;
    public Author Author;
    public int pages;
    public int publishedYear;

    public void setBookName(String bookName) {
        if (bookName == null || bookName.trim().length() < 1) {
            throw new IllegalArgumentException("Значение bookName <1");
        }
        this.bookName = bookName;
    }


    public void setPages(int pages) {
        if (pages < 0) {
            throw new IllegalArgumentException("В книге не может быть страниц меньше нуля");
        }

        this.pages = pages;
    }

    public void setPublishedAt(int publishedYear) {
        if (publishedYear < 700) {
            throw new IllegalArgumentException("Первые книги датируются 700 г. нашей эры");
        }
        this.publishedYear = publishedYear;
    }

    public String getBookName() {
        return bookName;
    }


    public int getPages() {
        return pages;
    }

    public int getPublishedAt() {
        return publishedYear;
    }

    public void setAuthor(com.ifmo.jjd.hometask6.Author author) {
        Author = author;
    }

    public com.ifmo.jjd.hometask6.Author getAuthor() {
        return Author;
    }

    @Override
    public String toString() {
        return " " +
                "Название книги: " + bookName +
                ", Автор " + Author +
                ", Страниц " + pages +
                ", Год Издания " + publishedYear +
                ' ';
    }
}
