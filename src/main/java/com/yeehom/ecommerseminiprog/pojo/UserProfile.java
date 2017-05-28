package com.yeehom.ecommerseminiprog.pojo;

import java.io.Serializable;
import java.util.Date;

public class UserProfile implements Serializable {
    private Integer id;

    private Integer userId;

    private String userNickName;

    private Integer userGender;

    private Integer userType;

    private Integer userRegion;

    private String userAddress;

    private Date createTime;

    private Date updateTime;

    private byte[] userAvartar;

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

    public String getUserNickName() {
        return userNickName;
    }

    public void setUserNickName(String userNickName) {
        this.userNickName = userNickName == null ? null : userNickName.trim();
    }

    public Integer getUserGender() {
        return userGender;
    }

    public void setUserGender(Integer userGender) {
        this.userGender = userGender;
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public Integer getUserRegion() {
        return userRegion;
    }

    public void setUserRegion(Integer userRegion) {
        this.userRegion = userRegion;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress == null ? null : userAddress.trim();
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

    public byte[] getUserAvartar() {
        return userAvartar;
    }

    public void setUserAvartar(byte[] userAvartar) {
        this.userAvartar = userAvartar;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", userNickName=").append(userNickName);
        sb.append(", userGender=").append(userGender);
        sb.append(", userType=").append(userType);
        sb.append(", userRegion=").append(userRegion);
        sb.append(", userAddress=").append(userAddress);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", userAvartar=").append(userAvartar);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}