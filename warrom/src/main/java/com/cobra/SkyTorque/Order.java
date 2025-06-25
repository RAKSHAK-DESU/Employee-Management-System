package com.cobra.SkyTorque;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Order {
    private int oid;
    private String status;

    private Product prod;

    @Autowired
    private Discount discount;

    public Discount getDiscount() {
        return discount;
    }

    @Override
    public String toString() {
        return "Order{" +
                "oid=" + oid +
                ", status='" + status + '\'' +
                ", prod=" + prod +
                ", discount=" + discount +
                '}';
    }

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }

    public Order(Product prod){
        this.prod=prod;
    }
    public int getOid() {
        return oid;
    }
    public void setOid(int oid) {
        this.oid = oid;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Product getProd() {
        return prod;
    }

    public void setProd(Product prod) {
        this.prod = prod;
    }


}
