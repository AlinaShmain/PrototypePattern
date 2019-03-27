package com.company;

public class Book implements Prototype {

    private String name;
    private int year;
    private String author;

    @Override
    public Prototype doClone() {
        System.out.println("Cloning Book object..");
        Book book = new Book();
        book.setName(this.name);
        book.setYear(this.year);
        book.setAuthor(this.author);
        return book;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book " + this.name +
                "\nyear: " + this.year +
                "\nauthor: " + this.author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
