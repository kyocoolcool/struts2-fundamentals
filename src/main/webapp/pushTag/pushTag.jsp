<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: chris
  Date: 2018-12-06
  Time: 11:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>使用s:push 來將某值放入ValueStack棧頂的對象</h2>
<s:bean  name="bean.Person" var="p">
<s:param name="name" value="'Chris'"></s:param>
<s:param name="age" value="30"></s:param>
<s:param name="work" value="'BigBoss'"></s:param>
</s:bean>
放入push中<br>
<s:push value="#p">
    <s:property value="name"/>
    <s:property value="age"/>
    <s:property value="work"/>
</s:push>
<hr>
沒放入push<br>
<s:property value="#p.name"/>
<s:property value="#p.age"/>
<s:property value="#p.work"/>
</body>
</html>
