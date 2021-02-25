package be.techni.ilir.labo3SB.api.controller;

import be.techni.ilir.labo3SB.model.dto.ProduitDTO;
import be.techni.ilir.labo3SB.model.entities.Produit;
import be.techni.ilir.labo3SB.model.services.ProduitService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api/produits")
@CrossOrigin
public class ProduitApiController implements RestControllable<Produit, ProduitDTO,Integer> {

    private final ProduitService produitService;

    public ProduitApiController(ProduitService produitService) {
        this.produitService = produitService;
    }

    @Override
    @GetMapping
    public ResponseEntity<List<ProduitDTO>> getAll() {
        return ResponseEntity.ok(this.produitService.getAll());
    }

    @Override
    public ResponseEntity<ProduitDTO> getOne(Integer integer) {
        return null;
    }

    @Override
    public ResponseEntity<Boolean> insert(Produit produit) {
        return null;
    }

    @Override
    public ResponseEntity<Boolean> update(Produit produit, Integer integer) {
        return null;
    }

    @Override
    public ResponseEntity<Boolean> delete(Integer integer) {
        return null;
    }
}
