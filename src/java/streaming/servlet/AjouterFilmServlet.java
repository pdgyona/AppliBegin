/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.servlet;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import streaming.entity.Film;
import streaming.entity.Genre;
import streaming.service.FilmService;
import streaming.service.GenreService;

/**
 *
 * @author admin
 */
@WebServlet(name = "AjouterFilmServlet", urlPatterns = {"/ajouter_film"})
public class AjouterFilmServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      long  genreID = Long.parseLong(req.getParameter("genre_id"));
        
        String titre = req.getParameter("titre");
      String synopsis = req.getParameter("synopsis");
      
      
      
      int anneeprod = Integer.parseInt(req.getParameter("annee"));
      
      
        Film newfilm = new Film();
        newfilm.setTitre(titre);
        newfilm.setSynopsis(synopsis);
        newfilm.setAnnee(anneeprod);
        
        long genreId= Long.parseLong(req.getParameter("genre_id"));
        Genre genre = new GenreService().rechercherParID(genreId);
        
        newfilm.setGenre(genre);
        genre.getFilms().add(newfilm);
        FilmService filmservice = new FilmService();
        filmservice.ajouter(newfilm);
        resp.sendRedirect("ajouter_film");
        
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        
        
        List<Genre> mesGenres =new GenreService().lister();
        
        req.setAttribute("genres", mesGenres);
        
        req.getRequestDispatcher("ajout_film.jsp").forward(req, resp);
        
        
    }

   
    
    
}
