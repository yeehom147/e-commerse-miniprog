package com.yeehom.ecommerseminiprog.controller;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

/**
 * @author Yeehom Foo 登陆控制器单元测试类（示范有例子）
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class LoginControllerTest {

	@Autowired
	private MockMvc mvc;

	@BeforeClass
	public static void beforeClass() {
		System.out.println("class starts");
	}

	@Before
	public void before() {
		System.out.println("function starts");
	}

	@Test(timeout = 10000)
	public void queryUserByName() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/user/test")).andExpect(MockMvcResultMatchers.status().isOk())
				.andExpect(MockMvcResultMatchers.content().string("test"));
	}

	@Ignore("not ready yet")
	@Test(expected = Exception.class)
	public void exceptionTest() throws Throwable {
		throw new Exception();
	}

	@After
	public  void after() {
		System.out.println("function ended");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("class ended");
	}
}
