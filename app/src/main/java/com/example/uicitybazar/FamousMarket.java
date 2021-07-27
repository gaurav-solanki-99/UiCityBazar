package com.example.uicitybazar;

public class FamousMarket
{
    private String marketIamge;
    private String marketName;

    public FamousMarket()
    {}

    public FamousMarket(String marketIamge, String marketName) {
        this.marketIamge = marketIamge;
        this.marketName = marketName;
    }

    public String getMarketIamge() {
        return marketIamge;
    }

    public void setMarketIamge(String marketIamge) {
        this.marketIamge = marketIamge;
    }

    public String getMarketName() {
        return marketName;
    }

    public void setMarketName(String marketName) {
        this.marketName = marketName;
    }
}
