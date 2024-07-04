package com.model;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ComContrrl")
public class ComContrrl extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String message = request.getParameter("message");
        
        // You can perform JDBC operations here to save the message to the database
        
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<meta charset=\"UTF-8\">");
        out.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
        out.println("<title>Contact Us - Amul Ice Cream Parlour</title>");
        out.println("<link rel=\"stylesheet\" href=\"styles.css\">");
        out.println("</head>");
        out.println("<body>");
        out.println("<header>");
        out.println("<div class=\"container\">");
        out.println("<h1>Contact Us</h1>");
        out.println("<nav>");
        out.println("<ul>");
        out.println("<li><a href=\"index.html\">Home</a></li>");
        out.println("<li><a href=\"menu.html\">Menu</a></li>");
        out.println("<li><a href=\"about.html\">About</a></li>");
        out.println("<li><a href=\"contact.html\">Contact</a></li>");
        out.println("</ul>");
        out.println("</nav>");
        out.println("</div>");
        out.println("</header>");
        out.println("<main>");
        out.println("<section id=\"contact\">");
        out.println("<div class=\"container\">");
        out.println("<h2>Get In Touch</h2>");
        out.println("<p>Thank you, " + name + ", for contacting us!</p>");
        out.println("<p>We will respond to your message at " + email + " as soon as possible.</p>");
        out.println("</div>");
        out.println("</section>");
        out.println("</main>");
        out.println("<footer>");
        out.println("<div class=\"container\">");
        out.println("<p>&copy; 2024 Amul Ice Cream Parlour. All rights reserved.</p>");
        out.println("</div>");
        out.println("</footer>");
        out.println("</body>");
        out.println("</html>");
    }
}
