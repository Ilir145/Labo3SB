package be.techni.ilir.labo3SB.model.repository;

import be.techni.ilir.labo3SB.model.entities.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UtilisateurRepository extends JpaRepository<Utilisateur,Integer> {
}
