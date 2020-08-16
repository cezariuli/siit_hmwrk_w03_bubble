package com.cezar.homework.w03;

import java.lang.Math;

public class Main {

    public static SalesRepresentative salesGuy1 = new SalesRepresentative("salesGuy1");
    public static SalesRepresentative salesGuy2 = new SalesRepresentative("salesGuy2");
    public static SalesRepresentative salesGuy3 = new SalesRepresentative("salesGuy3");
    public static SalesRepresentative salesGuy4 = new SalesRepresentative("salesGuy4");
    public static SalesRepresentative salesGuy5 = new SalesRepresentative("salesGuy5");
    public static SalesRepresentative salesGuy6 = new SalesRepresentative("salesGuy6");
    public static SalesRepresentative salesGuy7 = new SalesRepresentative("salesGuy7");

    public static SalesRepresentative[] reps = {salesGuy1, salesGuy2, salesGuy3, salesGuy4, salesGuy5, salesGuy6, salesGuy7};
    public static SalesRepresentative[] sortedReps;

    public static void main(String[] args) {
	// write your code here

        for (int i = 0; i < 7; i++){
            simulateSells(reps[i]);
        }

        System.out.println("Showing the list of sales representatives before sorting");
        listSellers(reps);

        System.out.println("\nShowing the sorted list of sales reps");
        sortedReps = new Main().sort(reps);
        listSellers(sortedReps);

    }

    /**
     * create a method that is simulating the sales for each seller;
     * @param salesGuy
     */
    public static void simulateSells (SalesRepresentative salesGuy) {
        int nrOfSales = (int) (Math.random() * 10);

        for (int i = 0; i < nrOfSales; i++){
            int saleValue = (int) (Math.random() * 1000 ) + (int) (Math.random() * 100) + (int) (Math.random() * 10);
            salesGuy.sell(saleValue);
        }
    }

    public static void listSellers(SalesRepresentative[] sellerList) {

        for (int i = 0; i < sellerList.length; i++) {

            System.out.println("\tRevenue of " + sellerList[i].getName() + " is: $" + sellerList[i].getRevenue());
            if (sellerList[i].getRevenue() == 0) {
                System.out.println("\t\tOMG! This guy should be fired");
            }
        }
    }

    /**
     * This is the Bubble sort implementation
     * @param sellersList - the array that should be sorted
     * @return sellersList - the sorted array
     */
    public SalesRepresentative[] sort(SalesRepresentative[] sellersList){
        SalesRepresentative temp = new SalesRepresentative();
        boolean sorted;
        do {
            sorted = true;
            for (int i = 0; i < sellersList.length - 1; i++) {
                if (sellersList[i].getRevenue() < sellersList[i+1].getRevenue()) {
                    temp = sellersList[i];
                    sellersList[i] = sellersList[i+1];
                    sellersList[i+1] = temp;
                    sorted = false;
                }
            }
        } while(!sorted);

        return sellersList;
    }


}
