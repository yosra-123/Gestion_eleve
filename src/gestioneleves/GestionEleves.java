/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestioneleves;


public class GestionEleves {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      	
Eleve eleve = new Eleve("Sophie");
eleve.ajouterNote(-5);
eleve.ajouterNote(20);
System.out.println("Moyenne de " + eleve.getNom() + " : " + eleve.getMoyenne());
 System.out.println(eleve);

              
	}
    }
    

