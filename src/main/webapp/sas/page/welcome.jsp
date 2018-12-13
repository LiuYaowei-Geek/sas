<%--
  Created by IntelliJ IDEA.
  User: weishao
  Date: 2018/5/13
  Time: 19:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>sas</title>
</head>
<body>
<center>
<h2>在线答题系统</h2>
<form action="/sas/login" method="post">
    <tr>
        <td><input type="submit" value="登录"/></td>
    </tr>
</form>

<form action="/sas/regist" method="post">
    <tr>
        <td><input type="submit" value="注册"/></td>
    </tr>
</form>
</center>
</body>
</html>
