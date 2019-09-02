<%--
  Created by IntelliJ IDEA.
  User: chris
  Date: 2018-12-06
  Time: 09:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<s:bean name="java.util.Date" var="now"/>
nice=false，指定format="dd/MM/yyyy"<br>
<s:date name="#now" format="dd/MM/yyyy" nice="false"></s:date><hr/>
nice=true，指定format="dd/MM/yyyy"<br>
<s:date name="#now" format="dd/MM/yyyy" nice="true"></s:date><hr/>
nice=true<br>
<s:date name="#now" nice="true"></s:date><hr/>
nice=false，沒有指定format屬性"<br>
<s:date name="#now" nice="false"></s:date><hr/>
nice=false，沒有指定format屬性，指定var屬性"<br>
<s:date name="#now" nice="false" var="abc"></s:date><hr/>
${requestScope.abc}<br>
<s:property value="#abc"/><br>
<hr/>
只有指定var屬性
<s:date name="#now" var="def"></s:date><br>
1
${requestScope.def}<br>
2
<s:property value="#def"/><br>
3
<s:property value="def"/><br>
</body>
</html>
