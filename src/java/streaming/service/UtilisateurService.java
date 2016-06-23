/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import java.util.List;
import streaming.dao.UtilDAO;
import streaming.entity.Utilisateur;

/**
 *
 * @author admin
 */
public class UtilisateurService {
    
    public void inscription(Utilisateur util){
       UtilDAO dao = new UtilDAO();
       List<Utilisateur> listUtil = dao.rechercheParLogin(util.getLogin());
      
       if(listUtil.size()>0){
           throw new RuntimeException("Ce login existe deja");
           
          
       }
       
       List<Utilisateur> listUtilMail = dao.rechercherParMail(util.getEmail());
       if(listUtilMail.size()>0){
           throw  new RuntimeException("Ce mail existe dejà");
       }
       
       util.setEtatutil(Utilisateur.EtatUtil.NON_VALID);
       dao.inscrire(util);
       
       MailService mailservice = new MailService();
       mailservice.envoyerMail(util.getEmail(), "OscarLand", "Welcome to OscarLand the Sun country");
       
        
       
        
    }
    
   /* public Utilisateur rechercherparLoginEtMdp(String login, String mdp){
        
    }
    */
    
}
