package com.jim.library.user.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jim.library.user.service.UserService;
import com.jim.library.user.web.vo.UserVo;

@Controller
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping("/reg")
	public String reg(UserVo userVo) throws Exception {
		userService.addUser(userVo.build());
		return "user/login";
	}

	@RequestMapping("/delete")
	public String delete(UserVo userVo) throws Exception {
		System.out.println(userVo.getUser());
		userService.deleteUser(userVo.build());
		return "user/login";
	}

	@RequestMapping("/login")
	public String login(UserVo userVo, HttpSession session, HttpServletRequest request) throws Exception {

		boolean bl = userService.login(userVo.build());
		if (bl) {
			session.setAttribute("user", userVo.getUser());
			return "user/loginSuccess";
		} else {
			request.setAttribute("loginError", "用户名或者密码错误，请重新输入");
			return "user/login";
		}
	}

	@RequestMapping("/exit")
	public String exit(HttpSession session) throws Exception {
		session.invalidate();
		return "user/login";
	}

	// 配置jsp跳转
	@RequestMapping("/toReg")
	public String toReg() {
		return "user/reg";
	}

	@RequestMapping("/toLogin")
	public String toLogin() {
		return "user/login";
	}

	@RequestMapping("/todelete")
	public String todelete() {
		return "user/delete";
	}
}
