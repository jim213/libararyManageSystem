<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>成功提示</title>
</head>
<body>
<h1>欢迎登陆</h1>

<a href="${pageContext.request.contextPath }/books/toFindBookByISBN.action">根据ISBN号查询</a><br>
<a href="${pageContext.request.contextPath }/books/toFindBooksList.action">高级查询</a><br>
<a href="${pageContext.request.contextPath }/books/toaddBook.action">添加图书</a><br>
<a href="${pageContext.request.contextPath }/borrow/toBorrowBook.action">借阅图书</a><br>
<a href="${pageContext.request.contextPath }/borrow/toReturnBook.action">归还图书</a><br>

<a href="${pageContext.request.contextPath }/users/exit.action" onclick="return confirm('确定退出系统吗？');" >退出</a>
<a href="${pageContext.request.contextPath }/users/todelete.action?"  >注销</a>

</body>
</html>