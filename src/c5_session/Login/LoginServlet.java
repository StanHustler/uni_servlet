package c5_session.Login;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "c5/LoginServlet", value = "/c5/LoginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();

        String uname = request.getParameter("username");
        String pword = request.getParameter("password");

        if ("admin".equals(uname) && "123".equals(pword)){
            User user = new User(uname,pword);

            request.getSession().setAttribute("user",user);
            response.sendRedirect("/c5/IndexServlet");
        }else {
            out.write("password or username wrong!");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
