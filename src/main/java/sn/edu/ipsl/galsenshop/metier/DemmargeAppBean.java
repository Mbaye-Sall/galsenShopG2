/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB31/SingletonEjbClass.java to edit this template
 */
package sn.edu.ipsl.galsenshop.metier;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import sn.edu.ipsl.galsenshop.dao.ClientFacade;
import sn.edu.ipsl.galsenshop.model.Client;

/**
 *
 * @author mjoo
 */
@Singleton
@Startup
public class DemmargeAppBean {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    @EJB
    private ClientFacade cf;
    
    
    public DemmargeAppBean(){
        System.out.println("### initialisation de l'app #### ");
    }

    public ClientFacade getCf() {
        return cf;
    }

    public void setCf(ClientFacade cf) {
        this.cf = cf;
    }
    
    @PostConstruct
    public void init() {
        System.out.println("### test Base Donnée ###");
        
        Client c = new Client();
        c.setNom("sall");
        
        cf.create(c);
        
        System.out.println("etudiant ajoutÃ©");
    }
    
}
