package com.contrl;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class HomePageServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // You can perform any backend operations here if needed

        // Forward to home page (index.jsp or index.html)
        RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp"); // Example: index.jsp as your homepage
        dispatcher.forward(request, response);
    }
}
