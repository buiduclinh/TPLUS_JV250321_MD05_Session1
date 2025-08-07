package com.example.bai8;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;


@WebServlet("/RegisterTicket")
public class RegisterTicket extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        handleRegister(request, response);
    }

    protected void handleRegister(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Lấy dữ liệu từ form
        String fullname = request.getParameter("fullname");
        String classroom = request.getParameter("classroom");
        String vehicleType = request.getParameter("vehicleType");
        String licensePlate = request.getParameter("licensePlate");

        // Kiểm tra dữ liệu hợp lệ (ví dụ: không để trống)
        boolean isValid = !fullname.isEmpty() && !classroom.isEmpty()
                && !vehicleType.isEmpty() && !licensePlate.isEmpty();

        if (isValid) {
            // Truyền dữ liệu sang trang kết quả
            request.setAttribute("fullname", fullname);
            request.setAttribute("classroom", classroom);
            request.setAttribute("vehicleType", vehicleType);
            request.setAttribute("licensePlate", licensePlate);
            request.setAttribute("success", true);
        } else {
            request.setAttribute("success", false);
        }

        // Chuyển tiếp đến trang kết quả
        request.getRequestDispatcher("resultRegister.jsp").forward(request, response);
    }
}

