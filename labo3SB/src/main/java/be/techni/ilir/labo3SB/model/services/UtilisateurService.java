package be.techni.ilir.labo3SB.model.services;

import be.techni.ilir.labo3SB.mapper.Mapper;
import be.techni.ilir.labo3SB.model.dto.UtilisateurDTO;
import be.techni.ilir.labo3SB.model.entities.Utilisateur;
import be.techni.ilir.labo3SB.model.repository.CommandeRepository;
import be.techni.ilir.labo3SB.model.repository.UtilisateurRepository;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.stream.Collectors;

@Service
public class UtilisateurService implements Crudable<Utilisateur, UtilisateurDTO,Integer> {

    private final UtilisateurRepository utilisateurRepository;

    private final CommandeRepository commandeRepository;

    private final Mapper mapper;

    public UtilisateurService(UtilisateurRepository utilisateurRepository, CommandeRepository commandeRepository, Mapper mapper) {
        this.utilisateurRepository = utilisateurRepository;
        this.commandeRepository = commandeRepository;
        this.mapper = mapper;
    }

    @Override
    public List<UtilisateurDTO> getAll() {
        return this.utilisateurRepository.findAll()
                .stream()
                .map(mapper::toUtilisateurDTO)
                .collect(Collectors.toList());
    }

    @Override
    public UtilisateurDTO getById(Integer integer) {
        return null;
    }

    @Override
    public boolean insert(Utilisateur utilisateur) {
        Utilisateur newUtilisateur = this.utilisateurRepository.save(utilisateur);
        return this.utilisateurRepository.findById(newUtilisateur.getId()).isPresent();
    }

    @Override
    public boolean update(Utilisateur utilisateur, Integer integer) {
        return false;
    }

    @Override
    public boolean delete(Integer integer) {
        return false;
    }
}
