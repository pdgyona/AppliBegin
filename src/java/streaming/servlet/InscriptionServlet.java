/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import streaming.entity.Utilisateur;
import streaming.service.UtilisateurService;

/**
 *
 * @author admin
 */
@WebServlet(name = "InscriptionServlet", urlPatterns = {"/inscription"})
public class InscriptionServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       
        try {

        Utilisateur utilisateur= new Utilisateur();
        
        String login =req.getParameter("login");
        String email =req.getParameter("email");
        String pass =req.getParameter("pass");
        
        utilisateur.setLogin(login);
        utilisateur.setEmail(email);
        utilisateur.setPass(pass);
        
        UtilisateurService uservice = new UtilisateurService();
        
        uservice.inscription(utilisateur);
        
        resp.sendRedirect("inscription");
        req.getRequestDispatcher("ajout_film.jsp");
        }catch(Exception e){
            req.getRequestDispatcher("error.jsp").forward(req, resp);
        }
        
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       
        req.getRequestDispatcher("inscription.jsp").forward(req, resp);
    }

    
    

    

}
