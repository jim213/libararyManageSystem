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

	<h3>录入图书信息进行添加</h3>
	<form action="${pageContext.request.contextPath}/books/addBook.action" method="post">
		图书ISBN号码：<input type="text" name="book.bookISBN"  ><br>
		图书名称：<input type="text" name="book.bookName"  ><br>
		图书类别 ： <input type="checkbox" name="book.bookClass" value="文学艺术">文学艺术
 		<input type="checkbox" name="book.bookClass" value="计算机科学">计算机科学
 		<input type="checkbox" name="book.bookClass" value="人文社科">人文社科
 		<input type="checkbox" name="book.bookClass" value="经济管理">经济管理<br>
		作者：<input type="text" name="book.author" ><br>	
		出版社：<input type="text" name="book.publisher"  ><br>	
		出版日期：<input type="text" name="book.publishDate"  ><br>	
		图书总数目：<input type="text" name="book.bookAllQuan"  ><br>	
		可借数目：<input type="text" name="book.bookQuan"  ><br>		
		<input type="submit" value="添加">
	</form>
	
	
</body>
</html>