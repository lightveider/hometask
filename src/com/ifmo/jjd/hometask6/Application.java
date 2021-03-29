package com.ifmo.jjd.hometask6;

public class Application {
    public static void main(String[] ars) {
        Author author1 = new Author("Александр","Пушкин");
        Author author2 = new Author("Лев","Толстой");

        Book book1 = new Book("Преступление и капитанская дочка",2);
        book1.setPageCount(378);
        book1.setYear(1990);
        book1.addAuthor(author1);
        book1.addAuthor(author2);


        Storage storage = new Storage();
        storage.addBook(book1);

        for (Book b: storage.getBooks()) { // массив книг Book []

            // вывести название книги
            //вывести имена и фамилии авторов
            System.out.println("===Книга===");
            System.out.println(book1.getTittle());
            System.out.println("Авторы:");
            for (Author author : b.getAuthors()) {
                System.out.println(author.getName());
                System.out.println(author.getSurname());
            }



        }

    }
}
