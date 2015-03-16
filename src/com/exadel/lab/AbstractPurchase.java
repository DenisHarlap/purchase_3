package com.exadel.lab;

/**
 * Created by Denis on 12.02.15.
 */
public abstract class AbstractPurchase implements Comparable <AbstractPurchase>{

    private Commodity commodity;
    private int countUnit;

    public AbstractPurchase(Commodity commodity, int countUnit) {
        this.commodity = commodity;
        this.countUnit = countUnit;
    }

    public AbstractPurchase (){}

    public Commodity getCommodity() {
        return commodity;
    }

    public int getCountUnit() {
        return countUnit;
    }

    public void setCountUnit(int countUnit) {
        this.countUnit = countUnit;
    }

    @Override
    public String toString() {
        return commodity + Integer.toString(countUnit) + ";" + getCost() + ";";
    }

    public abstract int getCost();

    @Override
    public int compareTo(AbstractPurchase purchase) {
        return purchase.getCost() - this.getCost();
    }
}
