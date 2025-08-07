<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
  <title>Đăng ký vé xe</title>
</head>
<body>
<h2>Form đăng ký vé xe</h2>
<form action="register" method="post">
  Họ và tên: <input type="text" name="fullName" required /><br><br>
  Lớp: <input type="text" name="className" required /><br><br>
  Loại xe:
  <select name="vehicleType">
    <option value="Xe đạp">Xe đạp</option>
    <option value="Xe máy">Xe máy</option>
    <option value="Xe buýt">Xe buýt</option>
  </select><br><br>
  Biển số xe: <input type="text" name="licensePlate" /><br><br>
  <button type="submit">Đăng ký</button>
</form>
</body>
</html>
