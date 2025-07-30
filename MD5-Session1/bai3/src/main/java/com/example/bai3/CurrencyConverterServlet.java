package com.example.bai3;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
@WebServlet(urlPatterns = "/convert")
public class CurrencyConverterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        double usd = Double.parseDouble(req.getParameter("usd"));
        double rate = Double.parseDouble(req.getParameter("rate"));

        double vnd = usd * rate;

        req.setAttribute("usd", usd);
        req.setAttribute("rate", rate);
        req.setAttribute("vnd", vnd);

        req.getRequestDispatcher("currencyConverterServlet.jsp").forward(req, resp);
    }
}
