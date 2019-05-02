package com.company;

public class Book {
    private String Title;
    private String Author;
    private String Description;
    private double Price;
    private int isInStock;
    private String SKU;

    public String getSKU() {
        return SKU;
    }

    public void setSKU(String SKU) {
        this.SKU = SKU;
    }



    public Book() {
        // System.out.println("this is a default constructor");
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

        return Title + Author+ Description + this.Price;
    }


}