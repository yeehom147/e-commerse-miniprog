/**
 * 
 */
package com.yeehom.ecommerseminiprog.service;

import com.yeehom.ecommerseminiprog.dao.UserMapper;
import com.yeehom.ecommerseminiprog.entity.RegularEntity;
import com.yeehom.ecommerseminiprog.entity.Result;
import com.yeehom.ecommerseminiprog.enums.ResultEnum;
import com.yeehom.ecommerseminiprog.pojo.User;
import com.yeehom.ecommerseminiprog.util.Regular;
import com.yeehom.ecommerseminiprog.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Yeehom Foo
 *
 */
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    UserMapper userDao;

	@Override
	public Result<Boolean> Login(User user) {

        //账号解析
        if(user==null)
            return ResultUtil.failure(ResultEnum.INVALID_PARAM);
        RegularEntity entity = Regular.Analyze(user.getUserName());
        if(entity.isMatch())
        {
            switch (entity.getMatchType())
            {
                case PHONE:
                    user.setUserPhone(user.getUserName());
                    break;
                case EMAIL:
                    user.setUserEmail(user.getUserName());
                    break;
                default:
                    break;
            }
            user.setUserPwd(user.getUserPwd());
            return userDao.Login(user)>0? ResultUtil.success(true):ResultUtil.failure(ResultEnum.FAILURE);
        }
        else
        {
           return ResultUtil.failure(ResultEnum.INVALID_PARAM);
        }
	}

}
