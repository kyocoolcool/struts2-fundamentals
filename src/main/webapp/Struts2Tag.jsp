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
<div>if elseif else標籤</div>
<s:set var="age" value="55"/>
<s:if test="#age<15">小朋友</s:if>
<s:elseif test="#age<30">青年</s:elseif>
<s:elseif test="#age>45">壯年</s:elseif>
<s:elseif test="#age>65">老年</s:elseif>
<s:else>不好說</s:else>
<br>
<div>Iterator標籤裝List</div>
<table border="1" width="200">
<s:iterator value="{'講義','課本','作業'}" var="name" status="st">
    <tr>
        <td><s:property value="#st.count"/>
            <s:property value="name"></s:property>
        </td>
    </tr>
</s:iterator>
</table>
<div>Iterator標籤裝Map</div>
<table border="1" width="200">
    <tr>
        <th>書名</th>
        <th>作者</th>
    </tr>

<s:iterator value="#{'書':'Chirs','好書':'Chris'}" var="score" status="stt">
    <tr <s:if test="#stt.odd"> style="background-color: #bbbbbb"</s:if>>
        <td><s:property value="key"/></td>
        <td><s:property value="value"/></td>
    </tr>
</s:iterator>
</table>
<div>append標籤裝List</div>
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
<div>append標籤裝List&Map</div>
<s:append var="newMap">
    <s:param value="#{'講義','課本','作業'}"/>
    <s:param value="#{'書':'Chirs','好書':'Chris'}"/>
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
<div>generator標籤</div>
<table border="1" width="300">
<s:generator separator="," val="'孔子,老子,墨子,莊子'" count="2" var="persons">
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

<div>merge標籤(與append組合不同)</div>
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
<div>subset標籤</div>
<table border="1" width="300">
<s:subset source="{'中文','日文','西班牙文','英文','法文'}" start="1" count="2">
    <s:iterator status="st">
        <tr <s:if test="#st.odd">style="background-color: antiquewhite"</s:if>>
        <td><s:property/></td>
        </tr>
    </s:iterator>
</s:subset>
</table>

<div>decider示範</div>
<s:bean name="util.MyDecider" var="demoDecider"/>
<s:subset source="{'中文','日文','西班牙文','英文','法文','瑪雅'}" decider="demoDecider" var="newList" />
    <table border="1" width="300">
    <s:iterator value="#attr.newList">
        <tr>
        <td><s:property/></td>
        </tr>
    </s:iterator>
    </table>
<div>sort標籤</div>
<s:bean var="demoComparator" name="util.MyCompatator"></s:bean>
<s:sort source="{'絕對無敵魔動王','爆走兄弟','神奇寶貝','遊戲王','鬥球兒彈平'}" comparator="#demoComparator" var="sortList"/>
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
