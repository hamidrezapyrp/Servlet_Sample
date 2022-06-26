package net.fakour;

import javax.servlet.RequestDispatcher;
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
   public static ArrayList<String> list = new ArrayList<String>();
    public Register() {
        super();

    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

          list.add(0,req.getParameter("uname"));
         list.add(1,req.getParameter("psw"));
        PrintWriter out = resp.getWriter();

        if (list.get(0).equalsIgnoreCase("hamid") && list.get(1).equalsIgnoreCase("123")) {
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
                   "            background-color: rgb(236, 236, 170);\n" +
                   "        }\n" +
                   "    </style>\n" +
                   "</head>\n" +
                   "<body>\n" +
                   "<script>\n" +
                   "    alert(\"Successful login\")\n" +
                   "    function sub(){\n" +
                   "        return alert(\"Registered information\")\n" +
                   "    }\n" +
                   "</script>");
              out.println("<h1>Username:</h1>" + list.get(0));
              out.println("<form action=\"\\Comment\" method=\"Post\">\n" +
                      "    <label for=\"txb\">Custom text</label>\n" +
                      "    <input type=\"text\" id=\"txb\" name=\"txb\">\n" +
                      "\n" +
                      "    <button type=\"submit\" value=\"submit\" onclick=\"sub()\" style=\"padding: 10px;\">Save</button>\n" +
                      "</form>\n" +
                      "<br>\n" +
                      "<br>\n" +
                      "<hr>\n" +
                      "<a href=\"/index.html\">home</a>\n" +
                      "</body>\n" +
                      "</html>");


        }else if (list.get(0).equalsIgnoreCase("admin")&& list.get(1).equalsIgnoreCase("admin")){
              RequestDispatcher rd = req.getRequestDispatcher("Admin");
              rd.forward(req,resp);

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