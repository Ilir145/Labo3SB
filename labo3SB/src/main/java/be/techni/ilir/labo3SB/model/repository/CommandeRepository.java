package be.techni.ilir.labo3SB.model.repository;

import be.techni.ilir.labo3SB.model.entities.Commande;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CommandeRepository extends JpaRepository<Commande,Integer> {
}
