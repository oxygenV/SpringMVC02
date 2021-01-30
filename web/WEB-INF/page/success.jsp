<%--
  Created by IntelliJ IDEA.
  User: acfun
  Date: 2021/1/29
  Time: 7:08 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
this a page !<br>
msg:${msg}<br>
name:${name}<br>
page:${pageScope.msg}<br>
request:${requestScope.msg}<br>
session:${sessionScope.msg}<br>
application:${applicationScope.msg}<br>
<hr>
page:${pageScope.name}<br>
request:${requestScope.name}<br>
session:${sessionScope.name}<br>
application:${applicationScope.name}<br>
</body>
</html>
