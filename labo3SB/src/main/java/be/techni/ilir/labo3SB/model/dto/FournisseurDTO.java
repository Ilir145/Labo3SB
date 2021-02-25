package be.techni.ilir.labo3SB.model.dto;

import be.techni.ilir.labo3SB.model.entities.enums.Secteur;
import be.techni.ilir.labo3SB.model.entities.enums.StatutSocial;
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
public class FournisseurDTO {

    private int id;

    private String nomEntreprise;

    private StatutSocial statutSocial;

    private Secteur secteur;

    private Instant insertionDate;

    private Instant updateDate;

    private List<ProduitDTO> produitList;
}
