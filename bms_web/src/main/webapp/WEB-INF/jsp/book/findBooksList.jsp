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
	<h3>输入图书相关信息进行检索</h3>
	<form action="${pageContext.request.contextPath}/books/findBooksList.action" method="post">
		图书名称：<input type="text" name="book.bookName"><br>
		作       者   ： <input type="text" name="book.author" ><br>
		出版社     ：<input type="text" name="book.publisher" ><br>
		图书类别 ： <input type="checkbox" name="book.bookClass" value="文学艺术">文学艺术
 		<input type="checkbox" name="book.bookClass" value="计算机科学">计算机科学
 		<input type="checkbox" name="book.bookClass" value="人文社科">人文社科
 		<input type="checkbox" name="book.bookClass" value="经济管理">经济管理<br>
 		出版时间<input type="text" name="book.publishDate" >
		<input type="submit" value="查找">
	</form>
	
	
</body>
</html>