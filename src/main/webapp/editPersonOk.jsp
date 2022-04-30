<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored = "false" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<p><strong> По данному id найдены данные:</strong>

<form action="/servletEditAnd" >
    id:  <input value = "${id}" name = "id">
    Name:<input value = "${Name}" name = "namePerson">
    <p><strong>введите новое имя</strong>
        <input maxlength="25" size="40" name="name"></p>
    <p><input type="submit" value="подтвердить" name = "button" ></p>
</form>

</body>
</html>
