/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author admin
 */
@WebServlet(name = "LogoutServlet", urlPatterns = {"/logout"})
public class LogoutServlet extends HttpServlet {
/*
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("logout.jsp").forward(req, resp);
    }
*/
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie c = new Cookie("loggin", null);
        c.setMaxAge(0);
        resp.addCookie(c);
        
        Cookie c1 = new Cookie("pass", null);
        c1.setMaxAge(0);
        resp.addCookie(c1);
        
        Cookie c2 = new Cookie("util_type", null);
        c2.setMaxAge(0);
        resp.addCookie(c2);
        
        
        resp.sendRedirect("film_liste");
    }
    
    
    

}
