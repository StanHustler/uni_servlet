package c5_session.CakeShop;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;

@WebServlet(name = "ListCakeServlet", value = "/ListCakeServlet")
public class ListCakeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        Collection<Cake> cakes = CakeDB.getAll();
        out.write("<p>本店有:</p>");
        for (Cake cake:cakes){
            String url = "PurchaseServlet?id=" + cake.getId();
            out.write(cake.getName() + "<a href = '" + url + "'>BUY!</a> <br>");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
