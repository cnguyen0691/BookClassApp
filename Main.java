package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input SKU:");
        String find = input.next();

        Book b = new Book();
        b.setSKU("Java1001");
        b.setTitle("Head First Java");
        b.setAuthor("Kathy Sierra and Bert Bates");
        b.setDescription("Easy to read Java workbook");
        b.setPrice(47.50);
        b.returnBook(find);

        Book c = new Book();
        c.setSKU("Java1002");
        c.setTitle("Thinking in Java");
        c.setAuthor("Bruce Eckel");
        c.setDescription("Details about Java under the hood");
        c.setPrice(20.00);
        c.returnBook(find);

        Book d = new Book();
        d.setSKU("Orcl1003");
        d.setTitle("OCP: Oracle Certified Professional Java SE");
        d.setAuthor("Jeanne Boyarsky");
        d.setDescription("Everything you need to know in one place");
        d.setPrice(45.00);
        d.returnBook(find);

        Book e = new Book();
        e.setSKU("Python1004");
        e.setTitle("Automate the Boring Stuff with Python");
        e.setAuthor("Al Sweigart");
        e.setDescription("Fun with Python");
        e.setPrice(10.50);
        e.returnBook(find);

        Book f = new Book();
        f.setSKU("Zombie1005");
        f.setTitle("The Maker's Guide to the Zombie Apocalypse");
        f.setAuthor("Simon Monk");
        f.setDescription("Defend Your Base with Simple Circuits, Arduino, and Raspberry Pi");
        f.setPrice(16.50);
        f.returnBook(find);

        Book g = new Book();
        g.setSKU("Rasp1006");
        g.setTitle("Rasoberry Pi Projects for the Evil Genius");
        g.setAuthor("Donald Norris");
        g.setDescription("A dozen fiendishly fun projects for the Raspberry Pi!");
        g.setPrice(14.75);
        g.returnBook(find);



    }
}


