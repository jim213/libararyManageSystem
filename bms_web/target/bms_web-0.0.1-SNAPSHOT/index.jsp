<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<h1>图书管理系统</h1>
当前用户：${user.user_name }
<c:if test="${user.user_name!=null }">
 <a href="${pageContext.request.contextPath }/users/exit.action">退出</a>
</c:if><br>

<a href="${pageContext.request.contextPath }/books/toFindBookByISBN.action">根据ISBN号查询</a><br>
<a href="${pageContext.request.contextPath }/books/toFindBooksList.action">高级查询</a><br>
<a href="${pageContext.request.contextPath }/books/toaddBook.action">添加图书</a><br>
<a href="${pageContext.request.contextPath }/users/toLogin.action">登陆</a><br>
<a href="${pageContext.request.contextPath }/users/toReg.action">用户注册</a><br>
<%-- <a href="${pageContext.request.contextPath }index.jsp">返回主页</a><br> --%>


</body>
</html>