package com.yeehom.ecommerseminiprog.dao;

import com.yeehom.ecommerseminiprog.pojo.Goods;
import java.util.List;

public interface GoodsMapper {
    int insert(Goods record);

    List<Goods> selectAll();
}