<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<html>
<html>
<head>
    <title>Title</title>
</head>
<body >
<form action="/editUserById">
    <p ><strong><spring:message code="update.user"/></strong>
        <input maxlength="25" size="40" name="id"></p>
    <p><input type="submit" value="<spring:message code="apply"/>" name="edit"></p>
</form>
</body>
</html>
