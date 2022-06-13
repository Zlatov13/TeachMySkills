<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<html>
<head>
    <title>Title</title>
</head>
<body >
<form action="/createUserNext" method="post">
    <p ><strong><spring:message code="enter.new.name"/>  </strong>
        <input maxlength="25" size="40" name="name"> </p>
    <p><input type="submit" value="<spring:message code="apply"/>" name="start"> <a class="dropdown-item" href="?lang=en"><img src="/views/icons/usa.png"></a>
        <a class="dropdown-item" href="?lang=ru"><img src="/views/icons/rus.png"></a></p>
</form>
</body>
</html>
