package com.dev.dao;

import com.dev.beans.User;

public interface UserDAO {
	//public User[] getAllUsers();
	public User getInfo(int userid);
}