package be.techni.ilir.labo3SB.model.repository;

import be.techni.ilir.labo3SB.model.entities.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategorieRepository extends JpaRepository<Categorie,Integer> {
}
