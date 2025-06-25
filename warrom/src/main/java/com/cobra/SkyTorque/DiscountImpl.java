package com.cobra.SkyTorque;

import org.springframework.stereotype.Component;

@Component
public class DiscountImpl implements Discount{
    @Override
    public void calculateDiscount() {
        System.out.println("You Got 10% Discount");
    }
}
