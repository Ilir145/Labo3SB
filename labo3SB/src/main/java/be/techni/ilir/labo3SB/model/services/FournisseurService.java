package be.techni.ilir.labo3SB.model.services;

import be.techni.ilir.labo3SB.mapper.Mapper;
import be.techni.ilir.labo3SB.model.dto.FournisseurDTO;
import be.techni.ilir.labo3SB.model.entities.Fournisseur;
import be.techni.ilir.labo3SB.model.repository.FournisseurRepository;
import be.techni.ilir.labo3SB.model.repository.ProduitRepository;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.stream.Collectors;

@Service
public class FournisseurService implements Crudable<Fournisseur, FournisseurDTO,Integer>{

    private final FournisseurRepository fournisseurRepository;

    private final ProduitRepository produitRepository;

    private final Mapper mapper;

    public FournisseurService(FournisseurRepository fournisseurRepository, ProduitRepository produitRepository, Mapper mapper) {
        this.fournisseurRepository = fournisseurRepository;
        this.produitRepository = produitRepository;
        this.mapper = mapper;
    }

    @Override
    public List<FournisseurDTO> getAll() {
        return this.fournisseurRepository.findAll()
                .stream()
                .map(mapper::toFournisseurDTO)
                .collect(Collectors.toList());
    }

    @Override
    public FournisseurDTO getById(Integer integer) {
        return null;
    }

    @Override
    public boolean insert(Fournisseur fournisseur) {
        Fournisseur newFournisseur = this.fournisseurRepository.save(fournisseur);
        return this.fournisseurRepository.findById(newFournisseur.getId()).isPresent();
    }

    @Override
    public boolean update(Fournisseur fournisseur, Integer integer) {
        return false;
    }

    @Override
    public boolean delete(Integer integer) {
        return false;
    }
}
