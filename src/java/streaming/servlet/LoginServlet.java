/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import streaming.entity.Utilisateur;
import static streaming.entity.Utilisateur_.login;
import static streaming.entity.Utilisateur_.pass;

/**
 *
 * @author admin
 */
@WebServlet(name = "LoginServlet", urlPatterns = {"/loggin"})
public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException, RuntimeException {

        String login = req.getParameter("login");
            String pass = req.getParameter("pass");
            Utilisateur u = new UserService().connecter();

            resp.addCookie(new Cookie("login", login));
            resp.addCookie(new Cookie("pass", pass));
            /*
         resp.addCookie(new Cookie("util_type",u.getTypeutilisateur().toString() ));
         Utilisateur.Type.valueOf(pass)
         
         u.setLogin(login);
         u.setPass(pass);
             */

            //resp.sendRedirect("loggin");
            req.getRequestDispatcher("film_liste.jsp").forward(req, resp);
        
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.getRequestDispatcher("loggin.jsp").forward(req, resp);
    }

}
