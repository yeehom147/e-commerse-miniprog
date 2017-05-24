/**
 * 
 */
package com.yeehom.ecommerseminiprog.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.yeehom.ecommerseminiprog.pojo.User;

/**
 * @author YeeHomFu
 *
 */
@Mapper
public interface IUserMapper {
	
	@Select("select * from user where user_name = #{userName}")
	@Results(value ={
		@Result(property="user_name",column="user_name"),
	})
	public User queryUsrByName(@Param("userName")String userName);

	@Insert("INSERT INTO `user` VALUES ( userPojo.userName, userPojo.userPwd,userPojo.userEmail,"
			+ "userPojo.userPhone,userPojo.regTime,userPojo.userNickName,userPojo.userGender)")
	public int insertUsr(User user);

	@Update("UPDATE USER SET USER_NAME, USER_PWD,USER_EMAIL,USER_PHONE,REGTIME,USER_NICK_NAME,USER_GENDER,"
			+ " values (userPojo.userName, userPojo.userPwd,userPojo.userEmail,"
			+ "userPojo.userPhone,userPojo.regTime,userPojo.userNickName,userPojo.userGender) "
			+ "where USER_NAME = userPojo.userName")
	public int updateUsr(User user);
}
