package fr.starfleet.modele.ui;

import fr.starfleet.modele.systeme.SystemeReservation;
import fr.starfleet.modele.vaisseau.Vaisseau;
import fr.starfleet.modele.personne.Personne;
import fr.starfleet.modele.mission.Mission;
import fr.starfleet.modele.reservation.Reservation;

import java.util.Scanner;

public class InterfaceConsole {
    private SystemeReservation systeme;
    private Scanner scanner;

    // Constructeur
    public InterfaceConsole() {
        this.systeme = new SystemeReservation();
        this.scanner = new Scanner(System.in);
    }

    // Méthode principale pour démarrer l'interface
    public void demarrer() {
        afficherMenu();
    }

    // Méthode pour afficher le menu principal et gérer les choix de l'utilisateur
    private void afficherMenu() {
        while (true) {
            System.out.println("=== Menu Principal ===");
            System.out.println("1. Gérer les vaisseaux");
            System.out.println("2. Gérer les personnes");
            System.out.println("3. Gérer les missions");
            System.out.println("4. Gérer les réservations");
            System.out.println("5. Sauvegarder les données");
            System.out.println("6. Charger les données");
            System.out.println("7. Quitter");
            System.out.print("Choisir une option: ");

            int choix = scanner.nextInt();
            scanner.nextLine(); // Consommer la nouvelle ligne après l'entrée du nombre

            switch (choix) {
                case 1:
                    gererVaisseaux();
                    break;
                case 2:
                    gererPersonnes();
                    break;
                case 3:
                    gererMissions();
                    break;
                case 4:
                    gererReservations();
                    break;
                case 5:
                    sauvegarderDonnees();
                    break;
                case 6:
                    chargerDonnees();
                    break;
                case 7:
                    System.out.println("Au revoir !");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Option invalide, réessayez.");
            }
        }
    }

    // Méthode pour gérer les vaisseaux
    private void gererVaisseaux() {
        System.out.println("=== Gérer les vaisseaux ===");
        // Implémentation pour ajouter, lister ou modifier les vaisseaux
        System.out.println("1. Ajouter un vaisseau");
        System.out.println("2. Retour");
        System.out.print("Choisir une option: ");
        int choix = scanner.nextInt();
        scanner.nextLine(); // Consommer la nouvelle ligne

        switch (choix) {
            case 1:
                // Demander les informations pour ajouter un vaisseau
                System.out.print("Nom du vaisseau: ");
                String nom = scanner.nextLine();
                System.out.print("Immatriculation du vaisseau: ");
                String immatriculation = scanner.nextLine();
                System.out.print("Capacité maximale: ");
                int capaciteMaximale = scanner.nextInt();
                scanner.nextLine(); // Consommer la nouvelle ligne

                // Créer et ajouter le vaisseau à l'objet systeme
                Vaisseau vaisseau = new Vaisseau(nom, immatriculation, capaciteMaximale);
                systeme.ajouterVaisseau(vaisseau);
                System.out.println("Vaisseau ajouté avec succès !");
                break;
            case 2:
                return;  // Retourner au menu principal
            default:
                System.out.println("Option invalide.");
                break;
        }
    }

    // Méthode pour gérer les personnes
    private void gererPersonnes() {
        System.out.println("=== Gérer les personnes ===");
        // Implémentation pour ajouter, lister ou modifier les personnes
        System.out.println("1. Ajouter une personne");
        System.out.println("2. Retour");
        System.out.print("Choisir une option: ");
        int choix = scanner.nextInt();
        scanner.nextLine(); // Consommer la nouvelle ligne

        switch (choix) {
            case 1:
                // Demander les informations pour ajouter une personne
                System.out.print("Nom: ");
                String nom = scanner.nextLine();
                System.out.print("Prénom: ");
                String prenom = scanner.nextLine();
                System.out.print("Identifiant: ");
                String identifiant = scanner.nextLine();

                // Créer et ajouter la personne à l'objet systeme
                Personne personne = new Personne(nom, prenom, identifiant) {
                    @Override
                    public String getDescription() {
                        return "Personne: " + nom + " " + prenom + " (" + identifiant + ")";
                    }
                };
                systeme.ajouterPersonne(personne);
                System.out.println("Personne ajoutée avec succès !");
                break;
            case 2:
                return;  // Retourner au menu principal
            default:
                System.out.println("Option invalide.");
                break;
        }
    }

    // Méthode pour gérer les missions
    private void gererMissions() {
        System.out.println("=== Gérer les missions ===");
        // Implémentation pour créer des missions
        System.out.println("1. Créer une mission");
        System.out.println("2. Retour");
        System.out.print("Choisir une option: ");
        int choix = scanner.nextInt();
        scanner.nextLine(); // Consommer la nouvelle ligne

        switch (choix) {
            case 1:
                // Demander les informations pour créer une mission
                System.out.print("Code de mission: ");
                String code = scanner.nextLine();
                System.out.print("Description de la mission: ");
                String description = scanner.nextLine();
                System.out.print("Destination: ");
                String destination = scanner.nextLine();
                System.out.print("Capacité maximale: ");
                int capaciteMaximale = scanner.nextInt();
                scanner.nextLine(); // Consommer la nouvelle ligne

                // Créer et ajouter la mission
                Mission mission = new Mission(code, description, destination, capaciteMaximale);
                systeme.creerMission(mission);
                System.out.println("Mission créée avec succès !");
                break;
            case 2:
                return;  // Retourner au menu principal
            default:
                System.out.println("Option invalide.");
                break;
        }
    }

    // Méthode pour gérer les réservations
    private void gererReservations() {
        System.out.println("=== Gérer les réservations ===");
        // Implémentation pour gérer les réservations
        System.out.println("1. Effectuer une réservation");
        System.out.println("2. Retour");
        System.out.print("Choisir une option: ");
        int choix = scanner.nextInt();
        scanner.nextLine(); // Consommer la nouvelle ligne

        switch (choix) {
            case 1:
                // Demander les informations pour effectuer une réservation
                System.out.print("ID Personne: ");
                String idPersonne = scanner.nextLine();
                System.out.print("ID Mission: ");
                String idMission = scanner.nextLine();

                // Créer une réservation et l'ajouter au système
                Reservation reservation = new Reservation(idPersonne, idMission, idPersonne);
                systeme.effectuerReservation(reservation);
                System.out.println("Réservation effectuée !");
                break;
            case 2:
                return;  // Retourner au menu principal
            default:
                System.out.println("Option invalide.");
                break;
        }
    }

    // Méthode pour sauvegarder les données
    private void sauvegarderDonnees() {
        System.out.println("=== Sauvegarder les données ===");
        // Implémentation pour sauvegarder les données
        systeme.sauvegarderDonnees("sauvegarde.dat");
        System.out.println("Données sauvegardées avec succès !");
    }

    // Méthode pour charger les données
    private void chargerDonnees() {
        System.out.println("=== Charger les données ===");
        // Implémentation pour charger les données
        SystemeReservation.chargerDonnees("sauvegarde.dat");
        System.out.println("Données chargées avec succès !");
    }
}
