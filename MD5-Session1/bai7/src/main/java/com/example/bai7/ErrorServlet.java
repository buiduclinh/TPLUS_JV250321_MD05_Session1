package controller;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;

public class ErrorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            int a = 10;
            int b = 0;
            int result = a / b; // Lỗi chia cho 0
            response.getWriter().println("Kết quả: " + result);
        } catch (Exception e) {
            // Đưa thông tin lỗi vào request và chuyển sang trang error.jsp
            request.setAttribute("errorMessage", e.getMessage());
            request.getRequestDispatcher("/error.jsp").forward(request, response);
        }
    }
}
