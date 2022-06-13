<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>

<html>
<head>
    <title></title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
</head>
<body >
<p ><strong> <spring:message code="select.the.desired.action"/>
    <a class="dropdown-item" href="?lang=en"><img src="/views/icons/usa.png"></a>
    <a class="dropdown-item" href="?lang=ru"><img src="/views/icons/rus.png"></a>
 </strong>
<form action="/search">
    <p><input type="submit" value="<spring:message code = "search.user.by.id"/>" name=Search></p>
</form>
<form action="/delete">
    <p><input type="submit" value="<spring:message code = "delete.user.by.id"/>" name=Delete></p>
</form>
<form action="/create">
    <p><input type="submit" value="<spring:message code = "create.user"/>" name=create></p>
</form>
<form action="/edit">
    <p><input type="submit" value="<spring:message code="edit.user.by.id"/>" name=Edit></p>
</form>
</body>
</html>