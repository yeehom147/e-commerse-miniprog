package com.yeehom.ecommerseminiprog.pojo;

import java.io.Serializable;
import java.util.Date;

public class Goods implements Serializable {
    private Integer id;

    private Integer shopId;

    private String goodsName;

    private Integer goodsType;

    private String goodsDes;

    private Double goodsOrigPrice;

    private Double goodsPrefPrice;

    private Boolean goodsAvaible;

    private Integer goodsSalesVolume;

    private Date createTime;

    private Date updateTime;

    private byte[] goodsImg;

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

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    public Integer getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(Integer goodsType) {
        this.goodsType = goodsType;
    }

    public String getGoodsDes() {
        return goodsDes;
    }

    public void setGoodsDes(String goodsDes) {
        this.goodsDes = goodsDes == null ? null : goodsDes.trim();
    }

    public Double getGoodsOrigPrice() {
        return goodsOrigPrice;
    }

    public void setGoodsOrigPrice(Double goodsOrigPrice) {
        this.goodsOrigPrice = goodsOrigPrice;
    }

    public Double getGoodsPrefPrice() {
        return goodsPrefPrice;
    }

    public void setGoodsPrefPrice(Double goodsPrefPrice) {
        this.goodsPrefPrice = goodsPrefPrice;
    }

    public Boolean getGoodsAvaible() {
        return goodsAvaible;
    }

    public void setGoodsAvaible(Boolean goodsAvaible) {
        this.goodsAvaible = goodsAvaible;
    }

    public Integer getGoodsSalesVolume() {
        return goodsSalesVolume;
    }

    public void setGoodsSalesVolume(Integer goodsSalesVolume) {
        this.goodsSalesVolume = goodsSalesVolume;
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

    public byte[] getGoodsImg() {
        return goodsImg;
    }

    public void setGoodsImg(byte[] goodsImg) {
        this.goodsImg = goodsImg;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", shopId=").append(shopId);
        sb.append(", goodsName=").append(goodsName);
        sb.append(", goodsType=").append(goodsType);
        sb.append(", goodsDes=").append(goodsDes);
        sb.append(", goodsOrigPrice=").append(goodsOrigPrice);
        sb.append(", goodsPrefPrice=").append(goodsPrefPrice);
        sb.append(", goodsAvaible=").append(goodsAvaible);
        sb.append(", goodsSalesVolume=").append(goodsSalesVolume);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", goodsImg=").append(goodsImg);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}