package c5_session.Login;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "c5/IndexServlet", value = "/c5/IndexServlet")
public class IndexServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");

        HttpSession session =request.getSession();
        User user = (User) session.getAttribute("user");
        if (user == null){
            response.getWriter().println("PLEASE <a href = '/c5Login.html'> LOGIN! </a>");
        }else {
            response.getWriter().println("HELLO,"+ user.getUsername() + "!");
            response.getWriter().println(" <a href = '/c5/LououtServlet'> logout </a>");

            Cookie cookie = new Cookie("JSESSIONID",session.getId());
            response.addCookie(cookie);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
