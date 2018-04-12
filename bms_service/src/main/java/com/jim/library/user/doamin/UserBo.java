package com.jim.library.user.doamin;

import com.jim.library.user.entity.User;

public class UserBo {

	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "UserBo [User=" + user + "]";
	}
	
	
}
