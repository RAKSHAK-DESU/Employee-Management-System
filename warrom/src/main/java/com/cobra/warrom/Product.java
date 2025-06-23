package com.cobra.warrom;

import org.springframework.stereotype.Component;

@Component
public class Product {
    private int pid;
    private String pname;

    public void setPid(int pid){
        this.pid=pid;
    }

    public int getPid(){
        return pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    @Override
    public String toString() {
        return "Product{" +
                "pid=" + pid +
                ", pname='" + pname + '\'' +
                '}';
    }
}
