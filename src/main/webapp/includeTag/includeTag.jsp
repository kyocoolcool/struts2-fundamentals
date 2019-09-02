<%--
  Created by IntelliJ IDEA.
  User: chris
  Date: 2018-12-06
  Time: 10:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>使用s:include來包含目標頁面</h2>
使用include來包含其他頁面<br>
<s:include value="includeFile.jsp"/>
使用include來包含其他頁面，並傳入參數<br>
<s:include value="includeFile.jsp">
    <%--param標籤用來在include和bean 傳值使用--%>
    <%--兩種用法--%>
    <s:param name="author">Chris</s:param>
    <%--<s:param name="author" value="'Chris'"/>--%>
    <%--以上兩種相同--%>
    <%--參數值為代入Chris對象的參數，若Chris對象不存在則author則為null--%>
    <%--<s:param name="author" value="Chris"/>--%>
</s:include>
</body>
</html>
