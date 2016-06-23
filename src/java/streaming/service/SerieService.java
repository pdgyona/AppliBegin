/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import java.util.List;
import streaming.dao.SerieDAO;
import streaming.entity.Serie;

/**
 *
 * @author admin
 */
public class SerieService {
   
    public  Serie rechercherParID(long id){
        SerieDAO dao = new SerieDAO();
        return dao.rechercherParID(id);
    }
    
    public List<Serie> lister(){
        SerieDAO dao = new SerieDAO();
        return dao.listerTous();
    }
    
    
}
