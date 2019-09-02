<%--
  Created by IntelliJ IDEA.
  User: chris
  Date: 2019-01-08
  Time: 19:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
chain1
<s:form  action="chainDemo2" namespace="/chainDemo" method="POST">
    <s:textarea name="name"></s:textarea>
    <s:submit value="submit"></s:submit>
</s:form>
</body>
</html>
