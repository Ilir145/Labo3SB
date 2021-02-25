package be.techni.ilir.labo3SB.model.entities;

import be.techni.ilir.labo3SB.model.entities.enums.MoyenPaiement;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.Instant;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode
@Entity
public class Commande {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @CreationTimestamp
    private Instant creationDate;

    @Column
    private boolean estPaye;

    @Enumerated(EnumType.STRING)
    private MoyenPaiement moyenPaiement;

    @ManyToOne
    private Utilisateur utilisateur;

    @ManyToMany
    private List<Produit> produitList;

}
