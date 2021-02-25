package be.techni.ilir.labo3SB.model.entities;

import be.techni.ilir.labo3SB.model.entities.enums.Secteur;
import be.techni.ilir.labo3SB.model.entities.enums.StatutSocial;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.Instant;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode
@Entity
public class Fournisseur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(unique = true,nullable = false)
    private String nomEntreprise;

    @Enumerated(EnumType.STRING)
    private StatutSocial statutSocial;

    @Enumerated(EnumType.STRING)
    private Secteur secteur;

    @CreationTimestamp
    private Instant insertionDate;

    @UpdateTimestamp
    private Instant updateDate;

    @OneToMany(mappedBy = "fournisseur",cascade = CascadeType.REMOVE)
    private List<Produit> produitList;
}
