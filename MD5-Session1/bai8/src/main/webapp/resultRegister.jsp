<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Kết quả đăng ký vé xe</title>
</head>
<body>
<h2>Kết quả đăng ký vé xe</h2>
<%
    Boolean success = (Boolean) request.getAttribute("success");
    if (success != null && success) {
%>
<p>Đăng ký thành công!</p>
<ul>
    <li><strong>Họ và tên:</strong> ${fullname}</li>
    <li><strong>Lớp:</strong> ${classroom}</li>
    <li><strong>Loại xe:</strong> ${vehicleType}</li>
    <li><strong>Biển số xe:</strong> ${licensePlate}</li>
</ul>
<% } else { %>
<p style="color:red;">Đăng ký thất bại. Vui lòng kiểm tra lại thông tin.</p>
<% } %>
<br>
<a href="registerForm.jsp">Quay lại form</a>
</body>
</html>