package com.jim.library.user.service;

import com.jim.library.user.doamin.UserBo;

public interface UserService {
	
	public void addUser(UserBo userBo) throws Exception;
	
	public boolean login(UserBo userBo) throws Exception;
	
	public void  deleteUser(UserBo userBo)throws Exception;
	
	
}
