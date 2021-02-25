package be.techni.ilir.labo3SB.model.entities;

import be.techni.ilir.labo3SB.model.entities.enums.NiveauAcces;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode
@Entity
public class Utilisateur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String nom;

    @Column(nullable = false)
    private String prenom;

    @Enumerated(EnumType.STRING)
    private NiveauAcces niveauAcces;

    @Column(nullable = false)
    private String pseudo;

    @Column(nullable = false)
    private String mdp;

    @Embedded
    private Adresse adresse;

    @OneToMany(mappedBy = "utilisateur")
    private List<Commande> commandeList;
}
