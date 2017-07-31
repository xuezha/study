<%--
  Created by IntelliJ IDEA.
  User: yemin
  Date: 2017/7/31
  Time: 9:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <script type="text/javascript" src="/js/jquery-1.9.1.min.js"></script>
    <title>图片上传</title>
</head>
<body>
<form id="form1"<%--action="<%=request.getContextPath()%>/photo" --%>method="POST" enctype="multipart/form-data">
    username: <input type="text" name="username"/><br/>
    photo: <input type="file" name="photo"/><br/>
    <input type="button" id="sumitBtn"  value="提交"/>
</form>

<script type="text/javascript" >
    $("#sumitBtn").click(function(){
    jQuery.ajax({
    type:"post",
    url:"photo",
    contentType:"application/json:charset=utf-8",
    data:JSON.stringify($("#form1").serializeArray()),
    dataType:"json",
    success: function(result){
    alter(result.code+"::::"+result.username);
    }
        });
    });
</script>
</body>
</html>
