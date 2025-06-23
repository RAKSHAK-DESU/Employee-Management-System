package com.cobra.warrom;

import org.springframework.stereotype.Component;

@Component
public class Order {
    private int oid;
    private String oname;

    public int getOid() {
        return oid;
    }

    public String getOname() {
        return oname;
    }

    public void setOname(String oname) {
        this.oname = oname;
    }

    public void setOid(int oid) {
        this.oid = oid;
    }

    @Override
    public String toString() {
        return "Order{" +
                "oid=" + oid +
                ", oname='" + oname + '\'' +
                '}';
    }
}
