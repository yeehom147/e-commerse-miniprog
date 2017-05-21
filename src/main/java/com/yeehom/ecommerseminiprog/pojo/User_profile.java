package com.yeehom.ecommerseminiprog.pojo;

public class User_profile {
  private Long id;
  private String user_name;
  private String user_nick_name;
  private Long user_gender;
  private Long user_type;

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

  public String getUser_nick_name() {
    return user_nick_name;
  }

  public void setUser_nick_name(String user_nick_name) {
    this.user_nick_name = user_nick_name;
  }

  public Long getUser_gender() {
    return user_gender;
  }

  public void setUser_gender(Long user_gender) {
    this.user_gender = user_gender;
  }

  public Long getUser_type() {
    return user_type;
  }

  public void setUser_type(Long user_type) {
    this.user_type = user_type;
  }
}
