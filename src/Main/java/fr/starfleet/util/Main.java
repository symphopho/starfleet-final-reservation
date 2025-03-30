package fr.starfleet.util;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        try {
            // Test de la méthode formatDate
            Date today = new Date();
            String formattedDate = DateUtil.formatDate(today);
            System.out.println("Date formatée : " + formattedDate);

            // Test de la méthode getDateFromString
            String dateStr = "30/03/2025";
            Date parsedDate = DateUtil.getDateFromString(dateStr);
            System.out.println("Date parsée : " + parsedDate);
        } catch (Exception e) {
            System.err.println("Erreur : " + e.getMessage());
        }
    }
}
