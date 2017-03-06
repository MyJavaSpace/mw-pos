package com.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.dao.TbuserMapper;
import com.pos.entity.Tbuser;
import com.pos.entity.TbuserKey;
import com.pos.service.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService {
	@Resource
	private TbuserMapper userDao;

	@Override
	public Tbuser getUserById() {
		TbuserKey tbuserKey = new TbuserKey();
		tbuserKey.setFsShopGUID("25854");
		tbuserKey.setFsStaffId("25856");
		return userDao.selectByPrimaryKey(tbuserKey);
	}

}
