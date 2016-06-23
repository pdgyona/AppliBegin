/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.dao;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import streaming.entity.Utilisateur;

/**
 *
 * @author admin
 */
public class UserDAO {
    public Utilisateur connecter() throws RuntimeException{
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
       
        return  (Utilisateur) em.createQuery("SELECT u FROM  Utilisateur u WHERE u.login ='ADMIN' AND u.pass='ROOT'").getSingleResult();
    }
    
    /*public Utilisateur connecter() throws RuntimeException{
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
       
        Query query = (Utilisateur) em.createQuery("SELECT u FROM  Utilisateur u WHERE u.login ='ADMIN' AND u.pass='ROOT'").getSingleResult();
    }   query.setParameter("monLogin", login);
    query.setParameter("monMdp", mdp);
    return (Utilisateur)query.getSingleResult();
*/
    
    
    
    
    
}
