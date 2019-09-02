<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: chris
  Date: 2018-12-05
  Time: 15:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
執行成功2
<s:property value="author"></s:property>
<s:property value="job"></s:property>
${requestScope.author}
${author}
</body>
</html>
