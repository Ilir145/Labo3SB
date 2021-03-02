package be.techni.ilir.labo3SB.model.repository;

import be.techni.ilir.labo3SB.model.entities.Categorie;
import be.techni.ilir.labo3SB.model.entities.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface ProduitRepository extends JpaRepository<Produit,Integer>{

}
