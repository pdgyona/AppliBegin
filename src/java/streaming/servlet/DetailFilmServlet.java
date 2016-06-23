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
import streaming.entity.Film;
import streaming.service.FilmService;

/**
 *
 * @author admin
 */
@WebServlet(name = "DetailFilmServlet", urlPatterns = {"/detail_film"})
public class DetailFilmServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //RECCUPERER
        long idFilm = Long.parseLong(req.getParameter("id"));

        //RQPerer le film apartir de  l'id
        Film filmDetail = new FilmService().rechercherParID(idFilm);

        req.setAttribute("film", filmDetail);
        req.getRequestDispatcher("detailFilm.jsp").forward(req, resp);
    }

}
