package com.cobra.SkyTorque;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Qualifier("primeDisc")
@Component
public class PrimeDiscount implements Discount{

    @Override
    public void calculateDiscount() {
        System.out.println("You Get 20% Discount");
    }
}
