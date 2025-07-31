<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Đăng ký</title>
</head>
<body>
<h2>Đăng ký tài khoản</h2>

<form action="register" method="post">
    <label>Họ tên:</label><br>
    <input type="text" name="fullname"><br><br>

    <label>Email:</label><br>
    <input type="text" name="email"><br><br>

    <label>Mật khẩu:</label><br>
    <input type="password" name="password"><br><br>

    <label>Xác nhận mật khẩu:</label><br>
    <input type="password" name="confirmPassword"><br><br>

    <input type="submit" value="Đăng ký">
</form>

<p style="color:red">${error}</p>
</body>
</html>