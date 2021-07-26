package com.example.uicitybazar.Model;

public class TopShopes
{
     private int shopeId;
     private String  shopeImage;
     private String shopeName;
     private String shopeAdd;
     private  String shopeContact;
     private int shopeRate;
     private int shopeDistance;

     public TopShopes()
     {}


    public TopShopes(int shopeId, String shopeImage, String shopeName, String shopeAdd, String shopeContact, int shopeRate, int shopeDistance) {
        this.shopeId = shopeId;
        this.shopeImage = shopeImage;
        this.shopeName = shopeName;
        this.shopeAdd = shopeAdd;
        this.shopeContact = shopeContact;
        this.shopeRate = shopeRate;
        this.shopeDistance = shopeDistance;
    }

    public int getShopeId() {
        return shopeId;
    }

    public void setShopeId(int shopeId) {
        this.shopeId = shopeId;
    }

    public String getShopeImage() {
        return shopeImage;
    }

    public void setShopeImage(String shopeImage) {
        this.shopeImage = shopeImage;
    }

    public String getShopeName() {
        return shopeName;
    }

    public void setShopeName(String shopeName) {
        this.shopeName = shopeName;
    }

    public String getShopeAdd() {
        return shopeAdd;
    }

    public void setShopeAdd(String shopeAdd) {
        this.shopeAdd = shopeAdd;
    }

    public String getShopeContact() {
        return shopeContact;
    }

    public void setShopeContact(String shopeContact) {
        this.shopeContact = shopeContact;
    }

    public int getShopeRate() {
        return shopeRate;
    }

    public void setShopeRate(int shopeRate) {
        this.shopeRate = shopeRate;
    }

    public int getShopeDistance() {
        return shopeDistance;
    }

    public void setShopeDistance(int shopeDistance) {
        this.shopeDistance = shopeDistance;
    }
}
