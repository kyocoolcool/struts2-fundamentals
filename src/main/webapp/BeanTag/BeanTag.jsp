<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page import="bean.Person"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<body>
<h2>Bean Tag Demo</h2>
<s:bean name="bean.Person" var="p">
    <s:param name="name" value="'chris'"></s:param>
    <s:param name="age" value="30"></s:param>
    <s:param name="work" value="'manager'"></s:param>
    Person實例name為:<s:property value="name"/><br>
    Person實例age為:<s:property value="age"/><br>
    Person實例work為:<s:property value="work"/><br>
</s:bean>
Person實例name為:<s:property value="#p.name"/><br>
Person實例age為:<s:property value="#p.age"/><br>
Person實例work為:<s:property value="#p.work"/><br>
${requestScope.p}<br>
${requestScope.p.name}<br>
${requestScope.p.age}<br>
${requestScope.p.work}<br>
<hr>
利用jsp標準動作useBean<br>
<jsp:useBean id="w" class="bean.Person" scope="request"/>
<jsp:setProperty name="w" property="age" value="18"></jsp:setProperty>
<jsp:setProperty name="w" property="name" value="Riven"></jsp:setProperty>
<jsp:setProperty name="w" property="work" value="Fighter"></jsp:setProperty>
<jsp:getProperty name="w" property="name"/><br>
<jsp:getProperty name="w" property="age"/><br>
<jsp:getProperty name="w" property="work"/><br>
<hr>
<%=w.getName()%><br>
<%=w.getAge()%><br>
<%=w.getWork()%><br>
<hr>
利用jsp指令<br>
<%! Person person=new Person();%>
<% person.setName("MOMO");%>
<%= person.getName()%>
<% request.setAttribute("person",person); %>
${person.name}
<hr>
利用JSTL寫法<br>
${w.name}
${request.w.name}
${w.age}
${request.w.age}
${p.name}
${request.p.name}
${p.age}
${request.p.age}
</body>
</html>
