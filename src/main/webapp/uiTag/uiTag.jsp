<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: chris
  Date: 2018-12-06
  Time: 17:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%--<s:head/>--%>
    <title>Title</title>
</head>
<body>
<h2>UiTag使用</h2>

<s:form>
    <!--使用集合來生成多個複雜複選框-->
    <s:checkboxlist name="a" label="請選擇您喜歡的書籍" labelposition="top" list="{'Java書','SQL書','Python書','JavaScript書'}"/>
    <!--使用map來生成多個複雜複選框-->
    <s:checkboxlist name="b" label="請選擇您想選擇的出版日期" labelposition="top" list="#{'Java書':'2018年11月','SQL書':'2018年10月','Python書':'2018年9月','JavaScript書':'2018年8月'}"
    listKey="key" listValue="value"/>
    <!--使用集合裡放多個bean來生成多個複雜複選框-->
    <s:bean name="services.BookServices" var="bs" ></s:bean>
    <s:checkboxlist name="c" list="#bs.books" listKey="author" listValue="name" labelposition="top" label="請選擇書籍"/>
</s:form>
<s:form>
    <!--使用集合來生成多個單選鈕-->
    <s:radio name="a" label="請選擇您喜歡的書籍" labelposition="top" list="{'Java書','SQL書','Python書','JavaScript書'}"/>
    <!--使用map來生成多個單選鈕-->
    <s:radio name="b" label="請選擇您想選擇的出版日期" labelposition="top" list="#{'Java書':'2018年11月','SQL書':'2018年10月','Python書':'2018年9月','JavaScript書':'2018年8月'}"
             listKey="key" listValue="value"/>
    <!--使用集合裡放多個bean來生成多個單選鈕-->
    <s:bean name="services.BookServices" var="bs" ></s:bean>
    <s:radio name="c" list="#bs.books" listKey="author" listValue="name" labelposition="top" label="請選擇書籍"/>
</s:form>
<s:form>
    <!--使用集合來生成多個下拉選單透過multiple可以多選-->
    <s:select name="a" label="請選擇您喜歡的書籍" labelposition="top" list="{'Java書','SQL書','Python書','JavaScript書'}" multiple="true"/>
    <!--使用map來生成多個下拉選單透過multiple可以多選-->
    <s:select name="b" label="請選擇出版日期" labelposition="top" list="#{'Java書':'2018年11月','SQL書':'2018年10月','Python書':'2018年9月','JavaScript書':'2018年8月'}"
             listKey="key" listValue="value" multiple="true"/>
    <!--使用集合裡放多個bean來生成多個下拉選單透過multiple可以多選-->
    <s:bean name="services.BookServices" var="bs" ></s:bean>
    <s:select name="c" list="#bs.books" listKey="author" listValue="name" labelposition="top" label="請選擇書籍" />
</s:form>
<s:form>
    <!--利用optgroup 使用map來生成多個下拉選單+optgroup-->
    <s:select name="b" label="請選擇您喜歡的書籍" labelposition="top" list="#{'Java書':'Chris','SQL書':'Muse','Python書':'Alo','JavaScript書':'Mary'}"
              listKey="key" listValue="value" multiple="true">
    <s:optgroup label="Jave Aplication" list="#{'javaEE':'Road','javaME':'Wing','javaSE':'Gucci'}" listKey="key" listValue="value"/>
    <s:optgroup label="SQL Aplication" list="#{'MSSQL':'QQ','MySQL':'HiG','Oracle':'Louis'}" listKey="key" listValue="value"/>
    </s:select>
</s:form>
<s:form theme="xhtml" action="jjj">
    <!--使用集合來生成多個下拉選單透過updownselect-->
    <s:updownselect name="hhh" label="請選擇您喜歡的書籍" labelposition="top" list="{'Java書','SQL書','Python書','JavaScript書'}" />
    <!--使用map來生成多個下拉選單透過updownselect-->
    <s:updownselect name="b" label="請選擇出版日期" labelposition="top" list="#{'Java書':'2018年11月','SQL書':'2018年10月','Python書':'2018年9月','JavaScript書':'2018年8月'}" emptyOption="true" moveDownLabel="向下移動"
    listKey="key" listValue="value" />
    <!--使用集合裡放多個bean來生成多個下拉選單透過updownselect-->
    <s:bean name="services.BookServices" var="bs" ></s:bean>
    <s:updownselect name="c" list="#bs.books" listKey="author" listValue="name" labelposition="top" label="請選擇書籍"  selectAllLabel="全部選擇" multiple="true"/>
</s:form>

    <!-- Example 1: simple example -->
<s:form>
    <s:updownselect
            list="#{'england':'England', 'america':'America', 'germany':'Germany'}"
            name="prioritisedFavouriteCountries"
            headerKey="-1"
            headerValue="--- Please Order Them Accordingly ---"
            emptyOption="true" />
</s:form>
    <!-- Example 2: more complex example -->
<s:form>
    <s:updownselect
            list="#bs.books"
            name="prioritisedFavouriteCartoonCharacters"
            headerKey="-1"
            headerValue="--- Please Order ---"
            emptyOption="true"
            allowMoveUp="true"
            allowMoveDown="true"
            allowSelectAll="true"
            moveUpLabel="Move Up"
            moveDownLabel="Move Down"
            selectAllLabel="Select All" />
</s:form>

<s:form action="Menu" name="aaa">
    <!--利用doubleselect-->
    <s:doubleselect name="author" label="請選擇您喜歡的圖書"
                    list="{'Chris','Nick'}"
                    doubleList="top=='Chris'?{'JavaEE','JavaME','JavaSE'}:
                    {'JavaScript'}" doubleName="book"/>
    <s:doubleselect label="Fruits (OGNL) "
                    name="fruit1" list="{'fruit','meat'}"
                    doubleName="fruit2"
                    doubleList="top == 'fruit' ? {'apple', 'orange','banana'} : {'chicken', 'pig'}" />
</s:form>

</body>
</html>
