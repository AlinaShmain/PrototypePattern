package com.company;

public class Main {

    public static void main(String[] args) {

        BookStore.loadCache();

        String bookPrototype = BookStore.getItem("kgsfsg").toString();
        System.out.println(bookPrototype);

        String magazinePrototype = BookStore.getItem("2876").toString();
        System.out.println(magazinePrototype);
    }
}
