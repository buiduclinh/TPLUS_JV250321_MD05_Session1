<!-- index.jsp -->
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Chuyển đổi tiền tệ</title>
</head>
<body>
<h2>Chuyển đổi từ USD sang VND</h2>
<form method="post" action="convert">
    <label>USD:</label>
    <input type="number" step="any" name="usd" required><br><br>
    <label>RATE:</label>
    <input type="number" step="any" name="rate" required><br><br>
    <button type="submit">Convert</button>
</form>
</body>
</html>