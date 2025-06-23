package com.cobra.warrom;

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
}
