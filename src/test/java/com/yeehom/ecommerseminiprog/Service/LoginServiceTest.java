/**
 * 
 */
package com.yeehom.ecommerseminiprog.Service;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.yeehom.ecommerseminiprog.pojo.User;
import com.yeehom.ecommerseminiprog.service.IUserService;

/**
 * @author Yeehom Foo
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class LoginServiceTest {

	@Autowired
	private IUserService userService;
	
	@Test
	public void queryUserByNameTest() throws Exception {
		List<User> users = userService.queryUserList();
		Assert.assertEquals(users.size(), 1);
	}
}
