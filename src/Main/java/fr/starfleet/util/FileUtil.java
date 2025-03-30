package fr.starfleet.util;

import java.io.*;

public class FileUtil {

    // Créer un fichier sauvegarde.dat s'il n'existe pas
    public static void creerFichierSauvegarde(String cheminFichier) {
        try {
            File file = new File(cheminFichier);
            if (file.createNewFile()) {
                System.out.println("Le fichier a été créé : " + file.getName());
            } else {
                System.out.println("Le fichier existe déjà.");
            }
        } catch (IOException e) {
            System.out.println("Une erreur est survenue lors de la création du fichier.");
            e.printStackTrace();
        }
    }

    // Méthode pour sauvegarder du contenu dans sauvegarde.dat
    public static void sauvegarder(String cheminFichier, String contenu) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(cheminFichier))) {
            writer.write(contenu);
        }
    }

    public static String charger(String cheminFichier) throws IOException {
        StringBuilder contenu = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(cheminFichier))) {
            String ligne;
            while ((ligne = reader.readLine()) != null) {
                contenu.append(ligne).append("\n");
            }
        }
        return contenu.toString();
    }
}
