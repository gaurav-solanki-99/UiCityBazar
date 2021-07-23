package com.example.uicitybazar.Model;

public class TopProduct {

    private int id;
    private String productNAme;
    private String productImage;
    private String productPrice;
    private String offPer;

    public TopProduct() {
    }

    public TopProduct(int id, String productNAme, String productImage, String productPrice, String offPer) {
        this.id = id;
        this.productNAme = productNAme;
        this.productImage = productImage;
        this.productPrice = productPrice;
        this.offPer = offPer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductNAme() {
        return productNAme;
    }

    public void setProductNAme(String productNAme) {
        this.productNAme = productNAme;
    }

    public String getProductImage() {
        return productImage;
    }

    public void setProductImage(String productImage) {
        this.productImage = productImage;
    }

    public String getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(String productPrice) {
        this.productPrice = productPrice;
    }

    public String getOffPer() {
        return offPer;
    }

    public void setOffPer(String offPer) {
        this.offPer = offPer;
    }
}
