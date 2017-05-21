package com.yeehom.ecommerseminiprog.service;

import com.yeehom.ecommerseminiprog.pojo.User;


public interface ILoginService {

	public User queryUserByName(String userName);
}
