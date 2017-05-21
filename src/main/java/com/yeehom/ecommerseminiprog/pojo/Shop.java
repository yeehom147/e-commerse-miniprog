package com.yeehom.ecommerseminiprog.pojo;

public class Shop {
  private Long id;
  private String user_name;
  private String shop_name;
  private String shop_owner;
  private Long shop_owner_id;
  private Long shop_owner_phone;
  private java.sql.Date shop_reg_time;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getUser_name() {
    return user_name;
  }

  public void setUser_name(String user_name) {
    this.user_name = user_name;
  }

  public String getShop_name() {
    return shop_name;
  }

  public void setShop_name(String shop_name) {
    this.shop_name = shop_name;
  }

  public String getShop_owner() {
    return shop_owner;
  }

  public void setShop_owner(String shop_owner) {
    this.shop_owner = shop_owner;
  }

  public Long getShop_owner_id() {
    return shop_owner_id;
  }

  public void setShop_owner_id(Long shop_owner_id) {
    this.shop_owner_id = shop_owner_id;
  }

  public Long getShop_owner_phone() {
    return shop_owner_phone;
  }

  public void setShop_owner_phone(Long shop_owner_phone) {
    this.shop_owner_phone = shop_owner_phone;
  }

  public java.sql.Date getShop_reg_time() {
    return shop_reg_time;
  }

  public void setShop_reg_time(java.sql.Date shop_reg_time) {
    this.shop_reg_time = shop_reg_time;
  }
}
