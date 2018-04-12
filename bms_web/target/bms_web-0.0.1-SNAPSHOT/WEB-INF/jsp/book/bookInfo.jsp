<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>bookInfo</title>
</head>
<body>
<jsp:include page="currentUser.jsp"></jsp:include>

<form id="bookForm" action="${pageContext.request.contextPath 
	}/books/updateBook.action" method="post" enctype="multipart/form-data" >
	
	<table width="100%" border=1>
		<tr>
			<td>书名</td>
			<td><input type="text" name="book_name" value="${book.book_name }" /></td>
		</tr>
		<tr>
			<td>图书分类</td>
			<td><input type="text" name="book_class" value="${book.book_class }" /></td>
		</tr>
		<tr>
			<td>图书ISBN号码</td>
			<td><input type="text" name="book_ISBN" value="${book.book_ISBN }" /></td>
		</tr>
		<tr>
			<td>作者</td>
			<td><input type="text" name="author" value="${book.author }" /></td>
		</tr>
		<tr>
			<td>出版社</td>
			<td><input type="text" name="publisher" value="${book.publisher }" /></td>
		</tr>
		<tr>
			<td>出版日期</td>
			<td><input type="text" name="publish_date" value="<fmt:formatDate value="${book.publish_date }" pattern="yyyy-MM-dd"/>"/></td>
		</tr>
		<tr>
			<td>馆藏数目</td>
			<td><input type="text" name="book_all_quan" value="${book.book_all_quan }" /></td>
		</tr>
		<tr>
			<td>可借数目</td>
			<td><input type="text" name="book_quan"	value="${book.book_quan }" /></td>
		</tr>
		<tr>
		<td>封面图片</td>
		<td>
			<c:if test="${book.pic !=null}">
				<img src="/pic/${book.pic}" width=100 height=100/>
				<br/>
			</c:if>
			<input type="file"  name="book_pic"/> 
		</td>
		</tr>
		<tr>
			<td colspan="2" align="center"><input type="submit" value="提交"/>
			</td>
		</tr>
		<tr>
		
		</tr>
		
	</table>
	</form>
<a href="${pageContext.request.contextPath }/books/deleteBook.action?book.book_ISBN=${book.book_ISBN}">将本书下架</a>
</body>
</html>