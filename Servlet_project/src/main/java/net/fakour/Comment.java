package net.fakour;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
@WebServlet("/Comment")
public class Comment extends HttpServlet {
    public static String comment;
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
         comment =  req.getParameter("txb");
        if (comment !=null){

            RequestDispatcher rd = req.getRequestDispatcher("index.html");
            rd.forward(req,resp);

        }
    }
    public  Map comment(){
        this.comment = comment;
        Map<String,String> com = new HashMap<>();
        com.put("comment",comment);
        return com;
    }

}
