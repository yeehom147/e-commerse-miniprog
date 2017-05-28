package com.yeehom.ecommerseminiprog.dao;

import com.yeehom.ecommerseminiprog.pojo.UserProfile;
import java.util.List;

public interface UserProfileMapper {
	
    int insert(UserProfile record);

    List<UserProfile> selectAll();
}