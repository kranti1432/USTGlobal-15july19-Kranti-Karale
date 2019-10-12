package com.dev.services;

import com.dev.beans.User;
import com.dev.dao.UserDAO;
import com.dev.dao.UserDAOImpl;

public class UserServicesImpl implements UserServices {
	UserDAO dao = new UserDAOImpl();
	@Override
	public User getInfo(int userid) {
		return dao.getInfo(userid);
	}

}