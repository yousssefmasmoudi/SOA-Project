
package tn.iit.examds;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ahmed
 */
    public class ListEtudiantBD { 
        private static List<Etudiant> Etudiants = new ArrayList<Etudiant>();  
        static { 

            Etudiants.add(new Etudiant("PAT1111", "Youssef", "Masmoudi", 1330)); 
            Etudiants.add(new Etudiant("PAT2222", "Masmoudi", "Youssef", 1430)); 



        } 
        public static List<Etudiant> getEtudiants() { 
            return Etudiants; 
        } 

    } 
