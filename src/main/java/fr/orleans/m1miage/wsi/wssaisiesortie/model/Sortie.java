package fr.orleans.m1miage.wsi.wssaisiesortie.model;

import java.time.LocalDate;

public class Sortie {

    private String label;
    private String lieu;
    private LocalDate dateFinSortie;
    private LocalDate dateFinVote;
    private Integer nbrMaxPersonnes;

    // Constructeur vide indispensable pour Thymeleaf/Spring binding
    public Sortie() {}

    public Sortie(String label, String lieu,
                  LocalDate dateFinSortie, LocalDate dateFinVote,
                  Integer nbrMaxPersonnes) {
        this.label = label;
        this.lieu = lieu;
        this.dateFinSortie = dateFinSortie;
        this.dateFinVote = dateFinVote;
        this.nbrMaxPersonnes = nbrMaxPersonnes;
    }

    public String getLabel() {
        return label;
    }
    public void setLabel(String label) {
        this.label = label;
    }

    public String getLieu() {
        return lieu;
    }
    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    public LocalDate getDateFinSortie() {
        return dateFinSortie;
    }
    public void setDateFinSortie(LocalDate dateFinSortie) {
        this.dateFinSortie = dateFinSortie;
    }

    public LocalDate getDateFinVote() {
        return dateFinVote;
    }
    public void setDateFinVote(LocalDate dateFinVote) {
        this.dateFinVote = dateFinVote;
    }

    public Integer getNbrMaxPersonnes() {
        return nbrMaxPersonnes;
    }
    public void setNbrMaxPersonnes(Integer nbrMaxPersonnes) {
        this.nbrMaxPersonnes = nbrMaxPersonnes;
    }
}
