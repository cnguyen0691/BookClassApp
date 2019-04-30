package com.company;

public class Book {
    private String Title;
    private String Author;
    private String Description;
    private double Price;
    private int isInStock;

    public Book() {
        // System.out.println("this is a default constructor");
    }

    public Book(String t, String a, String d, double price, int isInStock) {
        Title = t;
        Author = a;
        Description = d;
        Price = price;
        this.isInStock = isInStock;
    }

    public String getTitle() {

        return Title;

    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }

    public int getIsInStock() {
        return isInStock;
    }

    public void setIsInStock(int isInStock) {
        this.isInStock = isInStock;
    }






    public String getDisplayText(){

        return Title + Author+ Description;
    }




}
