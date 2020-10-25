package com.codedifferently.part01;

//This is how we create a class with dynamic variables. Keep them dynamic so that we can create many instances of these!
public class Book {
    String author;
    String title;
    Integer noPages;
    boolean isGood;

    //Constructor
    public Book() {
        this.author = "Not Set";
        this.title = "Not Set";
        this.noPages = 0;
        this.isGood = true;
    }

    //Another Constructor
    public Book(String authorIn, String titleIn, Integer noPagesIn, boolean isGoodIn) {
        this.author = authorIn;
        this.title = titleIn;
        this.noPages = noPagesIn;
        this.isGood = isGoodIn;
    }
}