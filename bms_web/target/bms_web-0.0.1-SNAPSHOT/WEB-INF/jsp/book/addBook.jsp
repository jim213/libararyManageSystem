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
		图书ISBN号码：<input type="text" name="book.book_ISBN"  ><br>
		图书名称：<input type="text" name="book.book_name"  ><br>
		图书类别 ： <input type="checkbox" name="book.book_class" value="文学艺术">文学艺术
 		<input type="checkbox" name="book.book_class" value="计算机科学">计算机科学
 		<input type="checkbox" name="book.book_class" value="人文社科">人文社科
 		<input type="checkbox" name="book.book_class" value="经济管理">经济管理<br>
		作者：<input type="text" name="book.author" ><br>	
		出版社：<input type="text" name="book.publisher"  ><br>	
		出版日期：<input type="text" name="book.publish_date"  ><br>	
		图书总数目：<input type="text" name="book.book_all_quan"  ><br>	
		可借数目：<input type="text" name="book.book_quan"  ><br>		
		<input type="submit" value="添加">
	</form>
	
	
</body>
</html>