<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>

<html>
<head>
    <title></title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
</head>
<body >
<p ><strong> <spring:message code="select.the.desired.action"/> </strong>
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

<div class="dropdown">
    <button class="btn btn-danger dropdown-toggle" type="button" id="dropdownMenuButton"
            data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"><spring:message
            code="app.lang.title"/></button>
    <div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
        <a class="dropdown-item" href="?lang=en"><spring:message code="app.lang.english"/></a>
        <a class="dropdown-item" href="?lang=ru"><spring:message code="app.lang.russian"/></a>
    </div>
</div>
</body>
</html>