<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<html>
<head>
    <title>Result</title>
</head>
<body >
<form action = "/">
    <p ><strong> <spring:message code = "user.edit.by.id"/></strong>
        id: ${id}
        Name: ${Name}
    <p><input type="submit" value="<spring:message code = "home.page"/>" name="start"></p>
</form>
</body>
</html>
