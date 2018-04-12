<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>登陆</title>
</head>
<body>
	<h1>请登陆</h1>
	
	<h3><%=session.getAttribute("loginError")==null?"":session.getAttribute("loginError") %></h3>
	<form action="${pageContext.request.contextPath}/users/login.action" method="post">
		用户名：<input type="text" name="user.userName"  ><br>
		密码：<input type="text" name="user.userPwd"  ><br>
		<input type="submit" value="登陆">
	</form><br>
	<a href="${pageContext.request.contextPath }/users/toReg.action">注册</a><br>
	
</body>
</html>