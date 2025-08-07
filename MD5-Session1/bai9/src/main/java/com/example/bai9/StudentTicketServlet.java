package com.example.bai9;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import model.Student;

import java.io.IOException;
import java.util.List;

@WebServlet("/students")
public class StudentTicketServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<Student> students = StudentData.getAllStudents();
        request.setAttribute("students", students);
        request.getRequestDispatcher("listStudent.jsp").forward(request, response);
    }
}
