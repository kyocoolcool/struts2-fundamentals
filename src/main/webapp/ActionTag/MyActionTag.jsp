<%--
  Created by IntelliJ IDEA.
  User: chris
  Date: 2018-12-05
  Time: 15:21
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
調用第一個Action，並將結果包含到本頁面<br>
<s:action name="tag1" executeResult="true"/>
<br>
調用第二個Action，並將結果包含到本頁面<br>
<s:action name="tag2" executeResult="true"/>
<br>
調用第二個Action，並將結果包含到本頁面，不傳參數<br>
<s:action name="tag2" executeResult="true" ignoreContextParams="true"/>
<br>
調用第三個Action，並將結果包含到本頁面，傳參數<br>
<s:action name="tag3" executeResult="true"  ignoreContextParams="false"/>
<br>
調用第二個Action，不將結果傳到本頁面<br>
<s:action name="tag2" executeResult="false"/>
<br>
<s:property value="author"></s:property>
<s:property value="job"></s:property>
${requestScope.author}
${author}
</body>
</html>
