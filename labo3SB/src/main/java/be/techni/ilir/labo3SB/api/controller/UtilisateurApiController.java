package be.techni.ilir.labo3SB.api.controller;

import be.techni.ilir.labo3SB.model.dto.UtilisateurDTO;
import be.techni.ilir.labo3SB.model.entities.Utilisateur;
import be.techni.ilir.labo3SB.model.services.UtilisateurService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/utilisateurs")
@CrossOrigin
public class UtilisateurApiController implements RestControllable<Utilisateur, UtilisateurDTO,Integer> {

    private final UtilisateurService utilisateurService;

    public UtilisateurApiController(UtilisateurService utilisateurService) {
        this.utilisateurService = utilisateurService;
    }

    @Override
    @GetMapping
    public ResponseEntity<List<UtilisateurDTO>> getAll() {
        return ResponseEntity.ok(this.utilisateurService.getAll());
    }

    @Override
    public ResponseEntity<UtilisateurDTO> getOne( Integer id) {
        return null;
    }

    @Override
    @PostMapping
    public ResponseEntity<Boolean> insert(@RequestBody Utilisateur utilisateur) {
        return ResponseEntity.ok(this.utilisateurService.insert(utilisateur));
    }

    @Override
    public ResponseEntity<Boolean> update(Utilisateur utilisateur, Integer integer) {
        return null;
    }

    @Override
    public ResponseEntity<Boolean> delete(Integer integer) {
        return null;
    }
}
