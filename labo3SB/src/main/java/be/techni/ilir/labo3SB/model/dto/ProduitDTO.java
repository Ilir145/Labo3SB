package be.techni.ilir.labo3SB.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;



import java.time.Instant;
import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProduitDTO {

    private int id;

    private String nom;

    private String description;

    private Instant creationDate;

    private Instant updateDate;

    private LocalDate datePeremption;

    private Double prix;

    private int quantite;

    private double tva;

    private List<CategorieDTO> categorieList;

    private FournisseurDTO fournisseur;
}
