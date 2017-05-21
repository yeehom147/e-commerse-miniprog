package com.yeehom.ecommerseminiprog.pojo;

import org.springframework.stereotype.Component;

@Component
public class User {
  private Long id;
  private String user_name;
  private String user_pwd;
  private String user_email;
  private Long user_phone;
  private java.sql.Date reg_time;
  private String user_nick_name;
  private Long user_gender;

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

  public String getUser_pwd() {
    return user_pwd;
  }

  public void setUser_pwd(String user_pwd) {
    this.user_pwd = user_pwd;
  }

  public String getUser_email() {
    return user_email;
  }

  public void setUser_email(String user_email) {
    this.user_email = user_email;
  }

  public Long getUser_phone() {
    return user_phone;
  }

  public void setUser_phone(Long user_phone) {
    this.user_phone = user_phone;
  }

  public java.sql.Date getReg_time() {
    return reg_time;
  }

  public void setReg_time(java.sql.Date reg_time) {
    this.reg_time = reg_time;
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

  @Override
  public String toString() {
    return "User{" +
            "id=" + id +
            ", user_name='" + user_name + '\'' +
            ", user_pwd='" + user_pwd + '\'' +
            ", user_email='" + user_email + '\'' +
            ", user_phone=" + user_phone +
            ", reg_time=" + reg_time +
            ", user_nick_name='" + user_nick_name + '\'' +
            ", user_gender=" + user_gender +
            '}';
  }
}
