package com.yeehom.ecommerseminiprog.pojo;

import java.io.Serializable;
import java.util.Date;

public class ShopProfile implements Serializable {
    private Integer id;

    private Integer shopId;

    private Integer shopRegion;

    private String shopDetailAddress;

    private Integer shopType;

    private String shopLicense;

    private Integer shopSalesVolume;

    private String shopDes;

    private Integer shopFollows;

    private Date createTime;

    private Date updateTime;

    private byte[] shopLicenseImg;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public Integer getShopRegion() {
        return shopRegion;
    }

    public void setShopRegion(Integer shopRegion) {
        this.shopRegion = shopRegion;
    }

    public String getShopDetailAddress() {
        return shopDetailAddress;
    }

    public void setShopDetailAddress(String shopDetailAddress) {
        this.shopDetailAddress = shopDetailAddress == null ? null : shopDetailAddress.trim();
    }

    public Integer getShopType() {
        return shopType;
    }

    public void setShopType(Integer shopType) {
        this.shopType = shopType;
    }

    public String getShopLicense() {
        return shopLicense;
    }

    public void setShopLicense(String shopLicense) {
        this.shopLicense = shopLicense == null ? null : shopLicense.trim();
    }

    public Integer getShopSalesVolume() {
        return shopSalesVolume;
    }

    public void setShopSalesVolume(Integer shopSalesVolume) {
        this.shopSalesVolume = shopSalesVolume;
    }

    public String getShopDes() {
        return shopDes;
    }

    public void setShopDes(String shopDes) {
        this.shopDes = shopDes == null ? null : shopDes.trim();
    }

    public Integer getShopFollows() {
        return shopFollows;
    }

    public void setShopFollows(Integer shopFollows) {
        this.shopFollows = shopFollows;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public byte[] getShopLicenseImg() {
        return shopLicenseImg;
    }

    public void setShopLicenseImg(byte[] shopLicenseImg) {
        this.shopLicenseImg = shopLicenseImg;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", shopId=").append(shopId);
        sb.append(", shopRegion=").append(shopRegion);
        sb.append(", shopDetailAddress=").append(shopDetailAddress);
        sb.append(", shopType=").append(shopType);
        sb.append(", shopLicense=").append(shopLicense);
        sb.append(", shopSalesVolume=").append(shopSalesVolume);
        sb.append(", shopDes=").append(shopDes);
        sb.append(", shopFollows=").append(shopFollows);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", shopLicenseImg=").append(shopLicenseImg);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}