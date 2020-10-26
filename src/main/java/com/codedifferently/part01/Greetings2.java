package com.codedifferently.part01;

public class Greetings2 {

    public static void main(String[] args) {
        Book jamesMaddison = new Book("James Maddison", "Hello America", 455, true);
        System.out.println("The Book Is " + jamesMaddison.title + ". It has " + jamesMaddison.noPages + " pages");
    }

}