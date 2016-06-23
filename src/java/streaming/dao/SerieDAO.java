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
import static streaming.entity.Personne_.id;
import streaming.entity.Serie;

/**
 *
 * @author admin
 */
public class SerieDAO {

    public List<Serie> listerTous() {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        return em.createQuery("SELECT s FROM  Serie s").getResultList();
    }

    public Serie rechercherParID(long id) {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        return em.find(Serie.class, id);
    }

    public void ajouter(Serie serie) {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        em.getTransaction().begin();
        em.persist(serie);
        em.getTransaction().commit();

    }

    public void supprimer(Serie serie) {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        em.getTransaction().begin();
        Query query = em.createQuery("DELETE FROM Serie s WHERE s.id=:idSerie");
        query.setParameter("idSerie", id);
        query.executeUpdate();
        em.getTransaction().commit();
    }

    public void modifier(Serie serie) {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();

        em.getTransaction().begin();
        em.merge(serie);
        em.getTransaction();
    }

}
