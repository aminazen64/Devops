package fr.orleans.m1miage.wsi.wssaisiesortie.controleur;

import fr.orleans.m1miage.wsi.wssaisiesortie.model.Sortie;
import fr.orleans.m1miage.wsi.wssaisiesortie.model.facadeApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/sorties")
public class Controlleur {

    private final facadeApplication facade;

    public Controlleur(facadeApplication facade) {
        this.facade = facade;
    }

    @GetMapping
    public String afficherFormEtListe(Model model) {
        model.addAttribute("sortieForm", new Sortie());
        model.addAttribute("sorties", facade.listerSorties());
        return "front";
    }

    @PostMapping("/add")
    public String ajouter(@ModelAttribute("sortieForm") Sortie sortie, Model model) {
        try {
            facade.enregistrerSortie(
                    sortie.getLabel(),
                    sortie.getLieu(),
                    sortie.getDateFinSortie(),
                    sortie.getDateFinVote(),
                    sortie.getNbrMaxPersonnes() == null ? 0 : sortie.getNbrMaxPersonnes()
            );
            return "redirect:/sorties";

        } catch (Exception e) {
            model.addAttribute("error", e.getMessage());
            model.addAttribute("sorties", facade.listerSorties());
            return "front";
        }
    }
}
