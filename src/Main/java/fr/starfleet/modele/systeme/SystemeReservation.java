package fr.starfleet.modele.systeme;



import fr.starfleet.modele.vaisseau.Vaisseau;
import fr.starfleet.modele.personne.Civil;
import fr.starfleet.modele.personne.Officier;
import fr.starfleet.modele.personne.Personne;
import fr.starfleet.modele.mission.Mission;
import fr.starfleet.modele.reservation.Reservation; // Ensure this import exists
// Other imports

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class SystemeReservation {
    private List<Vaisseau> vaisseaux;
    private List<Personne> personnes;
    private List<Mission> missions;
    private List<Reservation> reservations;

    public SystemeReservation() {
        vaisseaux = new ArrayList<>();
        personnes = new ArrayList<>();
        missions = new ArrayList<>();
        reservations = new ArrayList<>();
    }

    public void ajouterVaisseau(Vaisseau vaisseau) {
        vaisseaux.add(vaisseau);
    }

    // Création des vaisseaux
    Vaisseau enterprise = new Vaisseau("USS Enterprise", "Classe Constitution", 500); // Ajout de la capacité maximale
    Vaisseau voyager = new Vaisseau("USS Voyager", "Classe Intrepid", 400); // Ajout de la capacité maximale


    public void ajouterPersonne(Personne personne) {
        personnes.add(personne);
    }

    // Création des personnes
    
    Officier picard = new Officier("Picard", "Jean-Luc", "PIC001", "Capitaine", "Commandement");
    Officier riker = new Officier("Riker", "William", "RIK002", "Commander", "Stratégie");

    Civil crusher = new Civil("Crusher", "Beverly", "CRU003", "Terre", "Soins médicaux");
    Civil troy = new Civil("Troy", "Deanna", "TRO004", "Betazed", "Conseil");

    public void creerMission(Mission mission) {
        missions.add(mission);
    }

    // Création des missions
    Mission vulcain = new Mission("VUL001", "Mission vers Vulcain", new Date(0), new Date(0), "Vulcain", 1, 0);
    Mission terre = new Mission("TER001", "Mission vers Terre", new Date(0), new Date(0), "Terre", 1, 0);
    Mission risa = new Mission("RIS001", "Mission vers Risa", new Date(0), new Date(0), "Risa", 1, 0);

    public Reservation effectuerReservation(String idPersonne, String codeMission) {
        Personne personne = findPersonneById(idPersonne);
        Mission mission = findMissionByCode(codeMission);
        if (personne != null && mission != null) {
            Reservation reservation = new Reservation("R" + reservations.size() + 1, personne, mission);
            if (mission.ajouterReservation(reservation)) {
                reservations.add(reservation);
                return reservation;
            }
        }
        return null;
    }

    public void effectuerReservations() {
        SystemeReservation systemeReservation = new SystemeReservation();
    
        // Add vaisseaux
        systemeReservation.ajouterVaisseau(new Vaisseau("USS Enterprise", "Classe Constitution", 500));
        systemeReservation.ajouterVaisseau(new Vaisseau("USS Voyager", "Classe Intrepid", 400));
    
        // Add personnes
        systemeReservation.ajouterPersonne(new Officier("Picard", "Jean-Luc", "PIC001", "Capitaine", "Commandement"));
        systemeReservation.ajouterPersonne(new Officier("Riker", "William", "RIK002", "Commander", "Stratégie"));
        systemeReservation.ajouterPersonne(new Civil("Crusher", "Beverly", "CRU003", "Terre", "Soins médicaux"));
        systemeReservation.ajouterPersonne(new Civil("Troy", "Deanna", "TRO004", "Betazed", "Conseil"));
    
        // Add missions
        systemeReservation.creerMission(new Mission("VUL001", "Mission vers Vulcain", new Date(0), new Date(0), "Vulcain", 1, 0));
        systemeReservation.creerMission(new Mission("TER001", "Mission vers Terre", new Date(0), new Date(0), "Terre", 1, 0));
        systemeReservation.creerMission(new Mission("RIS001", "Mission vers Risa", new Date(0), new Date(0), "Risa", 1, 0));
    
        // Perform reservations
        Reservation picardVulcain = systemeReservation.effectuerReservation("PIC001", "VUL001");
        Reservation rikerVulcain = systemeReservation.effectuerReservation("RIK002", "VUL001");
        Reservation crusherRisa = systemeReservation.effectuerReservation("CRU003", "RIS001");
    
        picardVulcain.confirmer();  // Confirmer la réservation de Picard
        rikerVulcain.annuler();  // Annuler la réservation de Riker
         
        
        // Print results
        System.out.println(picardVulcain);
        System.out.println(rikerVulcain);
        System.out.println(crusherRisa);
        systemeReservation.sauvegarderDonnees("starfleet_data.txt");
        System.out.println("Données sauvegardées dans starfleet_data.txt");
    }
    

    public List<Mission> rechercherMissions(String destination) {
        List<Mission> result = new ArrayList<>();
        for (Mission mission : missions) {
            if (mission.getDestination().equals(destination)) {
                result.add(mission);
            }
        }
        return result;
    }

    public void sauvegarderDonnees(String fichier) {
        // Implémenter la sauvegarde
    }

  public static SystemeReservation chargerDonnees(String fichier) {
    return null;
}


    private Personne findPersonneById(String id) {
        for (Personne p : personnes) {
            if (p.getIdentifiant().equals(id)) {
                return p;
            }
        }
        return null;
    }

    private Mission findMissionByCode(String code) {
        for (Mission m : missions) {
            if (m.getCode().equals(code)) {
                return m;
            }
        }
        return null;
    }

    public void effectuerReservation(Reservation reservation) {
        
        throw new UnsupportedOperationException("Unimplemented method 'effectuerReservation'");
    }

    public Vaisseau[] getVaisseau() {
        
        throw new UnsupportedOperationException("Unimplemented method 'getVaisseau'");
    }
}