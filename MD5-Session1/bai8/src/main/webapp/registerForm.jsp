<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Đăng ký vé xe</title>
</head>
<body>
<h2>Form đăng ký vé xe cho học sinh</h2>
<form action="RegisterTicket" method="post">
    <label>Họ và tên:</label><br>
    <input type="text" name="fullname" required><br><br>

    <label>Lớp:</label><br>
    <input type="text" name="classroom" required><br><br>

    <label>Loại xe:</label><br>
    <select name="vehicleType" required>
        <option value="Xe đạp">Xe đạp</option>
        <option value="Xe máy">Xe máy</option>
        <option value="Xe buýt">Xe buýt</option>
    </select><br><br>

    <label>Biển số xe:</label><br>
    <input type="text" name="licensePlate" required><br><br>

    <button type="submit">Đăng ký</button>
</form>
</body>
</html>