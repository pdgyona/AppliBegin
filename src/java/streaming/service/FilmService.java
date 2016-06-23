/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import java.util.List;
import streaming.dao.FilmDAO;
import streaming.entity.Film;
import static streaming.entity.Lien_.film;

/**
 *
 * @author admin
 */
public class FilmService {
    public Film rechercherParID(long id){
        FilmDAO dao = new FilmDAO();
        return dao.rechercherParID(id);
        
        
    }
    
    public List<Film> lister(){
        FilmDAO dao = new FilmDAO();
        return dao.listerTous();
    }
    
    public  void ajouter(Film film){
        FilmDAO dao = new FilmDAO();
        dao.ajouter(film);
    }
    
    

    public void supprimer(long filmID) {
        FilmDAO dao = new FilmDAO();
        dao.supprimer(filmID);
        
    }
    
    public  void modifier(Film film){
        FilmDAO dao = new FilmDAO();
        dao.modifier(film);
    }
    
    
}
