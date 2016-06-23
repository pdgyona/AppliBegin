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
import streaming.entity.Lien;
import static streaming.entity.Personne_.id;

/**
 *
 * @author admin
 */
public class LienDAO {

    public List<Lien> lister() {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        return em.createQuery("SELECT l FROM Lien l ORDER BY l.episode").getResultList();

    }

    public Lien rechercherParID(long lienID) {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        return em.find(Lien.class, lienID);
    }

    public void ajouter(Lien lien) {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        em.getTransaction().commit();
        em.persist(lien);
        em.getTransaction().commit();
    }

    public void supprimer(long lienID) {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        em.getTransaction().begin();
        Query query = em.createQuery("DELETE  FROM Lien l WHERE Lien l.id=:idLien");
        query.setParameter("idLien", id);
        em.getTransaction().commit();
    }

    public void modifier(Lien lien) {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        em.getTransaction().begin();
        em.merge(lien);
        em.getTransaction().commit();
    }

}
