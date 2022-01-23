/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestioneleves;

import java.util.ArrayList;


public class Eleve {
     private String nom;
    private ArrayList<Integer> listeNotes = new ArrayList<Integer>();
    private double moyenne;
    
    public Eleve(String nom) {
	this.nom = nom;
    }
    
    public double getMoyenne() {
	return moyenne;
    }
    
    public String getNom() {
	return nom;
    }

    public ArrayList<Integer> getListeNotes() {
	return listeNotes;
    }
    

    public void ajouterNote(int note) {
	int Notes = this.listeNotes.size();
	if (note < 0) note = 0;
	else if (note > 20) note = 20;
	this.moyenne = (this.moyenne * Notes + note) / (Notes + 1);
	listeNotes.add(note);
    }
    
    public String toString() {
	return nom + " (" + (int)(100 * moyenne)/100.0 + ")";
    }
}

    

