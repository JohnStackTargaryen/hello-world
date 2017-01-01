package com.wlxy.service;

import com.wlxy.dao.UserDao;
import com.wlxy.entity.User;
import com.wlxy.service.UserService;

public class UserServiceImpl implements UserService {
	UserDao userDao;
	@Override
	public User query(String string) {
		// TODO Auto-generated method stub
		return userDao.getById(string);
	}
	public void setUserDao(UserDao uDao){
		this.userDao=uDao;
	}
	@Override
	public User load(String userId) {
		// TODO Auto-generated method stub
	
		userDao.delete("1001");
		userDao.load("1001");
		userDao.delete("1002");
		return userDao.load(userId);
	}
	@Override
	public void add(User user) {
		// TODO Auto-generated method stub
		userDao.add(user);
	}
	@Override
	public void delete(String userId) {
		// TODO Auto-generated method stub
		userDao.delete(userId);
	}
	
	
}
