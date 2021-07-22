package com.example.uicitybazar;

public class Banner
{
   private int id;
  private  String bannerName;
  private String bannerUrl;

   public Banner()
   {}

  public Banner(int id, String bannerName, String bannerUrl) {
    this.id = id;
    this.bannerName = bannerName;
    this.bannerUrl = bannerUrl;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getBannerName() {
    return bannerName;
  }

  public void setBannerName(String bannerName) {
    this.bannerName = bannerName;
  }

  public String getBannerUrl() {
    return bannerUrl;
  }

  public void setBannerUrl(String bannerUrl) {
    this.bannerUrl = bannerUrl;
  }
}
