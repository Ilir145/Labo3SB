package be.techni.ilir.labo3SB.api.controller;

import be.techni.ilir.labo3SB.model.dto.CategorieDTO;
import be.techni.ilir.labo3SB.model.entities.Categorie;
import be.techni.ilir.labo3SB.model.services.CategorieService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api/categories")
@CrossOrigin
public class CategorieApiController implements RestControllable<Categorie, CategorieDTO,Integer> {

    private final CategorieService categorieService;

    public CategorieApiController(CategorieService categorieService) {
        this.categorieService = categorieService;
    }

    @Override
    @GetMapping
    public ResponseEntity<List<CategorieDTO>> getAll() {
        return ResponseEntity.ok(this.categorieService.getAll());
    }

    @Override
    public ResponseEntity<CategorieDTO> getOne(Integer integer) {
        return null;
    }

    @Override
    public ResponseEntity<Boolean> insert(Categorie categorie) {
        return null;
    }

    @Override
    public ResponseEntity<Boolean> update(Categorie categorie, Integer integer) {
        return null;
    }

    @Override
    public ResponseEntity<Boolean> delete(Integer integer) {
        return null;
    }
}
