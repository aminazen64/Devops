package fr.orleans.m1miage.wsi.wssaisiesortie.model;

public class Personne {
    private String email;
    private String nom;

    public Personne() {}

    public Personne(String email, String nom) {
        this.email = email;
        this.nom = nom;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
}
