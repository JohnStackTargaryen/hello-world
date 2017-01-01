package com.wlxy.service;

import com.wlxy.entity.User;

public interface UserService {
	User query(String userId);
	User load(String userId);
	public void add(User user);
	public void delete(String userid);
}
