package com.yeehom.ecommerseminiprog.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yeehom.ecommerseminiprog.dao.IUserMapper;
import com.yeehom.ecommerseminiprog.pojo.User;

@Service
public class LoginServiceImpl implements ILoginService {
	
	Logger logger = LoggerFactory.getLogger(LoginServiceImpl.class);
	
	@Autowired
	IUserMapper userMapper;

	@Override
	public User queryUserByName(String userName) {
		User user = userMapper.queryUsrByName(userName);
		logger.info("Query succeeded. user:{}", user.toString());
		return user;
	}

	public String Login(String userName,String pad){
		User user = userMapper.queryUsrByName(userName);
		if(user != null)//用户不存在
		{

			if(user.getUser_pwd().equals(pad))
			{

			}
			else//密码不正确
			{

			}
		}
		return "";
	}

}
