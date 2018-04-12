<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<h3>创建账户并注册</h3><br>
	<h5>已经有账户了？	<a href="${pageContext.request.contextPath }/users/toLogin.action">登陆</a><br></h5>
	<form action="${pageContext.request.contextPath}/users/reg.action" method="post">
		用户名：<input type="text" name="user.user_name"  ><br>
		密码：<input type="text" name="user.user_pwd"  ><br>
		年龄： <input type="text" name="user.user_age"  ><br>
		性别：<input type="text" name="user.user_sex" ><br>
		<input type="submit" value="注册">
	</form>
	
	
</body>
</html>