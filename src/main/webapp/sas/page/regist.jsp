<%--
  Created by IntelliJ IDEA.
  User: weishao
  Date: 2018/5/12
  Time: 13:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>regist</title>
</head>
<body>
<center>
<form action="/sas/checkRegist" method="post">
<table>
    <tr>
        <td>姓名：</td>
        <td><input id="studentName" name="studentName" type="text"/></td>
    </tr>
    <tr>
        <td>学号：</td>
        <td><input id="studentId" name="studentId" type="text"/></td>
    </tr>
    <tr>
        <td>密码：</td>
        <td><input type="password" id="studentPassword" name="studentPassword"/></td>
    </tr>
    <tr>
        <td><input type="submit" value="注册"/></td>
    </tr>
</table>
</form>
</center>
</body>
</html>
