package com.company;

public class Book {
    private String Title;
    private String Author;
    private String Description;
    private double Price;
    private int isInStock;
    private String SKU;



    public Book() {
        // System.out.println("this is a default constructor");
    }

    public String getSKU() {
        return SKU;
    }

    public void setSKU(String SKU) {
        this.SKU = SKU;
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


//    public void returnRequest(boolean inStock){
//        double inS ;
//
//        if (inStock){
//            inS =  this.Price * this.isInStock; ;
//            System.out.println("Check out: "+inS);
//        }else{
//            System.out.println("No book available");
//        }
//    }


    public  void  returnBook(String find){
        if (find.equalsIgnoreCase(this.SKU)) {
            String check = SKU+" " + Title+" "+Author+" "+ Description+" "+ Price;
            System.out.println(check);
        } else if (!find.equalsIgnoreCase(this.SKU)){
            System.out.println("Wrong code!");
        }
    }
    public String getDisplayText(){

        return Title + Author+ Description + this.Price;
    }





}