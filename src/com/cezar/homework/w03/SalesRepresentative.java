package com.cezar.homework.w03;

import java.util.ArrayList;

public class SalesRepresentative {
    private int revenue = 0;
    private ArrayList<Integer> salesList = new ArrayList<>();
    private String name = new String();

    public SalesRepresentative() {

    }

    public SalesRepresentative(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public int getRevenue() {
        return revenue;
    }

    public void sell(int value) {
        this.revenue += value;
        salesList.add(value);
    }


}
