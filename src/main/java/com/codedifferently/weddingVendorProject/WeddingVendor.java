package com.codedifferently.weddingVendorProject;

public class WeddingVendor {
    private int totalBudget;
    String nameOfVendor;
    String typeOfVendor; //The type, like photo, video etc.
    int percentOfBudget; //The % of total wedding budget this vendor costs.

    public WeddingVendor(String nameOfVendor, String vendorType, int percentOfBudget) {
        this.nameOfVendor = nameOfVendor;
        this.typeOfVendor = vendorType;
        this.percentOfBudget = percentOfBudget;
    }    

    public void setBudget(int totalBudget) {
        this.totalBudget = totalBudget;
    }

    public int getBudget() {
        return totalBudget;
    }

    public int vendorCost() {
        return (int) ((getBudget() / 100) * percentOfBudget);
    }
}

//     //Another Constructor
//     public Book(String authorIn, String titleIn, Integer noPagesIn, boolean isGoodIn) {
//         this.author = authorIn;
//         this.title = titleIn;
//         this.noPages = noPagesIn;
//         this.isGood = isGoodIn;
//     }
// }