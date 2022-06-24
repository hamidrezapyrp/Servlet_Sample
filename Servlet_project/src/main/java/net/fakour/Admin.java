package net.fakour;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
@WebServlet("/Admin")
public class Admin extends HttpServlet {
    public Admin() {
        super();
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        Register.list.add(2,req.getParameter("txb"));

        out.println("<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n" +
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                "    <title>Admin</title>\n" +
                "    <style>\n" +
                "               a{\n" +
                "            width: 100px;\n" +
                "            height: 100px;\n" +
                "            background-color: rgba(138, 34, 151, 0.808);\n" +
                "            color: rgb(194, 218, 210);\n" +
                "            text-decoration: none;\n" +
                "            padding: 10px;\n" +
                "            margin-top: 30px;\n" +
                "        }\n" +
                "        body{\n" +
                "            background-color: cadetblue;\n" +
                "        }\n" +
                "    </style>\n" +
                "</head>\n" +
                "<body>");
        out.println("<h1>Username:</h1>" + Register.list.get(0));
        out.println("<p style=\"color: rgb(185, 189, 247);\">"+Register.list.get(2)+"<p>");
        out.println("<a href=\"/index.html\">home</a>");
        out.println("</body>\n" +
                "</html>");
    }
}