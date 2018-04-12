<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>booksList</title>
</head>
<body>
<jsp:include page="currentUser.jsp"></jsp:include>

图书列表：
<table width="100%" border=1>
<tr>
	<td>书名</td>
	<td>图书分类</td>
	<td>作者</td>
	<td>ISBN号码</td>
	<td>出版社</td>
	<td>操作</td>
</tr>
<c:forEach items="${booksList }" var="book">
<tr>
	<td>${book.book_name }</td>
	<td>${book.book_class }</td>
	<td>${book.author }</td>
	<td>${book.book_ISBN }</td>
	<td>${book.publisher }</td>	
	<td><a href="${pageContext.request.contextPath }/books/findBookByISBN.action?book.book_ISBN=${book.book_ISBN}">修改</a></td>

</tr>
</c:forEach>

</table>

</body>
</html>