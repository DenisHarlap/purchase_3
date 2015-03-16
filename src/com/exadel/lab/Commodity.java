package com.exadel.lab;

/**
 * Created by Denis on 12.02.15.
 */
public class Commodity {

    private String commodityName;
    private int price;

    public Commodity(String commodityName, int price) {
        this.commodityName = commodityName;
        this.price = price;
    }

    public Commodity (){}

    public String getCommodityName() {
        return commodityName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return commodityName + ";" + price + ";";
    }
}
