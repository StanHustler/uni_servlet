package c5_session;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.DataInput;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet(name = "LastLogin", value = "/LastLogin")
public class LastLogin extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        Cookie[] cookies = request.getCookies();
        boolean flag = false;

        if (cookies.length >0 && cookies != null){
            for (Cookie cookie:cookies) {
                String name = cookie.getName();
                if ("LastTime".equals(name)){
                    flag = true;
                    String value = cookie.getValue();
                    response.getWriter().write(value+"\n");

                    Date date =new Date();
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                    cookie.setValue(simpleDateFormat.format(date));
                    response.addCookie(cookie);
                }
            }
        }

        if (cookies == null || cookies.length==0 || flag==false){
            Date date =new Date();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Cookie cookie = new Cookie("LastTime",simpleDateFormat.format(date));
            response.addCookie(cookie);
            response.getWriter().write("hello!");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
