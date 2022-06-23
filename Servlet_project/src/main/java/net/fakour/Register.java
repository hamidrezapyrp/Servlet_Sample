package net.fakour;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

@WebServlet("/Register")
public class Register extends HttpServlet {
    public Register(){
        super();
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ArrayList<String> Save = new ArrayList<String>();
        PrintWriter out = resp.getWriter();
        resp.setContentType("text/html");
        String username = req.getParameter("uname");
        String password = req.getParameter("psw");
        String tex1 = req.getParameter("tex1");
        if (username.equalsIgnoreCase("hamid") && password.equalsIgnoreCase("123")){
            Save.add(username);
            Iterator itr=Save.iterator();
            out.println("<!DOCTYPE html>\n" +
                    "<html lang=\"en\">\n" +
                    "<head>\n" +
                    "    <meta charset=\"UTF-8\">\n" +
                    "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n" +
                    "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                    "    <title>Success</title>\n" +
                    "    <style>\n" +
                    "        a{\n" +
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
                    "<body>\n" +
                    "    <script>\n" +
                    "        alert(\"Successful login\")\n" +
                    "        function sub(){\n" +
                    "             return alert(\"Registered information\")\n" +
                    "        }\n" +
                    "    </script>\n" +
                    "    <h1 style=\"padding: 10px;\">Welcome baby</h1>");
            out.println("<h2>" + itr.next() + "</h2>");
            out.println("   <form action=\"/index.html\" method=\"post\">\n" +
                    "        <label for=\"tex1\">Custom text</label>\n" +
                    "        <input type=\"text\" id=\"tex1\" name=\"tex1\">\n" +
                    "      \n" +
                    "        <button type=\"submit\" value=\"submit\" onclick=\"sub()\" style=\"padding: 10px;\">Save</button>\n" +
                    "    </form>\n" +
                    "    <br>\n" +
                    "    <br>\n" +
                    ""
            );
            Save.add(tex1);

            out.println("<a href=\"/index.html\">Home</a>");
            out.println("</body>\n" +
                    "</html>");
        } else if (username.equalsIgnoreCase("admin")&& password.equalsIgnoreCase("admin")){
            Save.add(username);
            Iterator it=Save.iterator();
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
            out.println("<h1 style=\"padding: 10px;\">Welcome "+ it.next() +"</h1>");
            out.println("<h2>" + it.next() + "</h2>");
            out.println("<a href=\"/index.html\">Home</a>");
            out.println("</body>\n" +
                    "</html>");


        }
        else{
            out.println("<h1>Invalid username or password</h1>");
            out.println("<a href=\"/index.html\" width: 100px;\\n\" +\n" +
                    "                 \"            height: 100px;\\n\" +\n" +
                    "                 \"            background-color: rgba(138, 34, 151, 0.808);\\n\" +\n" +
                    "                 \"            color: rgb(194, 218, 210);\\n\" +\n" +
                    "                 \"            text-decoration: none;\\n\" +>Home</a>");
        }

    }
}
