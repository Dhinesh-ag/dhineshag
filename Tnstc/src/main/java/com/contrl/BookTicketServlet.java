package com.contrl;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class BookTicketServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Extract parameters from request
        String username = request.getParameter("username");
        String busNumber = request.getParameter("busNumber");
        String seatNumber = request.getParameter("seatNumber");

        // Perform backend operations like booking ticket (in a real application, this would involve database operations)
        // For illustration, let's just set some attributes and forward to a confirmation page
        request.setAttribute("username", username);
        request.setAttribute("busNumber", busNumber);
        request.setAttribute("seatNumber", seatNumber);

        // Forward to booking confirmation page (bookingConfirmation.jsp)
        RequestDispatcher dispatcher = request.getRequestDispatcher("bookingConfirmation.jsp"); // Example: bookingConfirmation.jsp as your confirmation page
        dispatcher.forward(request, response);
    }
}
