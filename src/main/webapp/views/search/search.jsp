<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>

<html>
<head>
  <title>Search</title>
</head>
<body >
<form action="/searchUserById">
  <p ><strong><spring:message code="enter.id"/></strong>
    <input maxlength="25" size="40" name="id"></p>
  <p><input type="submit" value="<spring:message code = "apply"/>" name="start"></p>
</form>
</body>
</html>
