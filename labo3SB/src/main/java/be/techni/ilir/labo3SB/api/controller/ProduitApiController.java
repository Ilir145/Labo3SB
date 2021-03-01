package be.techni.ilir.labo3SB.api.controller;

import be.techni.ilir.labo3SB.model.dto.ProduitDTO;
import be.techni.ilir.labo3SB.model.entities.Produit;
import be.techni.ilir.labo3SB.model.services.ProduitService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
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
    @GetMapping(path = "/{id}")
    public ResponseEntity<ProduitDTO> getOne(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.produitService.getById(id));
    }

    @Override
    @PostMapping
    public ResponseEntity<Boolean> insert(@Valid @RequestBody Produit produit) {
        return ResponseEntity.ok(this.produitService.insert(produit));
    }

    @Override
    public ResponseEntity<Boolean> update(Produit produit, Integer integer) {
        return null;
    }

    @Override
    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable("id") Integer integer) {
        return ResponseEntity.ok(this.produitService.delete(integer));
    }
}
