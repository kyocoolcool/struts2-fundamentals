<%--
  Created by IntelliJ IDEA.
  User: chris
  Date: 2018-12-05
  Time: 15:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
執行成功1
0
<s:property value="#author"></s:property>
1
<s:property value="#attr.author"></s:property>
2
${requestScope.author}
3
${applicationScope.author}
4
<s:property value="author"></s:property>
5
${author}
6
<s:property value="age"></s:property>
7
${age}
</body>
</html>
