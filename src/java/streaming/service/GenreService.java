/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import java.util.List;
import streaming.dao.GenreDAO;
import streaming.entity.Genre;

/**
 *
 * @author admin
 */
public class GenreService {

    public List<Genre> lister() {
        return new GenreDAO().lister();

    }

    public Genre rechercherParID(long genreID) {
        return new GenreDAO().rechercherParID(genreID);
    }
    
    public void ajouter(Genre genre){
        GenreDAO dao = new GenreDAO();
        dao.ajouter(genre);
      
    }
    public void supprimer(long genreID) {
         GenreDAO dao = new GenreDAO();
         dao.supprimer(genreID);
    }
    
     public void modifier(Genre genre) {
         GenreDAO dao = new GenreDAO();
     }
    
}
