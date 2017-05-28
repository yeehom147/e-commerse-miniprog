package com.yeehom.ecommerseminiprog.pojo;

import java.io.Serializable;
import java.util.Date;

public class Favorites implements Serializable {
    private Integer id;

    private Integer userId;

    private Integer shopeId;

    private Date createTime;

    private Double updateTime;

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

    public Integer getShopeId() {
        return shopeId;
    }

    public void setShopeId(Integer shopeId) {
        this.shopeId = shopeId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Double getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Double updateTime) {
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
        sb.append(", shopeId=").append(shopeId);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}