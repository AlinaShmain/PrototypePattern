package com.company;

import java.util.HashMap;
import java.util.Map;


public class BookStore {

    private static Map<String , Prototype> itemsMap = new HashMap<String , Prototype>();

    public static void loadCache() {
        Book book = new Book();
        book.setName("krfl");
        book.setYear(1998);
        book.setAuthor("kgsfsg");
        itemsMap.put(book.getAuthor(), book);

        Magazine magazine = new Magazine();
        magazine.setNumber("2876");
        magazine.setName("fjfdsk");
        magazine.setYear(1994);
        itemsMap.put(String.valueOf(magazine.getNumber()), magazine);
    }

    public static Prototype getItem(String type) {
        return ((Prototype) itemsMap.get(type)).doClone();
    }
}
