/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.servlet;

import java.io.IOException;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author admin
 */
@WebServlet(name = "HomepageServlet", urlPatterns = {"/home"})
public class HomepageServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //creer un attribut à envoyer à JSP(HTML)
        req.setAttribute("titre", "Bonjour Oscaro  osé tout le monde");
        req.setAttribute("dateJour", new Date() );
        
        // renvoie à JSP home.jsp
        
        req.getRequestDispatcher("home.jsp").forward(req, resp);
    }
    
        
}
