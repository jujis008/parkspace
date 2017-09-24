package com.parkspace.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.parkspace.db.rmdb.dao.UserDao;
import com.parkspace.db.rmdb.entity.BaseUser;
import com.parkspace.service.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService {

	@Resource
	private UserDao userDao;
	@Override
	public BaseUser getUser(int id) {
		return userDao.getUser(id);
	}

}
