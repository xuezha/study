<%--
  Created by IntelliJ IDEA.
  User: yemin
  Date: 2017/7/29
  Time: 11:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="<%=request.getContextPath()%>/add" method="POST" enctype="multipart/form-data">
    userId: <input type="text" name="userId"/><br/>
    nickname: <input type="text" name="nickname"/><br/>
    password: <input type="password" name="password"/><br/>
    yourfile: <input type="file" name="myfiles"/><br/>
    <input type="submit" value="提交"/>
</form>
</body>
</html>
