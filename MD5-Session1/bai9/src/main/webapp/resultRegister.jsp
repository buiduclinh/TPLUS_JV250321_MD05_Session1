<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page import="model.Student" %>
<html>
<head>
    <title>Kết quả đăng ký</title>
</head>
<body>
<h2>Đăng ký vé xe thành công!</h2>
<p>Thông tin học sinh:</p>
<ul>
    <li>Họ tên: <%= ((Student) request.getAttribute("student")).getFullName() %></li>
    <li>Lớp: <%= ((Student) request.getAttribute("student")).getClassName() %></li>
    <li>Loại xe: <%= ((Student) request.getAttribute("student")).getVehicleType() %></li>
    <li>Biển số xe: <%= ((Student) request.getAttribute("student")).getLicensePlate() %></li>
</ul>

<a href="formRegister.jsp">Đăng ký mới</a> |
<a href="students">Xem danh sách</a>
</body>
</html>
