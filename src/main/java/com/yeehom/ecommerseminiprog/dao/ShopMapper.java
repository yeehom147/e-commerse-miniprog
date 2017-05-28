package com.yeehom.ecommerseminiprog.dao;

import com.yeehom.ecommerseminiprog.pojo.Shop;
import java.util.List;

public interface ShopMapper {
    int insert(Shop record);

    List<Shop> selectAll();
}