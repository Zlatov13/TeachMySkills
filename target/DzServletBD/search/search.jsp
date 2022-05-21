<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>

<html>
<head>
    <title>Search</title>
</head>
<body style= "background: url(/images/kosm.jpg)">
<form action="/servletSearch">
    <p style="color:#ffff00"><strong>Введите id</strong>
        <input maxlength="25" size="40" name="id"></p>
    <p><input type="submit" value="Применить" name="start"></p>
</form>
</body>
</html>
