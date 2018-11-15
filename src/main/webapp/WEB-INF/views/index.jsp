
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Курс USD</title>
</head>
<body>
    <h1>Курс USD за произвольную дату</h1>
    <form action="" method="post" onsubmit="return hello()">
        <input type="text" id="date" name="date" placeholder="Введите дату">
        <br>
        <button type="submit">Показать курс</button>

        <br>

        <table border="1">
            <thead>
                <tr>
                    <td>Курс на</td>
                    <td>${date}</td>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>USD RUB</td>
                    <td>${result1}</td>
                </tr>
                <tr>
                     <td>USD EUR</td>
                     <td>${result2}</td>
                </tr>
            </tbody>
        </table>
    </form>
    <script type="text/javascript" src="/resources/js/app.js"></script>
</body>
</html>
