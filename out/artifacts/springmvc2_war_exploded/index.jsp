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
  <form action="${cc}/converter" method="post">
    按照 id-name-password-age格式提交<br>
    <input type="text" name="user"><br>
    <input type="submit" value="提交">
  </form>
<%--  <img src="${cc}/images/cat.jpg">--%>
  </body>
</html>
