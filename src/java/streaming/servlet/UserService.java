/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.servlet;

import streaming.dao.UserDAO;
import streaming.entity.Utilisateur;

/**
 *
 * @author admin
 */
class UserService {

    public Utilisateur  connecter() throws RuntimeException{
        return new UserDAO().connecter();
        
    }
    

   
    
}
