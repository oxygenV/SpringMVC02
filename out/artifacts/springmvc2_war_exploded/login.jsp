<%--
  Created by IntelliJ IDEA.
  User: acfun
  Date: 2021/1/30
  Time: 9:39 下午
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
<form action="${cc}/validation" method="post">
    编号：<input type="text" name="id"><br>${errors.id}<br>
    姓名：<input type="text" name="name"><br>${errors.name}<br>
    年龄：<input type="text" name="age"><br>${errors.age}<br>
    性别：<input type="text" name="gender"><br>${errors.gender}<br>
    生日：<input type="text" name="birth"><br>${errors.birth}<br>
    邮箱：<input type="text" name="email"><br>${errors.email}<br>
    <input type="submit" name="" value="commit">
</form>
</body>
</html>
