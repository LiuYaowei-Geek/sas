<%--
  Created by IntelliJ IDEA.
  User: weishao
  Date: 2018/5/10
  Time: 13:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
</head>
<body>
<center>
<form action="/sas/checkLogin" method="post">
    <table>
        <tr>
            <td>学号：</td>
            <td><input  type="text" id="studentId" name="studentId"/></td>
        </tr>
        <tr>
            <td>密码：</td>
            <td><input type="password" id="studentPassword" name="studentPassword"/></td>
        </tr>
        <tr>
            <td><input type="submit" value="登录"/></td>
        </tr>
    </table>
</form>
</center>
</body>
</html>
