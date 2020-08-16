package com.cezar.homework.w03;

import java.lang.Math;

/**
 * Using bubble sort algorithm to sort a list of sales persons based on their revenues.
 *
 * Create a number of instances of SalesRepresentative Class.
 *
 * Each instance represents a sales person.
 * Create a list with those sales representatives.
 *
 * Print the list before and after sorting.
 *
 * @author Cezar Florea
 */
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
     * This method is simulating the sales for each seller.
     * Each seller is assigned a random number of sales.
     * Each sale has a random value.
     * @param salesGuy - seller for whom to simulate the sales
     */
    public static void simulateSells (SalesRepresentative salesGuy) {
        int nrOfSales = (int) (Math.random() * 10);

        for (int i = 0; i < nrOfSales; i++){
            int saleValue = (int) (Math.random() * 1000 ) + (int) (Math.random() * 100) + (int) (Math.random() * 10);
            salesGuy.sell(saleValue);
        }
    }

    /**
     * Print on console the list of sellers
     * @param sellerList - the list to be printed
     */
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
