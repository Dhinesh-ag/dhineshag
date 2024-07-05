package com.contrl;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ManageBookingServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // You can perform backend operations here to retrieve booking details for a specific user
        // Example: Fetch booking details from database
        
        // For illustration, let's just set some attributes and forward to manage booking page
        request.setAttribute("bookingId", "12345"); // Example: Retrieve booking ID from database
        request.setAttribute("busNumber", "TNSTC123"); // Example: Retrieve bus number from database
        request.setAttribute("seatNumber", "A12"); // Example: Retrieve seat number from database

        // Forward to manage booking page (manageBooking.jsp)
        RequestDispatcher dispatcher = request.getRequestDispatcher("manageBooking.jsp"); // Example: manageBooking.jsp as your manage booking page
        dispatcher.forward(request, response);
    }
}
