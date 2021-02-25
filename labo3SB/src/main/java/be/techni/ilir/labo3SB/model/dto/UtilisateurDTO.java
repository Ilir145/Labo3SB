package be.techni.ilir.labo3SB.model.dto;

import be.techni.ilir.labo3SB.model.entities.Adresse;
import be.techni.ilir.labo3SB.model.entities.Commande;
import be.techni.ilir.labo3SB.model.entities.enums.NiveauAcces;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UtilisateurDTO {


    private int id;

    private String nom;

    private String prenom;

    private NiveauAcces niveauAcces;

    private String pseudo;

    private String mdp;

    private Adresse adresse;

    private List<CommandeDTO> commandeList;
}
