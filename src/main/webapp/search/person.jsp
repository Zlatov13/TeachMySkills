<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Result</title>
</head>
<body style= "background: url(/images/kosm.jpg)">
<form action = "/index.jsp">
<p style="color:#ffff00"><strong> По данному id найдены данные:</strong>
    id: ${id}
    Name: ${Name}
    <p><input type="submit" value="Вернутся на начальную страницу" name="start"></p>
</form>
</body>
</html>
