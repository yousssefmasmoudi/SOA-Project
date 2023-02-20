/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.iit.examds;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Ahmed
 */
    @XmlRootElement(name = "Etudiant") 

    public class Etudiant { 

    	

        private String numEtudiant; 

        private String nom; 

        private String prenom; 

        private int heureRendv; // Format : 1230 = 12h30 

     

        public Etudiant() {         

        } 

     

     
        public Etudiant(String numEtudiant, String nom, String prenom, int heureRendv) {
			super();
			this.numEtudiant = numEtudiant;
			this.nom = nom;
			this.prenom = prenom;
			this.heureRendv = heureRendv;
		}




		public String getNumEtudiant() {
			return numEtudiant;
		}




		public void setNumEtudiant(String numEtudiant) {
			this.numEtudiant = numEtudiant;
		}




		public String getNom() {
			return nom;
		}




		public void setNom(String nom) {
			this.nom = nom;
		}




		public String getPrenom() {
			return prenom;
		}




		public void setPrenom(String prenom) {
			this.prenom = prenom;
		}




		public int getHeureRendv() {
			return heureRendv;
		}




		public void setHeureRendv(int heureRendv) {
			this.heureRendv = heureRendv;
		}




		@Override
		public String toString() {
			return "Etudiant [numEtudiant=" + numEtudiant + ", nom=" + nom + ", prenom=" + prenom + ", heureRendv="
					+ heureRendv + "]";
		}
    }



		