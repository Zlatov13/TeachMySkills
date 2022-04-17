<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 16.04.2022
  Time: 15:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored = "false" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<body>
<form action="/Servlett">
    <p><strong>Логин:</strong>
        <input maxlength="25" size="40" name="login"></p>
    <p><strong>Пароль:</strong>
        <input maxlength="25" size="40" name="password"></p>
    <p><input type="submit" value="Войти" name = entrance ></p>
    <p><input type="submit" value="Регистрация" name = registration></p>
</form>
</body>
</body>
</html>
