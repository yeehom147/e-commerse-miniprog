/**
 * 
 */
package com.yeehom.ecommerseminiprog.service;

import java.util.List;

import com.yeehom.ecommerseminiprog.pojo.User;

/**
 * @author Yeehom Foo
 *
 */
public interface IUserService {
	
    public int insertOne(User user);
    
    public int insertBatch(List<User> users);
    
    public int updateSelectedByPrimaryKey(User user);
    
    public int updateByPrimaryKey(User user);

    public List<User> queryUserList();

    public List<User> queryUserListByPage();
}
