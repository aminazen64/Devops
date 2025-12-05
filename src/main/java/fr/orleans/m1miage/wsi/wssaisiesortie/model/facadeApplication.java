package fr.orleans.m1miage.wsi.wssaisiesortie.model;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class facadeApplication {

    private Map<String, Personne> personnes = new HashMap<>();
    private Map<String, Sortie> sorties = new HashMap<>();

    public String enregistrerSortie(String label, String lieu,
                                    LocalDate dateFinSortie, LocalDate dateFinVote,
                                    int nbrMaxPersonnes) {

        if (label == null || label.isBlank()) {
            throw new IllegalArgumentException("Le label ne doit pas être vide");
        }
        if (lieu == null || lieu.isBlank()) {
            throw new IllegalArgumentException("Le lieu ne doit pas être vide");
        }
        if (dateFinSortie == null) {
            throw new IllegalArgumentException("La date de fin de sortie ne doit pas être null");
        }
        if (dateFinVote == null) {
            throw new IllegalArgumentException("La date de fin de vote ne doit pas être null");
        }
        if (nbrMaxPersonnes <= 0) {
            throw new IllegalArgumentException("Le nombre max de personnes doit être > 0");
        }

        LocalDate now = LocalDate.now();

        if (!dateFinSortie.isAfter(now)) {
            throw new IllegalArgumentException("La date limite de sortie doit être postérieure à aujourd’hui");
        }

        if (!dateFinVote.isBefore(dateFinSortie)) {
            throw new IllegalArgumentException("La date limite de vote doit être antérieure à la date limite de sortie");
        }

        if (sorties.containsKey(label)) {
            throw new IllegalArgumentException("Une sortie avec ce label existe déjà");
        }

        Sortie sortie = new Sortie(label, lieu, dateFinSortie, dateFinVote, nbrMaxPersonnes);
        sorties.put(label, sortie);

        return label;
    }

    public Collection<Sortie> listerSorties() {
        return sorties.values();
    }

    public Sortie getSortie(String label) {
        return sorties.get(label);
    }
}
