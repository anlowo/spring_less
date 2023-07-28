package com.example.spring_less.lesson8.configuration_aspect;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AopMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        Library library = context.getBean("library", Library.class);
        Book book = context.getBean("book", Book.class);
        library.getBook(book);
        library.returnBook();
        library.getMagazine();


        SchoolLibrary schoolLibrary = context.getBean("schoolLibrary", SchoolLibrary.class);
        schoolLibrary.getBook();

        context.close();
    }
}
