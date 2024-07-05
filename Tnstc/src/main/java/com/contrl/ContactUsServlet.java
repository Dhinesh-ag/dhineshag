package com.contrl;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ContactUsServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Extract parameters from request
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String message = request.getParameter("message");

        // Perform backend operations like sending email or storing message (in a real application)
        // For illustration, let's just set an attribute and forward to a confirmation page
        request.setAttribute("confirmationMessage", "Your message has been sent successfully!");

        // Forward to contact confirmation page (contactConfirmation.jsp)
        RequestDispatcher dispatcher = request.getRequestDispatcher("contactConfirmation.jsp"); // Example: contactConfirmation.jsp as your confirmation page
        dispatcher.forward(request, response);
    }
}
