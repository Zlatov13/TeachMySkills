<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Result</title>
</head>
<body >
<form action = "/index.jsp">
<p ><strong> По данному id найдены данные:</strong>
    id: ${id}
    Name: ${Name}
    <p><input type="submit" value="Вернутся на начальную страницу" name="start"></p>
</form>
</body>
</html>
