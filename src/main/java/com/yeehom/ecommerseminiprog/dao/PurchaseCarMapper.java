package com.yeehom.ecommerseminiprog.dao;

import com.yeehom.ecommerseminiprog.pojo.PurchaseCar;
import java.util.List;

public interface PurchaseCarMapper {
    int insert(PurchaseCar record);

    List<PurchaseCar> selectAll();
}