package c5_session.CakeShop;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "PurchaseServlet", value = "/PurchaseServlet")
public class PurchaseServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        if (id == null){
            response.sendRedirect("ListCakeServlet");
            return;
        }

        Cake cake = CakeDB.getCake(id);

        // add cake to cart
        HttpSession session = request.getSession();
        List<Cake> cart = (List) session.getAttribute("cart");
        if (cart == null){
            cart = new ArrayList<Cake>();
            session.setAttribute("cart", cart);
        }
        cart.add(cake);

        Cookie cookie = new Cookie("JSESSIONID", session.getId());
        response.addCookie(cookie);

        response.sendRedirect("CartServlet");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
