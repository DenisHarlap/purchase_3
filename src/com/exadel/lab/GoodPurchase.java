package com.exadel.lab;

/**
 * Created by Denis on 12.02.15.
 */
public class GoodPurchase extends AbstractPurchase {

    private double discountPercent;
    private final int LEVEL_UNIT = 30;

    public GoodPurchase (){}

    public GoodPurchase(Commodity commodity, int countUnit, double discountPercent) {
        super(commodity, countUnit);
        this.discountPercent = discountPercent;
    }

    public double getDiscountPercent() {
        return discountPercent;
    }

    @Override
    public int getCost() {
        if (this.getCountUnit() > LEVEL_UNIT)
            return (int)(this.getCommodity().getPrice()*this.getCountUnit()
                    *(1 - discountPercent/100));
        else
            return this.getCommodity().getPrice()*this.getCountUnit();
    }

    @Override
    public String toString() {
        return super.toString() + discountPercent + ";";
    }
}
