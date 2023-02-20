package tn.iit.examds;

import java.util.ArrayList;
import java.util.List;

import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;



@Path("myresource")
public class MyResource {

    
        
		@GET
		@Produces(MediaType.APPLICATION_JSON)
        public List<Etudiant> getEtudiant() { 

        System.out.println("Retreiving Students..."); 
        
        return ListEtudiantBD.getEtudiants(); 

        } 
        
        
		@GET
		@Path ("search/{num}")
		@Produces(MediaType.APPLICATION_JSON)
        public Etudiant getEtudiants(@PathParam("num") String numEtudiant) { 

            List<Etudiant> Etudiants = ListEtudiantBD.getEtudiants();
            Etudiant aa=null;
            for(int i=0; i<Etudiants.size(); i++)
            if(Etudiants.get(i).getNumEtudiant().equals(numEtudiant))
                aa=Etudiants.get(i);
            return aa; 
        } 
        
        
		@GET
		@Path ("search2")
		@Produces(MediaType.APPLICATION_JSON)
        public List<Etudiant> searchEtudiantByCriteria(@QueryParam ("nom") String nom,@QueryParam ("prenom") String prenom) { 

            List<Etudiant> Etudiants = ListEtudiantBD.getEtudiants();
            List<Etudiant> result=new ArrayList();
            Etudiant aa=null;
            for(int i=0; i<Etudiants.size(); i++)
            if((Etudiants.get(i).getNom().equals(nom)) && (Etudiants.get(i).getPrenom().equals(prenom)))
                result.add(Etudiants.get(i));
            return result;
        }
        

			
		@POST
		@Path("ajout")
		
        public void createEtudiant(@QueryParam ("num") String num,
        		@QueryParam ("nom")String nom,
        		@QueryParam ("prenom")String prenom,
        		@QueryParam ("heure")int heure ) { 
            
            Etudiant aa=new Etudiant(num, nom, prenom, heure);
            ListEtudiantBD.getEtudiants().add(aa);
            
     
        }
		@DELETE
		@Path("suppr")
        public void remove(@QueryParam ("num") String num) 
        { 
            List<Etudiant> Etudiant = ListEtudiantBD.getEtudiants();
            int k=-1;
            for(int i=0; i<Etudiant.size(); i++)
            if(Etudiant.get(i).getNumEtudiant().compareTo(num)==0)
              
                Etudiant.remove(i);
        }
    	
    	
		@PUT
		@Path("modify")
        public void modify(@QueryParam ("num")String num ,@QueryParam("heure") int heure) 
        { 
            List<Etudiant> Etudiant = ListEtudiantBD.getEtudiants();
            int k=-1;
            for(int i=0; i<Etudiant.size(); i++)
            if(Etudiant.get(i).getNumEtudiant().compareTo(num)==0)
              
                Etudiant.get(i).setHeureRendv(heure);;
        }
        
        
    }
