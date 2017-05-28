package com.yeehom.ecommerseminiprog.pojo;

import java.io.Serializable;
import java.util.Date;

public class Region implements Serializable {
    private Integer pkid;

    private String regionname;

    private Integer level;

    private Integer parentid;

    private String citycode;

    private String adcode;

    private Double centerlng;

    private Double centerlat;

    private Integer provinceid;

    private String provincename;

    private Integer cityid;

    private String cityname;

    private Integer districtid;

    private String districtname;

    private Boolean isactive;

    private String createby;

    private Date createtime;

    private String modifyby;

    private Date modifytime;

    private static final long serialVersionUID = 1L;

    public Integer getPkid() {
        return pkid;
    }

    public void setPkid(Integer pkid) {
        this.pkid = pkid;
    }

    public String getRegionname() {
        return regionname;
    }

    public void setRegionname(String regionname) {
        this.regionname = regionname == null ? null : regionname.trim();
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    public String getCitycode() {
        return citycode;
    }

    public void setCitycode(String citycode) {
        this.citycode = citycode == null ? null : citycode.trim();
    }

    public String getAdcode() {
        return adcode;
    }

    public void setAdcode(String adcode) {
        this.adcode = adcode == null ? null : adcode.trim();
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

    public Integer getProvinceid() {
        return provinceid;
    }

    public void setProvinceid(Integer provinceid) {
        this.provinceid = provinceid;
    }

    public String getProvincename() {
        return provincename;
    }

    public void setProvincename(String provincename) {
        this.provincename = provincename == null ? null : provincename.trim();
    }

    public Integer getCityid() {
        return cityid;
    }

    public void setCityid(Integer cityid) {
        this.cityid = cityid;
    }

    public String getCityname() {
        return cityname;
    }

    public void setCityname(String cityname) {
        this.cityname = cityname == null ? null : cityname.trim();
    }

    public Integer getDistrictid() {
        return districtid;
    }

    public void setDistrictid(Integer districtid) {
        this.districtid = districtid;
    }

    public String getDistrictname() {
        return districtname;
    }

    public void setDistrictname(String districtname) {
        this.districtname = districtname == null ? null : districtname.trim();
    }

    public Boolean getIsactive() {
        return isactive;
    }

    public void setIsactive(Boolean isactive) {
        this.isactive = isactive;
    }

    public String getCreateby() {
        return createby;
    }

    public void setCreateby(String createby) {
        this.createby = createby == null ? null : createby.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getModifyby() {
        return modifyby;
    }

    public void setModifyby(String modifyby) {
        this.modifyby = modifyby == null ? null : modifyby.trim();
    }

    public Date getModifytime() {
        return modifytime;
    }

    public void setModifytime(Date modifytime) {
        this.modifytime = modifytime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", pkid=").append(pkid);
        sb.append(", regionname=").append(regionname);
        sb.append(", level=").append(level);
        sb.append(", parentid=").append(parentid);
        sb.append(", citycode=").append(citycode);
        sb.append(", adcode=").append(adcode);
        sb.append(", centerlng=").append(centerlng);
        sb.append(", centerlat=").append(centerlat);
        sb.append(", provinceid=").append(provinceid);
        sb.append(", provincename=").append(provincename);
        sb.append(", cityid=").append(cityid);
        sb.append(", cityname=").append(cityname);
        sb.append(", districtid=").append(districtid);
        sb.append(", districtname=").append(districtname);
        sb.append(", isactive=").append(isactive);
        sb.append(", createby=").append(createby);
        sb.append(", createtime=").append(createtime);
        sb.append(", modifyby=").append(modifyby);
        sb.append(", modifytime=").append(modifytime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}