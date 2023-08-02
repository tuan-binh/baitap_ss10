<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP</title>
<%--    <style type="text/css">--%>
<%--        .login {--%>
<%--            height:230px; width:300px;--%>
<%--            margin:0;--%>
<%--            padding:10px;--%>
<%--            border:1px #CCC solid;--%>
<%--        }--%>
<%--        .login input {--%>
<%--            padding:5px; margin:5px--%>
<%--        }--%>
<%--    </style>--%>
</head>
<body>
<%--<h1><%= "Hello World!" %>--%>
<%--</h1>--%>
<%--<br/>--%>
<%--<a href="time-world">Time World</a>--%>
<%--<form method="post" action="/LoginServlet">--%>
<%--    <div class="login">--%>
<%--        <h2>Login</h2>--%>
<%--        <label>--%>
<%--            <input type="text" name="username" size="30"  placeholder="username" />--%>
<%--        </label>--%>
<%--        <label>--%>
<%--            <input type="password" name="password" size="30" placeholder="password" />--%>
<%--        </label>--%>
<%--        <input type="submit" value="Sign in"/>--%>
<%--    </div>--%>
<%--</form>--%>
<%--<form method="post" action="/convert">--%>
<%--    <label>Rate: </label><br/>--%>
<%--    <input type="text" name="rate" placeholder="RATE" value="22000"/><br/>--%>
<%--    <label>USD: </label><br/>--%>
<%--    <input type="text" name="usd" placeholder="USD" value="0"/><br/>--%>
<%--    <input type = "submit" id = "submit" value = "Converter"/>--%>
<%--</form>--%>
<form action="/dictionary" method="post">
    <input type="text" name="search" placeholder="search here..." />
    <button>Search</button>
</form>
</body>
</html>