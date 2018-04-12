package com.jim.library.internal.user.mapper;

import com.jim.library.user.doamin.UserBo;
import com.jim.library.user.entity.User;

public interface UserMapper {
	
	public void addUser(UserBo userBo) throws Exception;

	public User findUserByName(UserBo userBo) throws Exception;
	
	public UserBo findUserByID(UserBo userBo) throws Exception;
	
	public void deleteUser(UserBo userBo) throws Exception;
}
