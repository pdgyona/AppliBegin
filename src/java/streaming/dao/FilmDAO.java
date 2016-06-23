/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;
import streaming.entity.Film;
import static streaming.entity.Personne_.id;

/**
 *
 * @author admin
 */
public class FilmDAO {
    public List<Film> listerTous(){
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        return  em.createQuery("SELECT f FROM  Film F").getResultList();
    }
    
    
    public Film rechercherParID(long id){
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        return  em.find(Film.class, id);
    }

    public void  ajouter(Film film) {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
       
        em.getTransaction().begin();
        em.persist(film);
        em.getTransaction().commit();
        
        
    }
    
     public void  supprimer(long filmID) {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
       
        em.getTransaction().begin();
        /*
        Query query = em.createQuery("DELETE FROM Film f WHERE f.id=:idFilm");
        query.setParameter("idFilm", id);
        query.executeUpdate();
        */
        
        
        Film filmsupprimer = new Film();
        filmsupprimer = em.find(Film.class, filmID);
               
        
        em.remove(filmsupprimer);
        
        em.getTransaction().commit();
        
        
        
        
    }
     public  void modifier(Film film){
         EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
         em.getTransaction().begin();
         em.merge(film);
         em.getTransaction().commit();
         
     }

    
    
    
}
