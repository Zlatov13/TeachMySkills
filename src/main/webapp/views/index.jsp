<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body >
<p ><strong>Выберите действие</strong>
<form action="/search">
    <p><input type="submit" value="поиск записи по id" name=Search></p>
</form>
<form action="/delete">
    <p><input type="submit" value="удаление записи по id" name=Delete></p>
</form>
<form action="/create">
    <p><input type="submit" value="добавить пользователя" name=create></p>
</form>
<form action="/edit">
    <p><input type="submit" value="редактировать данные по id" name=Edit></p>
</form>
</body>
</html>