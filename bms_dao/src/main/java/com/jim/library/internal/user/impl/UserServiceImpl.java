package com.jim.library.internal.user.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jim.library.internal.user.mapper.UserMapper;
import com.jim.library.user.doamin.UserBo;
import com.jim.library.user.entity.User;
import com.jim.library.user.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserMapper userMapper;
	
	@Override
	@Transactional
	public void addUser(UserBo userBo) throws Exception {
		userBo.getUser().setRegTime(new Date());
		userMapper.addUser(userBo);
	}

	@Override
	public boolean login(UserBo userBo) throws Exception {	
		//根据输入的Name查找数据库对应的记录
		User userBySelect = userMapper.findUserByName(userBo);
		
		if(userBySelect!=null) {
			//判断输入的密码和数据库查询的密码是否一致
			if (userBySelect.getUserPwd().equals(userBo.getUser().getUserPwd())) {
				return true;
			}
		}
		return false;
	}

	@Override
	public void deleteUser(UserBo userBo) throws Exception {
		userMapper.deleteUser(userBo);
	}
	
	
	

}
