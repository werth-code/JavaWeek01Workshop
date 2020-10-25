package com.codedifferently.part01;

public class Menu {
    private String[] categories;

    //Constructor
    public Menu() {
        this.categories = new String[] {"a", "b", "c"};
    }

    public Menu(String[] categoriesIn) {
        this.categories = categoriesIn;
    }
    
    public String getCategory(Integer index) {
        return categories[index];
    }
}