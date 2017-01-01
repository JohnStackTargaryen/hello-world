package com.wlxy.dao;

import com.wlxy.entity.User;

public interface UserDao {
	User getById(String userId);
	User load(String userId);
	public void add(User user);
	public void delete(String userId);
}
