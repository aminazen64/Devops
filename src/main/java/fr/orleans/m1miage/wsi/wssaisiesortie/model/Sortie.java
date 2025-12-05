package fr.orleans.m1miage.wsi.wssaisiesortie.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Sortie {

    private String label;
    private String lieu;
    private LocalDate dateFinSortie;
    private LocalDate dateFinVote;
    private int nbrMaxPersonnes;
    private int nbVotes;
    private List<String> personnes = new ArrayList<>();

    public Sortie() {}

    public Sortie(String label, String lieu, LocalDate dateFinSortie, LocalDate dateFinVote,
                  int nbrMaxPersonnes) {
        this.label = label;
        this.lieu = lieu;
        this.dateFinSortie = dateFinSortie;
        this.dateFinVote = dateFinVote;
        this.nbrMaxPersonnes = nbrMaxPersonnes;
        this.nbVotes = 0;
    }


    // GETTERS & SETTERS
    public String getLabel() { return label; }
    public void setLabel(String label) { this.label = label; }

    public String getLieu() { return lieu; }
    public void setLieu(String lieu) { this.lieu = lieu; }

    public LocalDate getDateFinSortie() { return dateFinSortie; }
    public void setDateFinSortie(LocalDate dateFinSortie) { this.dateFinSortie = dateFinSortie; }

    public LocalDate getDateFinVote() { return dateFinVote; }
    public void setDateFinVote(LocalDate dateFinVote) { this.dateFinVote = dateFinVote; }

    public int getNbrMaxPersonnes() { return nbrMaxPersonnes; }
    public void setNbrMaxPersonnes(int nbrMaxPersonnes) { this.nbrMaxPersonnes = nbrMaxPersonnes; }

    public int getNbVotes() { return nbVotes; }
    public void setNbVotes(int nbVotes) { this.nbVotes = nbVotes; }

    public List<String> getPersonnes() { return personnes; }
    public void setPersonnes(List<String> personnes) { this.personnes = personnes; }
}
