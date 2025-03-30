package fr.starfleet.modele.personne;

public class Officier extends Personne {

    private String specialite;
    private String rang;

    public Officier(String nom, String prenom, String identifiant, String rang, String specialite) {
        super(nom, prenom, identifiant);
        this.rang = rang;
        this.specialite = specialite;
    }

    public String getRang() {
        return rang;
    }

    public void setRang(String rang) {
        this.rang = rang;
    }

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    @Override
    public String getDescription() {
        return "Officier " + rang + " spécialisé en " + specialite;
    }

    @Override
    public String toString() {
        return super.toString() + " | " + getDescription();
    }
}
