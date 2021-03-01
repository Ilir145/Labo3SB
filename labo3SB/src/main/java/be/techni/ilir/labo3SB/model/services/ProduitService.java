package be.techni.ilir.labo3SB.model.services;

import be.techni.ilir.labo3SB.mapper.Mapper;
import be.techni.ilir.labo3SB.model.dto.ProduitDTO;
import be.techni.ilir.labo3SB.model.entities.Produit;
import be.techni.ilir.labo3SB.model.repository.CommandeRepository;
import be.techni.ilir.labo3SB.model.repository.FournisseurRepository;
import be.techni.ilir.labo3SB.model.repository.ProduitRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

@Service
public class ProduitService implements Crudable<Produit, ProduitDTO,Integer>{

    private final ProduitRepository produitRepository;

    private final CommandeRepository commandeRepository;

    private final FournisseurRepository fournisseurRepository;

    private final Mapper mapper;

    public ProduitService(ProduitRepository produitRepository, CommandeRepository commandeRepository, FournisseurRepository fournisseurRepository, Mapper mapper) {
        this.produitRepository = produitRepository;
        this.commandeRepository = commandeRepository;
        this.fournisseurRepository = fournisseurRepository;
        this.mapper = mapper;
    }


    @Override
    public List<ProduitDTO> getAll() {
        return this.produitRepository.findAll()
                .stream()
                .map(mapper::toProduitDTO)
                .collect(Collectors.toList());
    }

    @Override
    @GetMapping(path = "/{id}")
    public ProduitDTO getById(@PathVariable("id") Integer integer) {
        Produit produit = this.produitRepository.findById(integer).orElseThrow(() -> new NoSuchElementException("Le Produit n'existe pas"));

        return mapper.toProduitDTO(produit);
    }

    @Override
    public boolean insert(Produit produit) {
        Produit newProduit = this.produitRepository.save(produit);
        return this.produitRepository.findById(newProduit.getId()).isPresent();
    }

    @Override
    public boolean update(Produit produit, Integer integer) {
        return false;
    }

    @Override
    public boolean delete(Integer integer) {
        this.produitRepository.deleteById(integer);
        return this.produitRepository.findById(integer).isEmpty();
    }
}
