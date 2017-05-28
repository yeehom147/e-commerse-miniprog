package com.yeehom.ecommerseminiprog.pojo;

import java.io.Serializable;
import java.util.Date;

public class Shop implements Serializable {
    private Integer id;

    private Integer userId;

    private String shopName;

    private String shopOwner;

    private Integer shopOwnerId;

    private Integer shopOwnerPhone;

    private Integer shopContact;

    private Boolean isVerified;

    private Date createTime;

    private Date updateTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName == null ? null : shopName.trim();
    }

    public String getShopOwner() {
        return shopOwner;
    }

    public void setShopOwner(String shopOwner) {
        this.shopOwner = shopOwner == null ? null : shopOwner.trim();
    }

    public Integer getShopOwnerId() {
        return shopOwnerId;
    }

    public void setShopOwnerId(Integer shopOwnerId) {
        this.shopOwnerId = shopOwnerId;
    }

    public Integer getShopOwnerPhone() {
        return shopOwnerPhone;
    }

    public void setShopOwnerPhone(Integer shopOwnerPhone) {
        this.shopOwnerPhone = shopOwnerPhone;
    }

    public Integer getShopContact() {
        return shopContact;
    }

    public void setShopContact(Integer shopContact) {
        this.shopContact = shopContact;
    }

    public Boolean getIsVerified() {
        return isVerified;
    }

    public void setIsVerified(Boolean isVerified) {
        this.isVerified = isVerified;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", shopName=").append(shopName);
        sb.append(", shopOwner=").append(shopOwner);
        sb.append(", shopOwnerId=").append(shopOwnerId);
        sb.append(", shopOwnerPhone=").append(shopOwnerPhone);
        sb.append(", shopContact=").append(shopContact);
        sb.append(", isVerified=").append(isVerified);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}