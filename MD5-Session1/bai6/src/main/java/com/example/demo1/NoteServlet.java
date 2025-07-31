package com.example.demo1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/note")
public class NoteServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String newNote = req.getParameter("newNote");
        HttpSession session = req.getSession();

        // Lấy danh sách ghi chú hiện có từ session
        List<String> notes = (List<String>) session.getAttribute("notes");
        if (notes == null) {
            notes = new ArrayList<>();
        }

        // Thêm ghi chú mới
        if (newNote != null && !newNote.trim().isEmpty()) {
            notes.add(newNote);
        }

        // Cập nhật danh sách vào session
        session.setAttribute("notes", notes);

        // Trở lại trang JSP để hiển thị
        resp.sendRedirect("note.jsp");
    }
}