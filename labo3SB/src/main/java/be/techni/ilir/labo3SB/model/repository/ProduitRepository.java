package be.techni.ilir.labo3SB.model.repository;

import be.techni.ilir.labo3SB.model.entities.Produit;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProduitRepository extends JpaRepository<Produit,Integer>{
}
