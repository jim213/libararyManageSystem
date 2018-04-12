<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<h3>确认注销账户</h3><br>
	<form action="${pageContext.request.contextPath}/users/delete.action" method="post">
		用户名：<input type="text" name="user.user_name"  ><br>
		<input type="submit" value="注销">
	</form>
	
	
</body>
</html>