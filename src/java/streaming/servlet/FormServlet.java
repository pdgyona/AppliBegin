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
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author admin
 */
@WebServlet(name = "FormServlet", urlPatterns = {"/form"})
public class FormServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
         //RECCUPERER
         String titre = req.getParameter("titre");
         long anneeProduction = Long.parseLong(req.getParameter("anneeProd"));
         String genre = req.getParameter("genre");
         String pays = req.getParameter("pays");
         System.out.println(" Le Film "+titre+" est produit en "+anneeProduction+" du style "+genre+" en "+pays);
         
    }

   
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        
//renvoyer vers JSP(form.jsp
        req.getRequestDispatcher("form.jsp").forward(req, resp);
        
    }
    

}
