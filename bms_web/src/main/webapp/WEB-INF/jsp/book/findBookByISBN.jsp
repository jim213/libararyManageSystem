<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="currentUser.jsp"></jsp:include>
	<h3>输入图书ISBN号进行检索</h3>
	<form action="${pageContext.request.contextPath}/books/findBookByISBN.action" method="post">
		ISBN号：<input type="text" name="book.bookISBN" >
				<input type="submit" value="查找">
	</form>
	
	<a href="${pageContext.request.contextPath }/books/toFindBooksList.action">高级查询</a><br>
	
	
</body>
</html>