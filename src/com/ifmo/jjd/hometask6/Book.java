package com.ifmo.jjd.hometask6;

public class Book {
    //авторы
    private String tittle;
    private int pageCount;
    private int year;
    private Author[] authors; // = new Author[5];

    public Book(String tittle, int authorsCount) {
        this.tittle = tittle;
        authors = new Author[authorsCount]; // В конструктор мы передаём обязательные значения свойств и без них объект не может существовать
    }

    public void addAuthor(Author author) {   //метод добавляет по одному автору
        for (int i = 0; i < authors.length; i++) {
            if (authors[i] == null) {
                authors[i] = author;
                return;
            }

        }

    }

    // необязательные параметры

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getTittle() {
        return tittle;
    }

    public int getPageCount() {
        return pageCount;
    }

    public int getYear() {
        return year;
    }

    public Author[] getAuthors() {
        return authors;
    }

}
