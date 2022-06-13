<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<html>
<head>
    <title>Good</title>
</head>
<body >
<form action="/">
    <p><strong><spring:message code="new.user.added"/></strong>
    <p><input type="submit" value="<spring:message code="home.page"/>" name="start"> <a class="dropdown-item" href="?lang=en"><img src="/views/icons/usa.png"></a>
    <a class="dropdown-item" href="?lang=ru"><img src="/views/icons/rus.png"></a></p>
</form>
</body>
</html>
