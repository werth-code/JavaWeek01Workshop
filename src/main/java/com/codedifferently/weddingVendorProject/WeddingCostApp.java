package com.codedifferently.weddingVendorProject;
import static java.lang.Integer.parseInt;

public class WeddingCostApp {
    public static void main(String[] args) {
        System.out.println("What Is Your Total Wedding Budget?  ");
        int totalBudget = parseInt(System.console().readLine());

        System.out.println("What Is Your Vendors Name?  ");
        String vendorName = System.console().readLine();

        System.out.println("What Type Of Vendor? (i.e Photographer)  ");
        String vendorType = System.console().readLine();

        WeddingVendor vendor = new WeddingVendor(totalBudget, vendorName, vendorType);
        int vendorCostCalc = vendor.vendorCost();

        System.out.printf("This is my photographer: %s %n", vendor.nameOfVendor);
        System.out.printf("Total Budget: $%d.%n%s Costs $%d%n",
                         totalBudget,
                         vendor.nameOfVendor,
                         vendorCostCalc);

    }
}