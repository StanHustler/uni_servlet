package c5_session.CakeShop;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "CartServlet", value = "/CartServlet")
public class CartServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();

        List<Cake> cart = null;
        // bought?
        boolean flag = true;

        HttpSession session = request.getSession(false);
        if (session == null){
            flag = false;
        }else {
            cart = (List) session.getAttribute("cart");
            if (cart == null) flag =false;
        }

        // not bought
        if (!flag){
            out.write("not bought");
        }else {
            out.write("<p> you bought: </p>");
            double price = 0;
            for (Cake cake:cart) out.write("<p>" + cake.getName() + "</p>");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
