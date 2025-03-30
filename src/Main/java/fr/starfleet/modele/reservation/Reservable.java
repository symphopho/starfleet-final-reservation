package fr.starfleet.modele.reservation;

import fr.starfleet.modele.personne.Personne;

public interface Reservable {
    void reserver(Personne personne);
    boolean annulerReservation(String idReservation);
}