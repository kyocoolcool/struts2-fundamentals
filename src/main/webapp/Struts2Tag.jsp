<%--
  Created by IntelliJ IDEA.
  User: chris
  Date: 2018/12/3
  Time: 7:41 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" pageEncoding="BIG5"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
<head>
    <title>Demo Struts2 tag</title>
</head>
<body>
<h2><s:property value="message" /></h2>
<div>if elseif else����</div>
<s:set var="age" value="55"/>
<s:if test="#age<15">�p�B��</s:if>
<s:elseif test="#age<30">�C�~</s:elseif>
<s:elseif test="#age>45">���~</s:elseif>
<s:elseif test="#age>65">�Ѧ~</s:elseif>
<s:else>���n��</s:else>
<br>
<div>Iterator���Ҹ�List</div>
<table border="1" width="200">
<s:iterator value="{'���q','�ҥ�','�@�~'}" var="name" status="st">
    <tr>
        <td><s:property value="#st.count"/>
            <s:property value="name"></s:property>
        </td>
    </tr>
</s:iterator>
</table>
<div>Iterator���Ҹ�Map</div>
<table border="1" width="200">
    <tr>
        <th>�ѦW</th>
        <th>�@��</th>
    </tr>

<s:iterator value="#{'��':'Chirs','�n��':'Chris'}" var="score" status="stt">
    <tr <s:if test="#stt.odd"> style="background-color: #bbbbbb"</s:if>>
        <td><s:property value="key"/></td>
        <td><s:property value="value"/></td>
    </tr>
</s:iterator>
</table>
<div>append���Ҹ�List</div>
    <s:append var="newList">
        <s:param value="{'x','y','z'}"/>
        <s:param value="{'a','b','c','d'}"/>
    </s:append>

    <table border="1" width="300">
    <s:iterator value="newList" var="ele" status="hh" >
        <tr>
            <td><s:property value="#hh.count"/></td>
            <td><s:property value="ele"/> </td>
        </tr>

    </s:iterator>
    </table>
<div>append���Ҹ�List&Map</div>
<s:append var="newMap">
    <s:param value="#{'���q','�ҥ�','�@�~'}"/>
    <s:param value="#{'��':'Chirs','�n��':'Chris'}"/>
</s:append>
<s:iterator value="newMap" var="nm" status="sta">
    <table border="1" width="300">
    <tr>
        <td><s:property value="key"/> </td>
        <td><s:property value="value"/> </td>
            <%--<td><s:property value="#sta.count"/> </td>--%>
            <%--<td><s:property value="nm"/> </td>--%>
    </tr>
    </table>
</s:iterator>
<div>generator����</div>
<table border="1" width="300">
<s:generator separator="," val="'�դl,�Ѥl,���l,���l'" count="2" var="persons">
    <s:iterator status="ab">
        <tr>
            <td><s:property value="#ab.count"/> </td>
            <td><s:property/></td>
        </tr>
    </s:iterator>
</s:generator>
</table>
${requestScope.persons}
<br>
<%= request.getAttribute("persons")%>>

<div>merge����(�Pappend�զX���P)</div>
<s:merge var="newList">
    <s:param value="{'x','y','z'}"/>
    <s:param value="{'a','b','c','d'}"/>
</s:merge>

<table border="1" width="300">
    <s:iterator value="newList" var="ele" status="hh" >
        <tr>
            <td><s:property value="#hh.count"/></td>
            <td><s:property value="ele"/> </td>
        </tr>

    </s:iterator>
</table>
<div>subset����</div>
<table border="1" width="300">
<s:subset source="{'����','���','��Z����','�^��','�k��'}" start="1" count="2">
    <s:iterator status="st">
        <tr <s:if test="#st.odd">style="background-color: antiquewhite"</s:if>>
        <td><s:property/></td>
        </tr>
    </s:iterator>
</s:subset>
</table>

<div>decider�ܽd</div>
<s:bean name="util.MyDecider" var="demoDecider"/>
<s:subset source="{'����','���','��Z����','�^��','�k��','����'}" decider="demoDecider" var="newList" />
    <table border="1" width="300">
    <s:iterator value="#attr.newList">
        <tr>
        <td><s:property/></td>
        </tr>
    </s:iterator>
    </table>
<div>sort����</div>
<s:bean var="demoComparator" name="util.MyCompatator"></s:bean>
<s:sort source="{'����L���]�ʤ�','�z���S��','���_�_��','�C����','���y��u��'}" comparator="#demoComparator" var="sortList"/>
${pageScope.sortList}
<table border="1" width="300">
    <s:iterator value="#attr.sortList" status="st">
        <tr <s:if test="#st.odd">style="background-color: aliceblue"</s:if>>
            <td><s:property/></td>
        </tr>
    </s:iterator>
</table>
<s:debug/>
</body>
</html>
