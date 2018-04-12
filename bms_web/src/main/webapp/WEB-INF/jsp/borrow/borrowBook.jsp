<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>borrowBook</title>
</head>
<body>
<jsp:include page="currentUser.jsp"></jsp:include>
	<form action="${pageContext.request.contextPath}/borrow/borrowBook.action" method="post">
		用户ID<input type="text" name="userVo.user.user_id" >
		图书ISBN号码<input type="text" name="bookQueryVo.book.book_ISBN" >
		<input type="submit" value="确认借书">
	</form>


</body>
</html>