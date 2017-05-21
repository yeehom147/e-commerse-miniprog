package com.yeehom.ecommerseminiprog.pojo;

public class Goods {
  private Long id;
  private Long shop_id;
  private String goods_name;
  private Long goods_type;
  private String goods_des;
  private String goods_img;
  private Double goods_orig_price;
  private Double goods_pref_price;
  private Long goods_avaible;
  private Long goods_sales_volume;

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

  public String getGoods_name() {
    return goods_name;
  }

  public void setGoods_name(String goods_name) {
    this.goods_name = goods_name;
  }

  public Long getGoods_type() {
    return goods_type;
  }

  public void setGoods_type(Long goods_type) {
    this.goods_type = goods_type;
  }

  public String getGoods_des() {
    return goods_des;
  }

  public void setGoods_des(String goods_des) {
    this.goods_des = goods_des;
  }

  public String getGoods_img() {
    return goods_img;
  }

  public void setGoods_img(String goods_img) {
    this.goods_img = goods_img;
  }

  public Double getGoods_orig_price() {
    return goods_orig_price;
  }

  public void setGoods_orig_price(Double goods_orig_price) {
    this.goods_orig_price = goods_orig_price;
  }

  public Double getGoods_pref_price() {
    return goods_pref_price;
  }

  public void setGoods_pref_price(Double goods_pref_price) {
    this.goods_pref_price = goods_pref_price;
  }

  public Long getGoods_avaible() {
    return goods_avaible;
  }

  public void setGoods_avaible(Long goods_avaible) {
    this.goods_avaible = goods_avaible;
  }

  public Long getGoods_sales_volume() {
    return goods_sales_volume;
  }

  public void setGoods_sales_volume(Long goods_sales_volume) {
    this.goods_sales_volume = goods_sales_volume;
  }
}
