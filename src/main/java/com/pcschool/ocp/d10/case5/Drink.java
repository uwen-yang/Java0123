package com.pcschool.ocp.d10.case5;

public class Drink implements Comparable<Drink>{
    private String name;
    private int prices;

    public Drink(String name, int prices) {
        this.name = name;
        this.prices = prices;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrices() {
        return prices;
    }

    public void setPrices(int prices) {
        this.prices = prices;
    }

    @Override
    public String toString() {
        return "Drink{" + "name=" + name + ", prices=" + prices + '}';
    }

    @Override
    public int compareTo(Drink other) {
        return other.prices - prices;
    }
}
