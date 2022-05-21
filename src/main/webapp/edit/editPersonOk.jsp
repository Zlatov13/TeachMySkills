<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>

<html>
<head>
    <title>Title</title>
</head>
<body style="background: url(/images/galaktika.jpg)">
<p style="color:#ffff00"><strong> По данному id найдены данные:</strong>
<form action="/servletEditAnd">
    <p style="color:#ffff00"> id: <input value="${id}" name="id"></p>
    <p style="color:#ffff00"> Name:<input value="${Name}" name="namePerson"></p>
    <p style="color:#ffff00"><strong>введите новое имя</strong>
        <input maxlength="25" size="40" name="name"></p>
    <p><input type="submit" value="подтвердить" name="button"></p>
</form>
</body>
</html>
