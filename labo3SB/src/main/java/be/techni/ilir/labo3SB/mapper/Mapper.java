package be.techni.ilir.labo3SB.mapper;

import be.techni.ilir.labo3SB.model.dto.*;
import be.techni.ilir.labo3SB.model.entities.*;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
public class Mapper {

    //--------------------   Utilisateur   ---------------------------

    public UtilisateurDTO toUtilisateurDTO(Utilisateur utilisateur){
        return UtilisateurDTO.builder()
                .id(utilisateur.getId())
                .nom(utilisateur.getNom())
                .prenom(utilisateur.getPrenom())
                .pseudo(utilisateur.getPseudo())
                .mdp(utilisateur.getMdp())
                .adresse(utilisateur.getAdresse())
                .niveauAcces(utilisateur.getNiveauAcces())
                .commandeList(utilisateur.getCommandeList()
                        .stream()
                        .map(this::toCommandeDTO)
                        .collect(Collectors.toList()))
                .build();
    }

    public Utilisateur toUtilisateurEntity(UtilisateurDTO utilisateurDTO){
        return Utilisateur.builder().id(utilisateurDTO.getId())
                .nom(utilisateurDTO.getNom())
                .prenom(utilisateurDTO.getPrenom())
                .adresse(utilisateurDTO.getAdresse())
                .niveauAcces(utilisateurDTO.getNiveauAcces())
                .pseudo(utilisateurDTO.getPseudo())
                .mdp(utilisateurDTO.getMdp())
                .commandeList(utilisateurDTO.getCommandeList()
                        .stream()
                        .map(this::toCommandeEntity)
                        .collect(Collectors.toList()))
                .build();
    }

    //--------------------   Commande   ---------------------------

    public CommandeDTO toCommandeDTO(Commande commande) {
        return CommandeDTO.builder()
                .id(commande.getId())
                .creationDate(commande.getCreationDate())
                .utilisateur(toUtilisateurDTO(commande.getUtilisateur()))
                .moyenPaiement(commande.getMoyenPaiement())
                .estPaye(commande.isEstPaye())
                .produitList(commande.getProduitList()
                        .stream()
                        .map(this::toProduitDTO)
                        .collect(Collectors.toList()))
                .build();
    }
    public Commande toCommandeEntity(CommandeDTO commandeDTO){
        return Commande.builder()
                .id(commandeDTO.getId())
                .creationDate(commandeDTO.getCreationDate())
                .utilisateur(toUtilisateurEntity(commandeDTO.getUtilisateur()))
                .moyenPaiement(commandeDTO.getMoyenPaiement())
                .estPaye(commandeDTO.isEstPaye())
                .produitList(commandeDTO.getProduitList()
                        .stream()
                        .map(this::toProduitEntity)
                        .collect(Collectors.toList()))
                .build();
    }

    //--------------------   Fournisseur    ---------------------------

    public Fournisseur toFournisseurEntiy(FournisseurDTO fournisseurDTO){
        return Fournisseur.builder()
                .id(fournisseurDTO.getId())
                .nomEntreprise(fournisseurDTO.getNomEntreprise())
                .secteur(fournisseurDTO.getSecteur())
                .statutSocial(fournisseurDTO.getStatutSocial())
                .insertionDate(fournisseurDTO.getInsertionDate())
                .updateDate(fournisseurDTO.getUpdateDate())
                //.produitList(fournisseurDTO.getProduitList()
                        //.stream()
                        //.map(this::toProduitEntity)
                        //.collect(Collectors.toList()))
                .build();
    }

    public FournisseurDTO toFournisseurDTO(Fournisseur fournisseur){
        return toFournisseurDTO(fournisseur,false);
    }

    public FournisseurDTO toFournisseurDTO(Fournisseur fournisseur,boolean withProduit){
        return FournisseurDTO.builder()
                .id(fournisseur.getId())
                .nomEntreprise(fournisseur.getNomEntreprise())
                .secteur(fournisseur.getSecteur())
                .statutSocial(fournisseur.getStatutSocial())
                .insertionDate(fournisseur.getInsertionDate())
                .updateDate(fournisseur.getUpdateDate())
                .produitList(withProduit ? fournisseur.getProduitList()
                        .stream()
                        .map(this::toProduitDTO)
                        .collect(Collectors.toList())
                        : null)
                .build();
    }

    //--------------------   Produit   ---------------------------

    public Produit toProduitEntity(ProduitDTO produitDTO){
        return toProduitEntity(produitDTO,false);
    }

    public Produit toProduitEntity(ProduitDTO produitDTO,boolean avecFournisseur){
        return Produit.builder()
                .id(produitDTO.getId())
                .nom(produitDTO.getNom())
                .description(produitDTO.getDescription())
                .prix(produitDTO.getPrix())
                .quantite(produitDTO.getQuantite())
                .tva(produitDTO.getTva())
                .creationDate(produitDTO.getCreationDate())
                .updateDate(produitDTO.getUpdateDate())
                .datePeremption(produitDTO.getDatePeremption())
                .fournisseur(avecFournisseur ? toFournisseurEntiy(produitDTO.getFournisseur()) : null)
                .categorieList(produitDTO.getCategorieList()
                        .stream()
                        .map(this::toCategorieEntity)
                        .collect(Collectors.toList()))
                .build();
    }

    public ProduitDTO toProduitDTO(Produit produit){
        return toProduitDTO(produit,false);
    }

    public ProduitDTO toProduitDTO(Produit produit,boolean avecFournisseur){
        return ProduitDTO.builder()
                .id(produit.getId())
                .nom(produit.getNom())
                .description(produit.getDescription())
                .prix(produit.getPrix())
                .quantite(produit.getQuantite())
                .tva(produit.getTva())
                .creationDate(produit.getCreationDate())
                .updateDate(produit.getUpdateDate())
                .datePeremption(produit.getDatePeremption())
                .fournisseur(avecFournisseur ? toFournisseurDTO(produit.getFournisseur()) : null)
                .categorieList(produit.getCategorieList()
                        .stream()
                        .map(this::toCategorieDTO)
                        .collect(Collectors.toList()))
                .build();
    }

    //--------------------   Categorie   ---------------------------

    public Categorie toCategorieEntity(CategorieDTO categorieDTO){
        return Categorie.builder()
                .id(categorieDTO.getId())
                .nom(categorieDTO.getNom())
                .produitList(categorieDTO.getProduitList()
                        .stream()
                        .map(this::toProduitEntity)
                        .collect(Collectors.toList()))
                .build();
    }

    public CategorieDTO toCategorieDTO(Categorie categorie){
        return CategorieDTO.builder()
                .id(categorie.getId())
                .nom(categorie.getNom())
                .produitList(categorie.getProduitList()
                        .stream()
                        .map(this::toProduitDTO)
                        .collect(Collectors.toList()))
                .build();
    }
}
