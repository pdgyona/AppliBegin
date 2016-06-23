/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import java.util.List;
import streaming.dao.FilmDAO;
import streaming.entity.Film;

/**
 *
 * @author admin
 */
public class DetailFilmService {
    
     public List<Film> detailFilm(){
        FilmDAO dao = new FilmDAO();
        return dao.listerTous();
    }

    
    
}
