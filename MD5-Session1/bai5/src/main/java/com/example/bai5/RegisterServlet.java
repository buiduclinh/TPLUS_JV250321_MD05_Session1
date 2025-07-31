package com.example.register;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.util.regex.Pattern;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {

    private boolean isValidEmail(String email) {
        return Pattern.matches("^[\\w.-]+@[\\w.-]+\\.(com|vn|net|org)$", email);
    }

    private boolean isValidPassword(String password) {
        return Pattern.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[!@#$%^&*()_+\\-={}\\[\\]|:;\"'<>,.?/]).{8,}$", password);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String fullname = req.getParameter("fullname");
        String email = req.getParameter("email");
        String password = req.getParameter("password");
        String confirmPassword = req.getParameter("confirmPassword");

        if (fullname == null || email == null || password == null || confirmPassword == null ||
                fullname.isEmpty() || email.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()) {
            req.setAttribute("error", "Vui lòng nhập đầy đủ thông tin.");
            req.getRequestDispatcher("register.jsp").forward(req, resp);
            return;
        }

        if (!isValidEmail(email)) {
            req.setAttribute("error", "Email không hợp lệ. Phải có định dạng đúng và đuôi .com/.vn.");
            req.getRequestDispatcher("register.jsp").forward(req, resp);
            return;
        }

        if (!isValidPassword(password)) {
            req.setAttribute("error", "Mật khẩu phải có ít nhất 8 ký tự, gồm chữ hoa, chữ thường, số và ký tự đặc biệt.");
            req.getRequestDispatcher("register.jsp").forward(req, resp);
            return;
        }

        if (!password.equals(confirmPassword)) {
            req.setAttribute("error", "Xác nhận mật khẩu không trùng khớp.");
            req.getRequestDispatcher("register.jsp").forward(req, resp);
            return;
        }

        // Nếu tất cả đều đúng
        req.setAttribute("fullname", fullname);
        req.setAttribute("email", email);
        req.getRequestDispatcher("success.jsp").forward(req, resp);
    }
}