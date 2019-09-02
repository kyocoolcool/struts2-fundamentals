<%--
  Created by IntelliJ IDEA.
  User: chris
  Date: 2018-12-06
  Time: 16:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>s:url生成URL地址</h2>
只指定value的形式
<s:url value="Struts2Tag.action"></s:url>
<hr>
指定action，並傳入參數
<s:url action="Struts2Tag">
    <s:param name="author" value="'Chris'"></s:param>
</s:url>
<hr>
不指定action,value,但傳入參數
<s:url includeParams="get">
    <s:param name="id" value="%{'20'}"></s:param>
</s:url>
<hr>
同時指定action,value,並傳入參數
<s:url value="xxxx" action="Struts2Tag.action" >
    <s:param name="author" value="'BigBoss'"></s:param>
</s:url>

<s:select name="aa" label="請選擇圖書" theme="chris" list="{'Java','SQL','Python','javaScript'}"/>

</body>
</html>
