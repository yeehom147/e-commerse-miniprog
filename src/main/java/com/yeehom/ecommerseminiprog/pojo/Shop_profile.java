package com.yeehom.ecommerseminiprog.pojo;

public class Shop_profile {
  private Long id;
  private Long shop_id;
  private Long shop_region;
  private String shop_detail_address;
  private Long shop_type;
  private String shop_license;
  private String shop_license_img;
  private Long shop_sales_volume;
  private String shop_des;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Long getShop_id() {
    return shop_id;
  }

  public void setShop_id(Long shop_id) {
    this.shop_id = shop_id;
  }

  public Long getShop_region() {
    return shop_region;
  }

  public void setShop_region(Long shop_region) {
    this.shop_region = shop_region;
  }

  public String getShop_detail_address() {
    return shop_detail_address;
  }

  public void setShop_detail_address(String shop_detail_address) {
    this.shop_detail_address = shop_detail_address;
  }

  public Long getShop_type() {
    return shop_type;
  }

  public void setShop_type(Long shop_type) {
    this.shop_type = shop_type;
  }

  public String getShop_license() {
    return shop_license;
  }

  public void setShop_license(String shop_license) {
    this.shop_license = shop_license;
  }

  public String getShop_license_img() {
    return shop_license_img;
  }

  public void setShop_license_img(String shop_license_img) {
    this.shop_license_img = shop_license_img;
  }

  public Long getShop_sales_volume() {
    return shop_sales_volume;
  }

  public void setShop_sales_volume(Long shop_sales_volume) {
    this.shop_sales_volume = shop_sales_volume;
  }

  public String getShop_des() {
    return shop_des;
  }

  public void setShop_des(String shop_des) {
    this.shop_des = shop_des;
  }
}
