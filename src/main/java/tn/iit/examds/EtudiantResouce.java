/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.iit.examds;

import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.POST;
import javax.ws.rs.QueryParam;

/**
 * REST Web Service
 *
 * @author Ahmed
 */
public class EtudiantResouce {

    private UriInfo context;

    /**
     * Creates a new instance of EtudiantResource
     */
    public EtudiantResouce() {
        
    }
    
  

    /**
     * Retrieves representation of an instance of soa.jaxrslabs.bookEtudiant.EtudiantResource
     * @return an instance of java.lang.String
     */
    /*@GET
    @Produces("application/xml")
    public String getXml() {
        //TODO return proper representation object
        throw new UnsupportedOperationException();
    }*/

    /**
     * PUT method for updating or creating an instance of EtudiantResource
     * @param content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
    /*@PUT
    @Consumes("application/xml")
    public void putXml(String content) {
    }*/
    

    public List<Etudiant> getEtudiants() { 

    System.out.println("getEtudiants"); 
    
    return ListEtudiantBD.getEtudiants(); 
    //return "Salut";

    } 
    
    
    // terminer pourque ça soit accessible par le path {id}/

    public Etudiant getEtudiant(String numEtudiant) { 

        List<Etudiant> Etudiants = ListEtudiantBD.getEtudiants();
        Etudiant aa=null;
        for(int i=0; i<Etudiants.size(); i++)
        if(Etudiants.get(i).getNumEtudiant().equals(numEtudiant))
            aa=Etudiants.get(i);
        return aa; 
    } 
    
    
    // terminer pourque ça soit accessible par le path search

    public List<Etudiant> searchEtudiantsByCriteria(String nom, String prenom) { 

        List<Etudiant> Etudiants = ListEtudiantBD.getEtudiants();
        List<Etudiant> result=new ArrayList();
        Etudiant aa=null;
        for(int i=0; i<Etudiants.size(); i++)
        if((Etudiants.get(i).getNom().equals(nom)) && (Etudiants.get(i).getPrenom().equals(prenom)))
            result.add(Etudiants.get(i));
        return result;
    }
    
    // // terminer pourque ça soit accessible par le path create

    public void createEtudiant(String num,
            String nom,
            String prenom,
            int heure ) { 
        
        Etudiant aa=new Etudiant(num, nom, prenom, heure);
        ListEtudiantBD.getEtudiants().add(aa);
        
 
    }
    
    // terminer pourque ça soit accessible par le path {id}/remove
    public void remove(String num) 
    { 
        List<Etudiant> Etudiants = ListEtudiantBD.getEtudiants();
        int k=-1;
        for(int i=0; i<Etudiants.size(); i++)
        if(Etudiants.get(i).getNumEtudiant().compareTo(num)==0)
          
            Etudiants.remove(i);
    }
	
	

    public void modify( String num , int h) 
    { 
        List<Etudiant> Etudiants = ListEtudiantBD.getEtudiants();
        int k=-1;
        for(int i=0; i<Etudiants.size(); i++)
        if(Etudiants.get(i).getNumEtudiant().compareTo(num)==0)
          
            Etudiants.get(i).setHeureRendv(h);;
    }
    
    
}
