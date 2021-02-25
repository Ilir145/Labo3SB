package be.techni.ilir.labo3SB.model.dto;

import be.techni.ilir.labo3SB.model.entities.enums.MoyenPaiement;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CommandeDTO {

    private int id;

    private Instant creationDate;

    private boolean estPaye;

    private MoyenPaiement moyenPaiement;

    private UtilisateurDTO utilisateur;

    private List<ProduitDTO> produitList;
}
