package com.ifmo.jjd.hometask6;

public class Book {

    public String bookName;
    public Author author;
    public int pages;
    public int publishedYear;

    public void setBookName(String bookName) {
        if (bookName == null || bookName.trim().length()<1 ) {
            throw  new IllegalArgumentException("Значение bookName <1");
        }
        this.bookName = bookName;
    }

    public void setAuthors(String authors) {
        if (authors == null || authors.trim().length()<3) {
            throw new IllegalArgumentException("Значение Authors <3");
        }
        this.author = author;
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

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", authors='" + author + '\'' +
                ", pages=" + pages +
                ", publishedAt=" + publishedYear +
                '}';
    }
}
