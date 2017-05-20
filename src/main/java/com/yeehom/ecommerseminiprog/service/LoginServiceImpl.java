package com.yeehom.ecommerseminiprog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yeehom.ecommerseminiprog.dao.IUserMapper;
import com.yeehom.ecommerseminiprog.pojo.UserPojo;

@Service
public class LoginServiceImpl implements ILoginService {

	@Autowired
	IUserMapper userMapper;
	
	@Override
	public UserPojo queryUserByName(String userName) {
		UserPojo usr = userMapper.queryUsrByName("test");
		return usr;
	}

}
