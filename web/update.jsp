<%--
  Created by IntelliJ IDEA.
  User: acfun
  Date: 2021/1/29
  Time: 8:06 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
pageContext.setAttribute("cc",request.getContextPath());
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${cc}/update" method="post">
<input type="hidden" value="1" name="id">
姓名：张三<br>
密码:<input type="password" value="" name="password"><br>
年龄：<input type="text" value="" name="age"><br>
<input type="submit" value="commit">
</form>
</body>
</html>
