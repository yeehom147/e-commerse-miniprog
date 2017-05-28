/**
 * 
 */
package com.yeehom.ecommerseminiprog.Service;

import com.yeehom.ecommerseminiprog.service.UserServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author Yeehom Foo
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class LoginServiceTest {

//	@Autowired
//	private IUserService userService;
	@Autowired
	private UserServiceImpl userService;

	
//	@Test
//	public void queryUserByNameTest() throws Exception {
//		List<User> users = userService.queryUserList();
//		Assert.assertEquals(users.size(), 1);
//	}

	@Test
	public void reg(){
		//System.out.print(Regular.Analyze("kongxq@qq.com"));
		//System.out.print(Regular.getType("kongxq@qq.com"));
		//userService.Login("11814022319","123");
	}
}
