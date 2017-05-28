package com.yeehom.ecommerseminiprog.dao;

import com.yeehom.ecommerseminiprog.pojo.Favorites;
import java.util.List;

public interface FavoritesMapper {
    int insert(Favorites record);

    List<Favorites> selectAll();
}