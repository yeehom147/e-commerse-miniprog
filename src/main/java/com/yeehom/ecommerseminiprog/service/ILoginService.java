package com.yeehom.ecommerseminiprog.service;

import org.springframework.stereotype.Component;

import com.yeehom.ecommerseminiprog.pojo.UserPojo;


public interface ILoginService {

	public UserPojo queryUserByName(String userName);
}
