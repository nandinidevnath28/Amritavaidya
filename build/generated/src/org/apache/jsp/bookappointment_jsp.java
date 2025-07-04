package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class bookappointment_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    // Check if the user is logged in
    String username = (String) session.getAttribute("username");
    if (username == null) {
        // If not logged in, redirect to login page with a message
        response.sendRedirect("login1.jsp?message=Please login to access this feature.");
        return;
    }

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <title>Doctor Listings</title>\n");
      out.write("    <style>\n");
      out.write("        body {\n");
      out.write("            font-family: Arial, sans-serif;\n");
      out.write("            margin: 0;\n");
      out.write("            padding: 0;\n");
      out.write("            background:#white;\n");
      out.write("        }\n");
      out.write("        .header {\n");
      out.write("           \n");
      out.write("             background: linear-gradient(45deg, #b2dfdb, #e1f5fe, #dcedc1);\n");
      out.write("             padding: 15px;\n");
      out.write("             display: flex;\n");
      out.write("             justify-content: space-between;\n");
      out.write("             align-items: center;\n");
      out.write("              border-radius: 15px;\n");
      out.write("             box-shadow: 0px 4px 8px rgba(0, 0, 0, 0.1);\n");
      out.write("             }\n");
      out.write("\n");
      out.write("           \n");
      out.write("        .header img {\n");
      out.write("            height: 100px;\n");
      out.write("            width: 100px;\n");
      out.write("        }\n");
      out.write("        .menu {\n");
      out.write("            display: flex;\n");
      out.write("            gap: 35px;\n");
      out.write("            position: relative;\n");
      out.write("            background-color: white;\n");
      out.write("            padding: 20px 30px;\n");
      out.write("            border-radius: 20px;\n");
      out.write("            box-shadow: 0px 2px 5px rgba(0, 0, 0, 0.1);\n");
      out.write("           \n");
      out.write("            font-weight: bold;\n");
      out.write("        }\n");
      out.write("        .menu a {\n");
      out.write("            text-decoration:none;\n");
      out.write("            color: black;\n");
      out.write("            font-weight: bold;\n");
      out.write("            position: relative;\n");
      out.write("             font-size: 20px;\n");
      out.write("        }\n");
      out.write("        .menu-item {\n");
      out.write("            position: relative;\n");
      out.write("           font-size: 20px;\n");
      out.write("        }\n");
      out.write("        .dropdown {\n");
      out.write("            position: absolute;\n");
      out.write("            top: 100%;\n");
      out.write("            left: 0;\n");
      out.write("            display: none;\n");
      out.write("              background: #4db6ac;\n");
      out.write("            border: 1px solid #ddd;\n");
      out.write("            box-shadow: 0px 8px 16px rgba(0, 0, 0, 0.2);\n");
      out.write("            border-radius: 5px;\n");
      out.write("            z-index: 1000;\n");
      out.write("            min-width: 250px;\n");
      out.write("            overflow: hidden;\n");
      out.write("            transform: translateY(10px);\n");
      out.write("            transition: opacity 0.3s ease, transform 0.3s ease;\n");
      out.write("   \n");
      out.write("   \n");
      out.write("        }\n");
      out.write("        .dropdown a {\n");
      out.write("            display: block;\n");
      out.write("    padding: 12px 20px;\n");
      out.write("    text-decoration: none;\n");
      out.write("    color: #333;\n");
      out.write("    font-weight: bold;\n");
      out.write("    background: white;\n");
      out.write("    border-radius: 8px;\n");
      out.write("    margin: 5px 10px;\n");
      out.write("    transition: background 0.3s ease, transform 0.2s ease;\n");
      out.write("        }\n");
      out.write("       \n");
      out.write("        .dropdown a:hover {\n");
      out.write("            background-color: #b2dfdb;\n");
      out.write("    transform: scale(1.05);\n");
      out.write("        }\n");
      out.write("       \n");
      out.write("        .dropdown.show {\n");
      out.write("          display: block;\n");
      out.write("          opacity: 1;\n");
      out.write("          transform: translateY(0);\n");
      out.write("}\n");
      out.write("        .menu-item:hover .dropdown {\n");
      out.write("            display: block;\n");
      out.write("            opacity: 1;\n");
      out.write("            transform: translateY(0);\n");
      out.write("        }\n");
      out.write("        .menu-item:last-child .dropdown {\n");
      out.write("            left: auto;\n");
      out.write("            right: 0;\n");
      out.write("        }\n");
      out.write("       .doctor-section {\n");
      out.write("    width: 100%;\n");
      out.write("    padding: 20px;\n");
      out.write("    border-radius: 15px;\n");
      out.write("    box-shadow: 0 4px 10px rgba(0, 0, 0, 0.1);\n");
      out.write("    display: flex;\n");
      out.write("    justify-content: center;\n");
      out.write("    align-items: center;\n");
      out.write("    position: relative;\n");
      out.write("    text-align: center;\n");
      out.write("    background: linear-gradient(180deg, #002366 0%, #87CEEB 50%, #FAFAFA 100%);\n");
      out.write("    gap: 20px; /* Space between elements */\n");
      out.write("}\n");
      out.write("\n");
      out.write(".doctor-section h2 {\n");
      out.write("    font-size: 3.5em;\n");
      out.write("    color: black;\n");
      out.write("    margin: 0;\n");
      out.write("    padding: 0 20px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".circle-container {\n");
      out.write("    width: 160px;\n");
      out.write("    height: 160px;\n");
      out.write("    border-radius: 50%;\n");
      out.write("    background-color: white;\n");
      out.write("    display: flex;\n");
      out.write("    justify-content: center;\n");
      out.write("    align-items: center;\n");
      out.write("    overflow: hidden;\n");
      out.write("    box-shadow: 0 4px 8px rgba(0, 0, 0, 0.2);\n");
      out.write("}\n");
      out.write("\n");
      out.write(".circle-container img {\n");
      out.write("    width: 100%;\n");
      out.write("    height: 100%;\n");
      out.write("    object-fit: cover;\n");
      out.write("    border-radius: 50%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("        .search-bar {\n");
      out.write("    display: flex;\n");
      out.write("    justify-content: center;\n");
      out.write("    align-items: center;\n");
      out.write("    margin: 20px;\n");
      out.write("    background: linear-gradient(90deg, #3b9a9c, #a7fff3);\n");
      out.write("    padding: 10px;\n");
      out.write("    border-radius: 10px;\n");
      out.write("    backdrop-filter: blur(8px);\n");
      out.write("    box-shadow: 0 4px 10px rgba(0, 0, 0, 0.1);\n");
      out.write("}\n");
      out.write("\n");
      out.write(".search-bar input[type=\"text\"] {\n");
      out.write("    width: 50%;\n");
      out.write("    padding: 12px;\n");
      out.write("    font-size: 18px;\n");
      out.write("    border: none;\n");
      out.write("    border-radius: 25px;\n");
      out.write("    outline: none;\n");
      out.write("    background: white;\n");
      out.write("    box-shadow: inset 0 2px 5px rgba(0, 0, 0, 0.1);\n");
      out.write("    transition: all 0.3s ease-in-out;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".search-bar input[type=\"text\"]:focus {\n");
      out.write("    background: rgba(255, 255, 255, 0.9);\n");
      out.write("    box-shadow: inset 0 2px 8px rgba(0, 0, 0, 0.2);\n");
      out.write("}\n");
      out.write("\n");
      out.write(".search-bar button {\n");
      out.write("    padding: 12px 25px;\n");
      out.write("    margin-left: 10px;\n");
      out.write("    background:#2c4059;\n");
      out.write("    color: white;\n");
      out.write("    border: none;\n");
      out.write("    border-radius: 25px;\n");
      out.write("    cursor: pointer;\n");
      out.write("    font-size: 18px;\n");
      out.write("    font-weight: bold;\n");
      out.write("    transition: all 0.3s ease-in-out;\n");
      out.write("    box-shadow: 0 4px 8px rgba(0, 0, 0, 0.2);\n");
      out.write("}\n");
      out.write("\n");
      out.write(".search-bar button:hover {\n");
      out.write("    background: linear-gradient(135deg, #357ae8, #1a56d6);\n");
      out.write("    box-shadow: 0 6px 12px rgba(0, 0, 0, 0.3);\n");
      out.write("    transform: scale(1.05);\n");
      out.write("}\n");
      out.write("\n");
      out.write("       \n");
      out.write("       .card-container {\n");
      out.write("    display: flex;\n");
      out.write("    flex-direction: column;\n");
      out.write("    align-items: center;\n");
      out.write("    gap: 20px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".card {\n");
      out.write("    background: white;\n");
      out.write("    margin: 10px auto;\n");
      out.write("    padding: 20px;\n");
      out.write("    border-radius: 12px;\n");
      out.write("    box-shadow: 0 4px 10px rgba(0, 0, 0, 0.15);\n");
      out.write("    width: 60%;\n");
      out.write("    transition: transform 0.3s ease, box-shadow 0.3s ease;\n");
      out.write("    position: relative;\n");
      out.write("    overflow: hidden;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".card:nth-child(even) {\n");
      out.write("    background: linear-gradient(135deg, #a8e6cf, #dcedc1); /* Light Fresh Green Gradient */\n");
      out.write("    color: #2c3e50; /* Dark text for readability */\n");
      out.write("}\n");
      out.write("\n");
      out.write(".card:nth-child(odd) {\n");
      out.write("    background: linear-gradient(135deg, #b2dfdb, #e0f2f1); /* Soft Mint Green Gradient */\n");
      out.write("    color: #2c3e50;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write(".card:hover {\n");
      out.write("    transform: scale(1.03);\n");
      out.write("    box-shadow: 0 6px 15px rgba(0, 0, 0, 0.2);\n");
      out.write("}\n");
      out.write("\n");
      out.write(".card-header {\n");
      out.write("    font-size: 22px;\n");
      out.write("    font-weight: bold;\n");
      out.write("    margin-bottom: 10px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".card-details {\n");
      out.write("    font-size: 16px;\n");
      out.write("    color: inherit; /* Adapt text color based on background */\n");
      out.write("    line-height: 1.6;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".card::before {\n");
      out.write("    content: \"\";\n");
      out.write("    position: absolute;\n");
      out.write("    top: 0;\n");
      out.write("    left: -50%;\n");
      out.write("    width: 200%;\n");
      out.write("    height: 100%;\n");
      out.write("    background: rgba(255, 255, 255, 0.2);\n");
      out.write("    transform: rotate(15deg);\n");
      out.write("    transition: left 0.5s ease-in-out;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".card:hover::before {\n");
      out.write("    left: 100%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("        .book-button {\n");
      out.write("            display: inline-block;\n");
      out.write("            margin-top: 15px;\n");
      out.write("            padding: 10px 20px;\n");
      out.write("            background-color: #a7acec;\n");
      out.write("            color: black;\n");
      out.write("            text-decoration: none;\n");
      out.write("            border-radius: 4px;\n");
      out.write("            cursor: pointer;\n");
      out.write("        }\n");
      out.write("        .book-button:hover {\n");
      out.write("            background-color: #2c8d45;\n");
      out.write("        }/* Container Styling */\n");
      out.write(".card-container {\n");
      out.write("    display: flex;\n");
      out.write("    flex-wrap: wrap;\n");
      out.write("    justify-content: center;\n");
      out.write("    gap: 20px;\n");
      out.write("    padding: 60px; /* Increased Padding for Bigger Size */\n");
      out.write("    max-width: 120%; /* Increased Width */\n");
      out.write("    margin: 0 auto;\n");
      out.write("    background: linear-gradient(135deg, #d4fc79, #96e6a1); /* Bright Fresh Green Gradient */\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Card Styling */\n");
      out.write(".card {\n");
      out.write("    position: relative;\n");
      out.write("    width: 800px;\n");
      out.write("    padding: 20px;\n");
      out.write("    border-radius: 12px;\n");
      out.write("    text-align: center;\n");
      out.write("    overflow: hidden;\n");
      out.write("    transition: transform 0.3s ease, box-shadow 0.3s ease;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".card:nth-child(even) {\n");
      out.write("    background: linear-gradient(135deg, #56ccf2, #2f80ed); /* Bright Blue Gradient */\n");
      out.write("    color: #fff;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".card:nth-child(odd) {\n");
      out.write("    background: linear-gradient(135deg, #43e97b, #38f9d7); /* Bright Green-Blue Gradient */\n");
      out.write("    color: #fff;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".card:hover {\n");
      out.write("    transform: scale(1.05);\n");
      out.write("    box-shadow: 0 8px 20px rgba(0, 0, 0, 0.3);\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Card Header */\n");
      out.write(".card-header {\n");
      out.write("    font-size: 24px;\n");
      out.write("    font-weight: 700;\n");
      out.write("    margin-bottom: 12px;\n");
      out.write("    font-family: 'Poppins', sans-serif;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Card Details */\n");
      out.write(".card-details {\n");
      out.write("    font-size: 18px;\n");
      out.write("    font-family: 'Roboto', sans-serif;\n");
      out.write("    line-height: 1.6;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Shine Effect */\n");
      out.write(".card::before {\n");
      out.write("    content: \"\";\n");
      out.write("    position: absolute;\n");
      out.write("    top: 0;\n");
      out.write("    left: -50%;\n");
      out.write("    width: 200%;\n");
      out.write("    height: 100%;\n");
      out.write("    background: rgba(255, 255, 255, 0.3);\n");
      out.write("    transform: rotate(15deg);\n");
      out.write("    transition: left 0.5s ease-in-out;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".card:hover::before {\n");
      out.write("    left: 100%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write(".book-button {\n");
      out.write("    display: inline-block;\n");
      out.write("    margin-top: 15px;\n");
      out.write("    padding: 12px 24px;\n");
      out.write("    font-size: 18px;\n");
      out.write("    font-weight: bold;\n");
      out.write("    text-transform: uppercase;\n");
      out.write("    background: linear-gradient(135deg, #00c6ff, #0072ff); /* Vibrant Blue Gradient */\n");
      out.write("    color: white;\n");
      out.write("    border-radius: 30px;\n");
      out.write("    text-decoration: none;\n");
      out.write("    transition: all 0.3s ease;\n");
      out.write("    box-shadow: 0px 4px 10px rgba(0, 0, 0, 0.2);\n");
      out.write("    border: none;\n");
      out.write("    cursor: pointer;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".book-button:hover {\n");
      out.write("    background: linear-gradient(135deg, #0f9b0f, #00ff00); /* Green Highlight Effect */\n");
      out.write("    transform: scale(1.1);\n");
      out.write("    box-shadow: 0px 6px 15px rgba(0, 0, 0, 0.3);\n");
      out.write("}\n");
      out.write("\n");
      out.write("        .hidden {\n");
      out.write("            display: none;\n");
      out.write("        }\n");
      out.write("         .footer {\n");
      out.write("    position: fixed;\n");
      out.write("    bottom: 0;\n");
      out.write("    left: 0;\n");
      out.write("    right: 0;\n");
      out.write("    background: linear-gradient(to right, #b2fefa, #0ed2f7);\n");
      out.write("    padding: 20px;\n");
      out.write("    text-align: center;\n");
      out.write("    color: white;\n");
      out.write("    font-size: 15px;\n");
      out.write("    font-weight: bold;\n");
      out.write("    </style>\n");
      out.write("    <script>\n");
      out.write("        function searchDoctors() {\n");
      out.write("            const query = document.getElementById('search-input').value.toLowerCase().trim();\n");
      out.write("            const cards = document.getElementsByClassName('card');\n");
      out.write("\n");
      out.write("            for (let i = 0; i < cards.length; i++) {\n");
      out.write("                const card = cards[i];\n");
      out.write("                const name = card.querySelector('.card-header').innerText.toLowerCase();\n");
      out.write("                const details = card.querySelector('.card-details').innerText.toLowerCase();\n");
      out.write("\n");
      out.write("                if (name.includes(query) || details.includes(query)) {\n");
      out.write("                    card.classList.remove('hidden');\n");
      out.write("                } else {\n");
      out.write("                    card.classList.add('hidden');\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("    </script>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <div class=\"header\">\n");
      out.write("        <img src=\"images/LOGO.png\" alt=\"AmritaVaidya Logo\">\n");
      out.write("        <div class=\"menu\">\n");
      out.write("            <a href=\"started.jsp\">Home</a>\n");
      out.write("            <a href=\"#about\">About Us</a>\n");
      out.write("            <a href=\"faq.jsp\">FAQs</a>\n");
      out.write("           \n");
      out.write("            <a href=\"contact.html\">Contact Us</a>\n");
      out.write("           \n");
      out.write("            <div class=\"menu-item\">\n");
      out.write("                <a href=\"#\">Profile</a>\n");
      out.write("                <div class=\"dropdown\">\n");
      out.write("                    <a href=\"profile.jsp\">My Profile</a>\n");
      out.write("                   \n");
      out.write("                    <a href=\"logout.jsp\">Sign Out</a>\n");
      out.write("                   \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            </div>\n");
      out.write("       \n");
      out.write("    </div>\n");
      out.write("    <div class=\"doctor-section\">\n");
      out.write("    <div class=\"circle-container\">\n");
      out.write("        <img src=\"images/M1.jpg\" alt=\"Doctor Image Left\">\n");
      out.write("    </div>\n");
      out.write("    <h2>Doctor Listing</h2>\n");
      out.write("    <div class=\"circle-container\">\n");
      out.write("        <img src=\"images/M2.jpg\" alt=\"Doctor Image Right\">\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("    <div class=\"search-bar\">\n");
      out.write("        <input type=\"text\" id=\"search-input\" placeholder=\"Search by Name, Qualification, or Specialty\">\n");
      out.write("        <button onclick=\"searchDoctors()\">Search</button>\n");
      out.write("    </div>\n");
      out.write("   \n");
      out.write("   \n");
      out.write("\n");
      out.write("    ");

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            connection = DriverManager.getConnection("jdbc:derby://localhost:1527/Amritavaidya","av","av");
            statement = connection.createStatement();

            String sql = "SELECT * FROM AV.doctor";
            resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                String name = resultSet.getString("name");
                String gender = resultSet.getString("gender");
                String email = resultSet.getString("email");
                String qualification = resultSet.getString("qualification");
                Date dob = resultSet.getDate("dob");
                String speciality = resultSet.getString("specialty");
                String bloodgroup = resultSet.getString("bloodgroup");
                String contact = resultSet.getString("contact");
    
      out.write("\n");
      out.write("   \n");
      out.write("    <div class=\"card\">\n");
      out.write("        <div class=\"card-header\"><strong>Name:</strong> ");
      out.print( name );
      out.write("</div>\n");
      out.write("        <div class=\"card-details\">\n");
      out.write("            <p><strong>Gender:</strong> ");
      out.print( gender );
      out.write("</p>\n");
      out.write("            <p><strong>Email:</strong> ");
      out.print( email );
      out.write("</p>\n");
      out.write("            <p><strong>Qualification:</strong> ");
      out.print( qualification );
      out.write("</p>\n");
      out.write("            <p><strong>Date of Birth:</strong> ");
      out.print( dob );
      out.write("</p>\n");
      out.write("            <p><strong>Specialty:</strong> ");
      out.print( speciality );
      out.write("</p>\n");
      out.write("            <p><strong>Blood Group:</strong> ");
      out.print( bloodgroup );
      out.write("</p>\n");
      out.write("            <p><strong>Contact:</strong> ");
      out.print( contact );
      out.write("</p>\n");
      out.write("         </div>\n");
      out.write("           ");
 if (resultSet.getString("STATUS").equals("DISABLED")) { 
      out.write("\n");
      out.write("           <p style=\"color: red; font-weight: bold;\">Not Available for Now</p>\n");
      out.write("        ");
 } else { 
      out.write("\n");
      out.write("            <a href=\"allotment.jsp?doctor_username=");
      out.print( resultSet.getString("username") );
      out.write("\" class=\"book-button\">Book Consultation</a>\n");
      out.write("        ");
 } 
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("       \n");
      out.write("    ");

            }
        } catch (Exception e) {
            out.println("<p>Error: " + e.getMessage() + "</p>");
        } finally {
            try {
                if (resultSet != null) resultSet.close();
                if (statement != null) statement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                out.println("<p>Error closing resources: " + e.getMessage() + "</p>");
            }
        }
    
      out.write("\n");
      out.write("    <footer class=\"footer\">\n");
      out.write("   \n");
      out.write("    <p>© 2025 Amritavaidya. All Rights Reserved.</p>\n");
      out.write("</footer>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
