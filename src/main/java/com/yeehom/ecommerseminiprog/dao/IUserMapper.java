/**
 * 
 */
package com.yeehom.ecommerseminiprog.dao;

import java.sql.Date;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

import com.yeehom.ecommerseminiprog.pojo.UserPojo;

/**
 * @author YeeHomFu
 *
 */
@Mapper
public interface IUserMapper {
	
	@Select("select * from user where user_name = \"test\"")
	@Results(value ={
		
			@Result(property="userName",column="user_name",javaType=String.class,jdbcType=JdbcType.VARCHAR),

		
			})
	public UserPojo queryUsrByName(@Param("userName")String userName);

	@Insert("INSERT INTO `user` VALUES ( userPojo.userName, userPojo.userPwd,userPojo.userEmail,"
			+ "userPojo.userPhone,userPojo.regTime,userPojo.userNickName,userPojo.userGender)")
	public int insertUsr(UserPojo userPojo);

	@Update("UPDATE USER SET USER_NAME, USER_PWD,USER_EMAIL,USER_PHONE,REGTIME,USER_NICK_NAME,USER_GENDER,"
			+ " values (userPojo.userName, userPojo.userPwd,userPojo.userEmail,"
			+ "userPojo.userPhone,userPojo.regTime,userPojo.userNickName,userPojo.userGender) "
			+ "where USER_NAME = userPojo.userName")
	public int updateUsr(UserPojo userPojo);
}
