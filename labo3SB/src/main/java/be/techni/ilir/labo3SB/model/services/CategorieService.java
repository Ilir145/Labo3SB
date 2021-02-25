package be.techni.ilir.labo3SB.model.services;

import be.techni.ilir.labo3SB.mapper.Mapper;
import be.techni.ilir.labo3SB.model.dto.CategorieDTO;
import be.techni.ilir.labo3SB.model.entities.Categorie;
import be.techni.ilir.labo3SB.model.repository.CategorieRepository;
import be.techni.ilir.labo3SB.model.repository.ProduitRepository;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.stream.Collectors;

@Service
public class CategorieService implements Crudable<Categorie, CategorieDTO,Integer> {

    private final CategorieRepository categorieRepository;

    private final ProduitRepository produitRepository;

    private final Mapper mapper;

    public CategorieService(CategorieRepository categorieRepository, ProduitRepository produitRepository, Mapper mapper) {
        this.categorieRepository = categorieRepository;
        this.produitRepository = produitRepository;
        this.mapper = mapper;
    }

    @Override
    public List<CategorieDTO> getAll() {
        return this.categorieRepository.findAll()
                .stream()
                .map(mapper::toCategorieDTO)
                .collect(Collectors.toList());
    }

    @Override
    public CategorieDTO getById(Integer integer) {
        return null;
    }

    @Override
    public boolean insert(Categorie categorie) {
        Categorie newCategorie = this.categorieRepository.save(categorie);
        return this.categorieRepository.findById(newCategorie.getId()).isPresent();
    }

    @Override
    public boolean update(Categorie categorie, Integer integer) {
        return false;
    }

    @Override
    public boolean delete(Integer integer) {
        return false;
    }
}
