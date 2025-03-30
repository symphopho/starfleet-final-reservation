package fr.starfleet.modele.personne;

import java.io.Serializable;

public abstract class Personne implements Serializable {
    private static final long serialVersionUID = 1L; // Identifiant de version pour la sérialisation 

    private String nom;
    private String prenom;
    private String identifiant;

    // Constructeur principal
    public Personne(String nom, String prenom, String identifiant) {
        this.nom = nom;
        this.prenom = prenom;
        this.identifiant = identifiant;
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

    public String getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(String identifiant) {
        this.identifiant = identifiant;
    }

    // Méthode abstraite pour fournir une description de la personne
    public abstract String getDescription();
    
    @Override
    public String toString() {
        return nom + " " + prenom + " (" + identifiant + ")";
    }
}
