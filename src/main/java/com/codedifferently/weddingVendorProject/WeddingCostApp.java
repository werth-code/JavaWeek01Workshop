package com.codedifferently.weddingVendorProject;

public class WeddingCostApp {
    public static void main(String[] args) {

        WeddingVendor vendor = new WeddingVendor("Werth Photography", "Photographer", 12);
        System.out.printf("This is my photographer: %s %n", vendor.nameOfVendor);

        vendor.setBudget(40000);
        int totalBudget = vendor.getBudget();
        int vendorCost = vendor.vendorCost();

        System.out.printf("Total Budget: $%d.%n%s Costs $%d%n",
                         totalBudget,
                         vendor.nameOfVendor,
                         vendorCost);

    }
}