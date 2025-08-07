<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Danh sách học sinh đăng ký vé xe</title>
</head>
<body>
<h2>Danh sách học sinh đăng ký vé xe</h2>

<table border="1" cellpadding="10" cellspacing="0">
    <thead>
    <tr>
        <th>Họ và tên</th>
        <th>Lớp</th>
        <th>Loại xe</th>
        <th>Biển số xe</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="student" items="${students}">
        <tr>
            <td>${student.fullName}</td>
            <td>${student.className}</td>
            <td>${student.vehicleType}</td>
            <td>${student.licensePlate}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>

</body>
</html>