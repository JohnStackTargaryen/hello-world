package com.wlxy.test;


import static org.junit.Assert.*;

import org.easymock.*;
import org.junit.Before;
import org.junit.Test;

import com.wlxy.dao.UserDao;
import com.wlxy.entity.User;
import com.wlxy.service.UserServiceImpl;

public class UserServiceImplTest {
	User expectUser=null; 
	UserDao dao=null;
	UserServiceImpl service=null;
	
	@Before
	public void setUp(){
	//接口必须一个User类
	expectUser=new User("1001",40,"user_1001");
	//接口必须一个接口UserDao
	dao= EasyMock.createMock(UserDao.class);
	//接口必须一个实现UserDao接口的类
	service = new UserServiceImpl();
	}
	
	@Test
	public void testGetById() {
	EasyMock.expect(dao.getById("1001")).andReturn(expectUser);
	EasyMock.replay(dao);
	service.setUserDao(dao);
	User user = service.query("1001");
	//测试部分
	assertNotNull(user);
	assertEquals("1001",user.getId());
	assertEquals(30, user.getAge());
	assertEquals("user-1001", user.getUsername());
	EasyMock.verify(dao);
	}
	
	@Test
	public void testLoad(){
		EasyMock.expect(dao.load("1001")).andReturn(expectUser).times(2);
		dao.delete("1001");
		EasyMock.expectLastCall();
		dao.delete("1002");
		EasyMock.expectLastCall();
		EasyMock.replay(dao);
		service.setUserDao(dao);
		User user=service.load("1001");
		assertNotNull(user);
	}
	
	@Test
	public void testAdd(){
		User tu=new User("1002",50,"user_1002");
		dao.add(tu);
		EasyMock.expectLastCall();
		EasyMock.replay(dao);
		service.setUserDao(dao);
		User user=service.load("1002");
		assertNotNull(user);
	}
	@Test
	public void testDelete(){
		EasyMock.expect(dao.load("1001")).andReturn(expectUser);
		dao.delete("1001");
		EasyMock.expectLastCall();
		EasyMock.replay(dao);
		service.setUserDao(dao);
		service.delete("1001");
		
	}
}
