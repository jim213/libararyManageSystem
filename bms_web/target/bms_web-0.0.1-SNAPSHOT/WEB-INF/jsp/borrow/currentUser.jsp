<%@ page  contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
</head>
<body>
<%-- 当前用户：<%=((User)session.getAttribute("user")).getUser_name() %>
<br>
<a href="${pageContext.request.contextPath }/users/exit.action" onclick="return confirm('确定退出系统吗？');" >退出</a>
<br> --%>

当前用户：${user.user_name }，
<c:if test="${user.user_name!=null }">
 <a href="${pageContext.request.contextPath }/users/exit.action">退出</a>
</c:if>
</body>
</html>