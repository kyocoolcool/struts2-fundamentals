<%--
  Created by IntelliJ IDEA.
  User: chris
  Date: 2018-12-06
  Time: 16:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>使用s:set設置一個新變量</h2>
<s:bean name="bean.Person" var="p">
    <s:param name="name" value="'MuMu'"></s:param>
    <s:param name="age" value="17"></s:param>
</s:bean>
將StackContext中的p放入默認範圍Action內。(並放入Stack Context)<br>
<s:set var="xxx" value="#p"></s:set>
StackContext內xxx對象的name屬性:<s:property value="#xxx.name"/><br>
StackContext內xxx對象的age屬性:<s:property value="#xxx.age"/><br>
Request內xxx對象的name屬性:${requestScope.xxx.name}<br>
Request內xxx對象的age屬性:${requestScope.xxx.age}<br>
<hr>
將StackContext中的p放入application內。<br>
<s:set var="yyy" value="#p" scope="application"></s:set>
StackContext內yyy對象的name屬性:<s:property value="#yyy.name"/><br>
StackContext內yyy對象的age屬性:<s:property value="#yyy.age"/><br>
Request內yyy對象的name屬性:${applicationScope.yyy.name}<br>
Request內yyy對象的age屬性:${applicationScope.yyy.age}<br>
<hr>
將StackContext中的p放入application內。<br>
<s:set var="zzz" value="#p" scope="application"></s:set>
StackContext內zzz對象的name屬性:<s:property value="#zzz.name"/><br>
StackContext內zzz對象的age屬性:<s:property value="#zzz.age"/><br>
Request內zzz對象的name屬性:${applicationScope.zzz.name}<br>
Request內zzz對象的age屬性:${applicationScope.zzz.age}<br>
</body>
</html>
