<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>

<h1>Discount Price</h1>
<form action="/discount" method="post">
    <p>Đây là mô tả sản phẩm</p>
    <input type="text" placeholder="Giá niêm yết..." name="price"> <br>
    <input type="text" placeholder="chiết khấu" name="discount"> <br>
    <button>Check</button>
</form>
</body>
</html>