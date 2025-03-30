package fr.starfleet.modele.vaisseau;

import java.util.ArrayList;
import java.util.List;

import fr.starfleet.modele.mission.Mission;

public class Vaisseau {
    private String nom;
    private String immatriculation;
    private int capaciteMaximale;
    private List<Mission> missions; // List of missions assigned to this vessel
    private static List<Vaisseau> vaisseaux = new ArrayList<>(); // Collection of all vessels
    
    // Constructor
    public Vaisseau(String nom, String immatriculation, int capaciteMaximale) {
        this.nom = nom;
        this.immatriculation = immatriculation;
        this.capaciteMaximale = capaciteMaximale;
        this.missions = new ArrayList<>();
    }

    // Getter for missions
    public List<Mission> getMissions() {
        return missions;
    }

    
    // Modifier un vaisseau
    public void modifierVaisseau(Vaisseau vaisseau, String nom, String immatriculation, int capaciteMaximale) {
        vaisseau.setNom(nom);
        vaisseau.setImmatriculation(immatriculation);
        vaisseau.setCapaciteMaximale(capaciteMaximale);
    }

    // supprimer un vaisseau

    public static void supprimerVaisseau(String immatriculation) {
        vaisseaux.removeIf(vaisseau -> vaisseau.getImmatriculation().equals(immatriculation));
    }

    // afficher un vaisseau
    public static void afficherVaisseaux() {
        for (Vaisseau vaisseau : vaisseaux) {
            System.out.println(vaisseau);
        }
    }

    // ajouter une mission 
    public void ajouterMission(Mission mission) {
        missions.add(mission);
    }

    // Getters and setters for vessel properties
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getImmatriculation() {
        return immatriculation;
    }

    public void setImmatriculation(String immatriculation) {
        this.immatriculation = immatriculation;
    }

    public int getCapaciteMaximale() {
        return capaciteMaximale;
    }

    public void setCapaciteMaximale(int capaciteMaximale) {
        this.capaciteMaximale = capaciteMaximale;
    }
}