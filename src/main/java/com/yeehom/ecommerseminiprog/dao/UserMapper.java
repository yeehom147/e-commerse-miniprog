package com.yeehom.ecommerseminiprog.dao;

import com.yeehom.ecommerseminiprog.pojo.User;
import java.util.List;

public interface UserMapper {
	
    public int insertOne(User user);
    
    public int insertBatch(List<User> users);
    
    public int updateSelectedByPrimaryKey(User user);
    
    public int updateByPrimaryKey(User user);

    public List<User> queryUserList();

    public List<User> queryUserListByPage();
}