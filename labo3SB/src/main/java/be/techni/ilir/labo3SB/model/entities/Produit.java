package be.techni.ilir.labo3SB.model.entities;

import jdk.jfr.Timestamp;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.Instant;
import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode
@Entity
public class Produit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(unique = true,nullable = false)
    private String nom;

    @Column
    private String description;

    @CreationTimestamp
    private Instant creationDate;

    @UpdateTimestamp
    private Instant updateDate;

    @Column
    private LocalDate datePeremption;

    @Column(nullable = false)
    private Double prix;

    @Column(nullable = false)
    private int quantite;

    @Column(nullable = false)
    private double tva;

    @ManyToMany(mappedBy = "produitList")
    private List<Categorie> categorieList;

    @ManyToOne
    private Fournisseur fournisseur;

}
