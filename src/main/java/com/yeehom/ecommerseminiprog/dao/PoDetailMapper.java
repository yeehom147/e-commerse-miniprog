package com.yeehom.ecommerseminiprog.dao;

import com.yeehom.ecommerseminiprog.pojo.PoDetail;
import java.util.List;

public interface PoDetailMapper {
    int insert(PoDetail record);

    List<PoDetail> selectAll();
}