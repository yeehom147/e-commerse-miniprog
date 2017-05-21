package com.yeehom.ecommerseminiprog.pojo;

public class Region {
  private Long pkid;
  private String regionname;
  private Long level;
  private Long parentid;
  private String citycode;
  private String adcode;
  private Double centerlng;
  private Double centerlat;
  private Long provinceid;
  private String provincename;
  private Long cityid;
  private String cityname;
  private Long districtid;
  private String districtname;
  private String isactive;
  private String createby;
  private java.sql.Timestamp createtime;
  private String modifyby;
  private java.sql.Timestamp modifytime;

  public Long getPkid() {
    return pkid;
  }

  public void setPkid(Long pkid) {
    this.pkid = pkid;
  }

  public String getRegionname() {
    return regionname;
  }

  public void setRegionname(String regionname) {
    this.regionname = regionname;
  }

  public Long getLevel() {
    return level;
  }

  public void setLevel(Long level) {
    this.level = level;
  }

  public Long getParentid() {
    return parentid;
  }

  public void setParentid(Long parentid) {
    this.parentid = parentid;
  }

  public String getCitycode() {
    return citycode;
  }

  public void setCitycode(String citycode) {
    this.citycode = citycode;
  }

  public String getAdcode() {
    return adcode;
  }

  public void setAdcode(String adcode) {
    this.adcode = adcode;
  }

  public Double getCenterlng() {
    return centerlng;
  }

  public void setCenterlng(Double centerlng) {
    this.centerlng = centerlng;
  }

  public Double getCenterlat() {
    return centerlat;
  }

  public void setCenterlat(Double centerlat) {
    this.centerlat = centerlat;
  }

  public Long getProvinceid() {
    return provinceid;
  }

  public void setProvinceid(Long provinceid) {
    this.provinceid = provinceid;
  }

  public String getProvincename() {
    return provincename;
  }

  public void setProvincename(String provincename) {
    this.provincename = provincename;
  }

  public Long getCityid() {
    return cityid;
  }

  public void setCityid(Long cityid) {
    this.cityid = cityid;
  }

  public String getCityname() {
    return cityname;
  }

  public void setCityname(String cityname) {
    this.cityname = cityname;
  }

  public Long getDistrictid() {
    return districtid;
  }

  public void setDistrictid(Long districtid) {
    this.districtid = districtid;
  }

  public String getDistrictname() {
    return districtname;
  }

  public void setDistrictname(String districtname) {
    this.districtname = districtname;
  }

  public String getIsactive() {
    return isactive;
  }

  public void setIsactive(String isactive) {
    this.isactive = isactive;
  }

  public String getCreateby() {
    return createby;
  }

  public void setCreateby(String createby) {
    this.createby = createby;
  }

  public java.sql.Timestamp getCreatetime() {
    return createtime;
  }

  public void setCreatetime(java.sql.Timestamp createtime) {
    this.createtime = createtime;
  }

  public String getModifyby() {
    return modifyby;
  }

  public void setModifyby(String modifyby) {
    this.modifyby = modifyby;
  }

  public java.sql.Timestamp getModifytime() {
    return modifytime;
  }

  public void setModifytime(java.sql.Timestamp modifytime) {
    this.modifytime = modifytime;
  }
}
