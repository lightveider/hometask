package com.ifmo.jjd.hometask6;

public class Application {
    public static void main(String[] ars) {

        Author author1 = new Author();
        author1.setFirstName("Федор");
        author1.setSecondName("Достаевский");
        System.out.println(author1);

        Author author2 = new Author();
        author2.setFirstName("Эдгар Алан");
        author2.setSecondName("По");


        Book book1 = new Book();
        book1.setAuthor(author1);
        book1.setPages(148);
        book1.setBookName("Преступление и Наказание");
        book1.setPublishedAt(1856);
        System.out.println(book1);
        Book book2 = new Book();
        Book book3 = new Book();







    }
}
