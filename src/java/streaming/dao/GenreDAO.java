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
import streaming.entity.Genre;
import static streaming.entity.Personne_.id;

/**
 *
 * @author admin
 */
public class GenreDAO {

    public List<Genre> lister() {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        return em.createQuery("SELECT g FROM Genre g ORDER BY g.nom").getResultList();

    }

    public Genre rechercherParID(long genreID) {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        return em.find(Genre.class, genreID);
    }

    public void ajouter(Genre genre) {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        em.getTransaction().commit();
        em.persist(genre);
        em.getTransaction().commit();
    }

    public void supprimer(long genreID) {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        em.getTransaction().begin();
        Query query = em.createQuery("DELETE  FROM Genre g WHERE Genre g.id=:idGenre");
        query.setParameter("idGenre", id);
        em.getTransaction().commit();
    }

    public void modifier(Genre genre) {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        em.getTransaction().begin();
        em.merge(genre);
        em.getTransaction().commit();
    }

}
