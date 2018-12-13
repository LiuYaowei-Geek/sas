<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
    <title>sas</title>
</head>
<body>
<h2>在线答题系统</h2>
<%--<input type="button" name="login" value="登录" onclick="window.location.href='sas/page/login.jsp'"/>--%>
<%--<input type="button" name="regist" value="注册" onclick="window.location.href='sas/page/regist.jsp'"/>--%>
<form action="/sas/login" method="post">
    <tr>
        <td><input type="submit" value="bb登录"/></td>
    </tr>
</form>

<form action="/sas/regist" method="post">
    <tr>
        <td><input type="submit" value="bb注册"/></td>
    </tr>
</form>
</body>
</html>
