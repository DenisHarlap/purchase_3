package com.exadel.lab;

/**
 * Created by Denis on 12.02.15.
 */
public class CheapPurchase extends AbstractPurchase {

    private int unitDiscount;

    public CheapPurchase (){}

    public CheapPurchase(Commodity commodity, int countUnit, int unitDiscount) {
        super(commodity, countUnit);
        this.unitDiscount = unitDiscount;
    }

    public int getUnitDiscount() {
        return unitDiscount;
    }

    @Override
    public int getCost() {
        return (this.getCommodity().getPrice() - unitDiscount)*this.getCountUnit();
    }

    @Override
    public String toString() {
        return  super.toString() + unitDiscount + ";";
    }
}
