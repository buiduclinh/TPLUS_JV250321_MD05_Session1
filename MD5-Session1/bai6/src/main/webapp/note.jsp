<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page session="true" %>
<!DOCTYPE html>
<html>
<head>
    <title>Ghi chú</title>
</head>
<body>
<h2>Thêm Ghi Chú</h2>
<form action="note" method="post">
    <input type="text" name="newNote" required>
    <button type="submit">Note</button>
</form>

<h3>Danh sách ghi chú:</h3>
<ul>
    <%
        List<String> notes = (List<String>) session.getAttribute("notes");
        if (notes != null && !notes.isEmpty()) {
            for (String note : notes) {
    %>
    <li><%= note %></li>
    <%
        }
    } else {
    %>
    <li>Chưa có ghi chú nào.</li>
    <%
        }
    %>
</ul>
</body>
</html>