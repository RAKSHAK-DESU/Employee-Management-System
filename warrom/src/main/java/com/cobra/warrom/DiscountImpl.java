package com.cobra.warrom;

public class DiscountImpl implements Discount{
    @Override
    public void getDiscount() {
        System.out.println("You Got 10% Discount");
    }
}
