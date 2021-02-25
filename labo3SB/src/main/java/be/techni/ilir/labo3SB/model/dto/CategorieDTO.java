package be.techni.ilir.labo3SB.model.dto;

import be.techni.ilir.labo3SB.model.entities.Produit;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CategorieDTO {

    private int id;

    private String nom;

    private List<ProduitDTO> produitList;
}
