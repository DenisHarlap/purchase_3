package com.exadel.lab;

/**
 * Created by Denis on 12.02.15.
 */
public class RealPurchase extends AbstractPurchase {

    private int additionalExpense;

    public RealPurchase(Commodity commodity, int countUnit, int additionalExpense) {
        super(commodity, countUnit);
        this.additionalExpense = additionalExpense;
    }

    public RealPurchase(){}

    public int getAdditionalExpense() {
        return additionalExpense;
    }

    @Override
    public int getCost() {
        return this.getCommodity().getPrice() * this.getCountUnit()
                + additionalExpense;
    }

    @Override
    public String toString() {
        return  super.toString() + additionalExpense + ";";
    }
}
