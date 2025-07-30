package com.example.login;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    private final String USERNAME = "NguyenVanA";
    private final String PASSWORD = "matkhauco8kytu";

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String inputUsername = request.getParameter("username");
        String inputPassword = request.getParameter("password");

        if (USERNAME.equals(inputUsername) && PASSWORD.equals(inputPassword)) {
            request.getRequestDispatcher("home.jsp").forward(request, response);
        } else {
            request.setAttribute("error", "Tên đăng nhập hoặc mật khẩu không đúng!");
            request.getRequestDispatcher("error.jsp").forward(request, response);
        }
    }
}