package com.yeehom.ecommerseminiprog.dao;

import com.yeehom.ecommerseminiprog.pojo.ShopProfile;
import java.util.List;

public interface ShopProfileMapper {
    int insert(ShopProfile record);

    List<ShopProfile> selectAll();
}