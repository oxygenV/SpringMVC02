<%--
  Created by IntelliJ IDEA.
  User: acfun
  Date: 2021/1/29
  Time: 6:54 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
pageContext.setAttribute("cc",request.getContextPath());
%>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  XXXXXXX<br>
  <form action="${cc}/date" method="post">
    id：<input type="text" name="id"><br>
    name：<input type="text" name="name"><br>
    password：<input type="password" name="password"><br>
    age：<input type="text" name="age"><br>
    生日：<input type="text" name="birth"><br>
    <input type="submit" value="提交">
  </form>
  </body>
</html>
