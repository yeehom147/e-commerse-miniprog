/**
 * 
 */
package com.yeehom.ecommerseminiprog.service;

import com.yeehom.ecommerseminiprog.entity.Result;
import com.yeehom.ecommerseminiprog.pojo.User;

/**
 * @author Yeehom Foo
 *
 */
public interface IUserService {
    /**
     * 用戶登陸，
     * 方式：1.手機 2.郵箱
     * @param user
     * @return       成功/失敗
     */
    Result<Boolean> Login(User user);


}
