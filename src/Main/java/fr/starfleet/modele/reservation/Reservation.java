package fr.starfleet.modele.reservation;

import java.util.Date;
import fr.starfleet.modele.mission.Mission;
import fr.starfleet.modele.personne.Personne;

public class Reservation implements Reservable {
    private String idReservation;
    private Personne passager;
    private Mission mission;
    private Date dateReservation;
    private boolean confirmee;

    // Constructeur principal
    public Reservation(String idReservation, Personne passager, Mission mission) {
        this.idReservation = idReservation;
        this.passager = passager;
        this.mission = mission;
        this.dateReservation = new Date();
        this.confirmee = false;
    }

    // Constructeur alternatif avec IDs
    public Reservation(String idReservation, String idPersonne, String idMission) {
        this.idReservation = idReservation;
        this.passager = null; // À récupérer via un gestionnaire de personnes
        this.mission = null;  // À récupérer via un gestionnaire de missions
        this.dateReservation = new Date();
        this.confirmee = false;
    }

    public String getIdReservation() {
        return idReservation;
    }

    public void setIdReservation(String idReservation) {
        this.idReservation = idReservation;
    }

    public Personne getPassager() {
        return passager;
    }

    public void setPassager(Personne passager) {
        this.passager = passager;
    }

    public Mission getMission() {
        return mission;
    }

    public void setMission(Mission mission) {
        this.mission = mission;
    }

    public Date getDateReservation() {
        return dateReservation;
    }

    public boolean isConfirmee() {
        return confirmee;
    }

    public void confirmer() {
        this.confirmee = true;
    }

    public void annuler() {
        this.confirmee = false;
    }

    @Override
    public void reserver(Personne personne) {
        this.passager = personne;
        this.dateReservation = new Date();
        this.confirmee = true;
    }

    @Override
    public boolean annulerReservation(String idReservation) {
        if (this.idReservation.equals(idReservation)) {
            this.confirmee = false;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "idReservation='" + idReservation + '\'' +
                ", passager=" + (passager != null ? passager.getNom() : "Aucun") +
                ", mission=" + (mission != null ? mission.getCode() : "Non assignée") +
                ", dateReservation=" + dateReservation +
                ", confirmee=" + confirmee +
                '}';
    }
}


