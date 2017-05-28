package com.yeehom.ecommerseminiprog.dao;

import com.yeehom.ecommerseminiprog.pojo.Region;
import java.util.List;

public interface RegionMapper {
    int insert(Region record);

    List<Region> selectAll();
}