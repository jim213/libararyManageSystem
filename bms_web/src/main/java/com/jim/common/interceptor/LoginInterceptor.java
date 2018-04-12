package com.jim.common.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.jim.library.user.entity.User;


/**
 * 登陆认证的拦截器
 * @author Administrator
 *
 */

public class LoginInterceptor implements HandlerInterceptor {

		
		@Override
		public boolean preHandle(HttpServletRequest request,
				HttpServletResponse response, Object handler) throws Exception {
			
			String url = request.getRequestURI();
			System.out.println(url);
			//判断url是否是公开 地址
			if(url.indexOf("ogin.action")>=0){
				return true;
			}
			if(url.indexOf("toReg.action")>=0){
				return true;
			}
			if(url.indexOf("reg.action")>=0){
				return true;
			}
			
			HttpSession session  = request.getSession();
			User user = (User) session.getAttribute("user");
			
			if(user != null){
				return true;
			}
			
			request.getRequestDispatcher("/WEB-INF/jsp/user/login.jsp").forward(request, response);
			
			return false;
		}

		@Override
		public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
				ModelAndView modelAndView) throws Exception {
			
		}

		@Override
		public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler,
				Exception ex) throws Exception {
			
		}



}
