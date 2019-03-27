package com.company;

public class Magazine implements Prototype {

    private String name;
    private int year;
    private String number;


    @Override
    public Prototype doClone() {
        System.out.println("Cloning Magazine object..");
        Magazine magazine = new Magazine();
        magazine.setName(this.name);
        magazine.setYear(this.year);
        magazine.setNumber(this.number);
        return magazine;
    }


    @Override
    public String toString() {
        return "Magazine " + this.name +
                "\nyear: " + this.year +
                "\nnumber: " + this.number;
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

    public void setNumber(String number) {
        this.number = number;
    }

    public String getNumber(){
        return this.number;
    }
}
