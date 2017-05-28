package com.yeehom.ecommerseminiprog.dao;

import com.yeehom.ecommerseminiprog.pojo.PurchaseOrder;
import java.util.List;

public interface PurchaseOrderMapper {
    int insert(PurchaseOrder record);

    List<PurchaseOrder> selectAll();
}