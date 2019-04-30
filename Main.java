package com.company;


public class Main {

    public static void main(String[] args) {
        Book b = new Book();
        b.setTitle("A book: ");
        b.setAuthor("Chau Nguyen ");
        b.setDescription (" Kid book");
        b.setPrice(10.50);

        String bookResult = b.getDisplayText();
        System.out.println(bookResult);

    }
}




