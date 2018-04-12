package com.jim.library.user.web.vo;

import com.jim.library.user.doamin.UserBo;
import com.jim.library.user.entity.User;

public class UserVo {
	
	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	public UserBo build() {
		UserBo bo = new UserBo();
		bo.setUser(user);
		return bo;
	}
	
	
}
