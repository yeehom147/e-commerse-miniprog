/**
 * 
 */
package com.yeehom.ecommerseminiprog.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yeehom.ecommerseminiprog.dao.UserMapper;
import com.yeehom.ecommerseminiprog.entity.Page;
import com.yeehom.ecommerseminiprog.pojo.User;

/**
 * @author Yeehom Foo
 *
 */
@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	private UserMapper userDao;

	@Override
	public int insertOne(User user) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertBatch(List<User> users) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateSelectedByPrimaryKey(User user) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(User user) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<User> queryUserList() {
		return userDao.queryUserList();
	}

	@Override
	public List<User> queryUserListByPage() {
//		User user = new User();
//		Map<String, Object> parameter = new HashMap<String, Object>();
//		parameter.put("User", user);
//		parameter.put("page", Page);
		return null;
	}

}
