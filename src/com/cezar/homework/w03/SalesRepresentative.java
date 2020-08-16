package com.cezar.homework.w03;

import java.util.ArrayList;

/**
 * Defining the properties of the sales representatives.
 * Each sales person has a total revenue of his/her sales.
 * Each sale made by a seller it is stored in a list of his/her sales.
 *
 * @author Cezar Florea
 */
public class SalesRepresentative {

    private int revenue = 0;
    private ArrayList<Integer> salesList = new ArrayList<>();
    private String name = new String();

    /**
     * Default constructor.
     *
     */
    public SalesRepresentative() {

    }

    /**
     * Create a new seller with a name.
     * @param name - name of the seller
     */
    public SalesRepresentative(String name) {
        this.name = name;
    }

    /**
     * Get the @name of the seller.
     *
     */
    public String getName(){
        return name;
    }

    /**
     * Get the total revenue of a sales rep.
     * @return
     */
    public int getRevenue() {
        return revenue;
    }

    /**
     * After each sell of a seller add it to his/her total sales and store it in a list of sales.
     * @param value - value of the current sell
     */
    public void sell(int value) {
        this.revenue += value;
        salesList.add(value);
    }

}
