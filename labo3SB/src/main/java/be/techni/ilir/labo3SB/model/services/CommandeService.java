package be.techni.ilir.labo3SB.model.services;

import be.techni.ilir.labo3SB.mapper.Mapper;
import be.techni.ilir.labo3SB.model.dto.CommandeDTO;
import be.techni.ilir.labo3SB.model.entities.Commande;
import be.techni.ilir.labo3SB.model.repository.CommandeRepository;
import be.techni.ilir.labo3SB.model.repository.ProduitRepository;
import be.techni.ilir.labo3SB.model.repository.UtilisateurRepository;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.stream.Collectors;

@Service
public class CommandeService implements Crudable<Commande, CommandeDTO,Integer>{

    private final CommandeRepository commandeRepository;

    private final UtilisateurRepository utilisateurRepository;

    private final ProduitRepository produitRepository;

    private final Mapper mapper;

    public CommandeService(CommandeRepository commandeRepository, UtilisateurRepository utilisateurRepository, ProduitRepository produitRepository, Mapper mapper) {
        this.commandeRepository = commandeRepository;
        this.utilisateurRepository = utilisateurRepository;
        this.produitRepository = produitRepository;
        this.mapper = mapper;
    }

    @Override
    public List<CommandeDTO> getAll() {
        return this.commandeRepository.findAll()
                .stream()
                .map(mapper::toCommandeDTO)
                .collect(Collectors.toList());
    }

    @Override
    public CommandeDTO getById(Integer integer) {
        return null;
    }

    @Override
    public boolean insert(Commande commande) {
        Commande newCommande = this.commandeRepository.save(commande);
        return this.commandeRepository.findById(newCommande.getId()).isPresent();
    }

    @Override
    public boolean update(Commande commande, Integer integer) {
        return false;
    }

    @Override
    public boolean delete(Integer integer) {
        return false;
    }
}
