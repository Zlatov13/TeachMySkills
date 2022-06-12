<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<html>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/">
    <p ><strong><spring:message code="update.user.complited"/></strong>
    <p><input type="submit" value="<spring:message code="home.page"/>" name="start"></p>
</form>
</body>
</html>
