<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 21.04.2022
  Time: 17:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored = "false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/servlet">
    Последовательность чисел Фибоначчи:
    <c:forEach var="number" items="${numberFibonacci}">
      ${number}
    </c:forEach>
</form>
</body>
</html>
