package com.example.springbootweb1;

public class Alien {

    private int aid;
    private String aName;


    public int getAid() {
        return aid;
    }
    public void setAid(int aid) {
        this.aid = aid;
    }
    public String getaName() {
        return aName;
    }
    public void setaName(String aName) {
        this.aName = aName;
    }
    
    @Override
    public String toString() {
        return "Alien [aid=" + aid + ", aName=" + aName + "]";
    }


    
}
