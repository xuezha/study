<%--
  Created by IntelliJ IDEA.
  User: yemin
  Date: 2017/7/30
  Time: 11:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>List</title>
</head>
<body>
<c:forEach items="${users}" var="user">
    ${user.value.userId}----${user.value.nickname}----${user.value.password}
    <a href="<%=request.getContextPath()%>/${user.value.userId}">查看</a>
    <a href="<%=request.getContextPath()%>/${user.value.userId}/update">编辑</a>
    <a href="<%=request.getContextPath()%>/${user.value.userId}/delete">删除</a>
    <br/>
</c:forEach>
<br/>
<a href="<%=request.getContextPath()%>/add">继续添加用户</a>
</body>
</html>
