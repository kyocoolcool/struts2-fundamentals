<%--
  Created by IntelliJ IDEA.
  User: chris
  Date: 2018-12-14
  Time: 14:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<jsp:useBean id="db" class="util.MyJNDI" />
<%=
    db.bulidConnection()
%>
<hr>
<jsp:useBean id="hi2" class="util.MyJDBC" />
<%=
    hi2.buildCollection()
%>

