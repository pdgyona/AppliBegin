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
import streaming.entity.Utilisateur;

/**
 *
 * @author admin
 */
public class UtilDAO {
    
    public Utilisateur rechercherParLoginEtMdp(String login, String pass) {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        Query q = em.createQuery("SELECT u FROM Utilisateur u WHERE u.login=:monLogin AND u.pass=:monPass");
        q.setParameter("monLogin", login);
        q.setParameter("monPass", pass);
        return (Utilisateur) q.getSingleResult();

    }

    public List<Utilisateur> rechercheParLogin(String login) {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        return em.createQuery("SELECT u FROM Utilisateur u WHERE u.login=:monLogin").setParameter("monLogin", login).getResultList();

    }

    public List<Utilisateur> rechercherParMail(String email) {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        return em.createQuery("SELECT u FROM Utilisateur u WHERE u.email=:monEmail").setParameter("monEmail", email).getResultList();
    }
    
    public void inscrire(Utilisateur utilisateur){
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        em.getTransaction().begin();
        em.persist(utilisateur);
        em.getTransaction().commit();
        
    }
}
