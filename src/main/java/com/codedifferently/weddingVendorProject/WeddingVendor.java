package com.codedifferently.weddingVendorProject;
import static java.lang.Integer.parseInt;

public class WeddingVendor {
    private int totalBudget;
    String nameOfVendor;
    String typeOfVendor; //The type, like photo, video etc.
    int percentOfBudget; //The % of total wedding budget this vendor costs.

    public WeddingVendor(int totalBudget, String nameOfVendor, String vendorType) {
        this.totalBudget = totalBudget;
        this.nameOfVendor = nameOfVendor;
        this.typeOfVendor = vendorType;
        this.percentOfBudget = typeOfVendor(vendorType);
    }    

    public int typeOfVendor(String vendorType) {
        int foundPercent;

        if(vendorType.equalsIgnoreCase("photographer") 
        || vendorType.equalsIgnoreCase("photo") 
        || vendorType.equalsIgnoreCase("photographers")) foundPercent = 12;

        if(vendorType.equalsIgnoreCase("videographer") 
        || vendorType.equalsIgnoreCase("video") 
        || vendorType.equalsIgnoreCase("videographers")) foundPercent = 10;

        if(vendorType.equalsIgnoreCase("venue") 
        || vendorType.equalsIgnoreCase("reception") 
        || vendorType.equalsIgnoreCase("venues")) foundPercent = 30;

        else {
            System.out.printf("What % Of Your Budget Does This Vendor, (%s) Cost?  ", vendorType);
            foundPercent = parseInt(System.console().readLine());
        }

        return foundPercent;
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