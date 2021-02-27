package be.techni.ilir.labo3SB.config;

import be.techni.ilir.labo3SB.model.entities.*;
import be.techni.ilir.labo3SB.model.entities.enums.MoyenPaiement;
import be.techni.ilir.labo3SB.model.entities.enums.Secteur;
import be.techni.ilir.labo3SB.model.entities.enums.StatutSocial;
import be.techni.ilir.labo3SB.model.services.*;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class DataInit implements InitializingBean {

    private final ProduitService produitService;

    private final FournisseurService fournisseurService;

    private final CommandeService commandeService;

    private final UtilisateurService utilisateurService;

    private final CategorieService categorieService;


    private List<Fournisseur> fournisseurs = Arrays.asList(
            Fournisseur.builder()
                    .nomEntreprise("Kinder")
                    .secteur(Secteur.ALIMENTAIRE)
                    .statutSocial(StatutSocial.EURL)
                    .build(),
            Fournisseur.builder()
                    .nomEntreprise("Popeye")
                    .secteur(Secteur.SPORT)
                    .statutSocial(StatutSocial.EURL)
                    .build(),
            Fournisseur.builder()
                    .nomEntreprise("Secure")
                    .secteur(Secteur.SECURITE)
                    .statutSocial(StatutSocial.EURL)
                    .build()

    );

    private List<Categorie> categories = Arrays.asList(
            Categorie.builder()
                    .nom("Alimentaire")
                    .build(),
            Categorie.builder()
                    .nom("Confiserie")
                    .build(),
            Categorie.builder()
                    .nom("Sport")
                    .build(),
            Categorie.builder()
                    .nom("Boisson")
                    .build(),
            Categorie.builder()
                    .nom("Nettoyage")
                    .build(),
            Categorie.builder()
                    .nom("Ménager")
                    .build()
    );

    private List<Produit> produits = Arrays.asList(
            Produit.builder()
                    .nom("Kinder Bueno")
                    .quantite(300)
                    .description("Délicieux")
                    .prix(2D)
                    .tva(0.12)
                    .fournisseur(fournisseurs.get(0))
                    .categorieList(categories.subList(0,1))
                    .build(),
            Produit.builder()
                    .nom("Kinder Maxi")
                    .quantite(230)
                    .description("Tres bon")
                    .prix(1.50)
                    .tva(0.12)
                    .fournisseur(fournisseurs.get(0))
                    .categorieList(categories.subList(0,1))
                    .build(),
            Produit.builder()
                    .nom("Kinder Delice")
                    .quantite(400)
                    .description("Very good")
                    .prix(2.75)
                    .tva(0.12)
                    .fournisseur(fournisseurs.get(0))
                    .categorieList(categories.subList(0,1))
                    .build(),
            Produit.builder()
                    .nom("Kinder Surprise")
                    .quantite(400)
                    .description("Avec jouet")
                    .prix(1.99)
                    .tva(0.12)
                    .fournisseur(fournisseurs.get(0))
                    .categorieList(categories.subList(0,1))
                    .build(),
            Produit.builder()
                    .nom("Mercurial Vapor")
                    .quantite(120)
                    .description("Chaussure de foot tres legere")
                    .prix(119.99)
                    .tva(0.15)
                    .fournisseur(fournisseurs.get(1))
                    .categorieList(categories.subList(2,2))
                    .build(),
            Produit.builder()
                    .nom("AlarmS2.0")
                    .quantite(400)
                    .description("Alarm avec fonction d appel")
                    .prix(2000D)
                    .tva(0.18)
                    .fournisseur(fournisseurs.get(2))
                    .categorieList(categories.subList(5,5))
                    .build(),
            Produit.builder()
                    .nom("Coca zer canette")
                    .quantite(400)
                    .description("Canette de coca cola de 33cl")
                    .prix(0.99)
                    .tva(0.12)
                    .fournisseur(fournisseurs.get(0))
                    .categorieList(categories.subList(3,3))
                    .build()

    );

    private List<Utilisateur> utilisateurs = Arrays.asList(
            Utilisateur.builder()
                    .nom("Menez")
                    .prenom("Pierre")
                    .pseudo("Menes")
                    .mdp("10JONGLE")
                    .build(),
            Utilisateur.builder()
                    .nom("Ibra")
                    .prenom("Zlatan")
                    .pseudo("IZ9")
                    .mdp("zlatan")
                    .build(),
            Utilisateur.builder()
                    .nom("Messi")
                    .prenom("Leo")
                    .pseudo("ML10")
                    .mdp("fcbliga")
                    .build(),
            Utilisateur.builder()
                    .nom("Zoro")
                    .prenom("Roronoa")
                    .pseudo("ashura")
                    .mdp("nyitoryu")
                    .build()
    );

    private List<Commande> commandes = Arrays.asList(
            Commande.builder()
                    .estPaye(true)
                    .moyenPaiement(MoyenPaiement.BANCONTACT)
                    .build()
    );



    public DataInit(ProduitService produitService, FournisseurService fournisseurService, CommandeService commandeService, UtilisateurService utilisateurService, CategorieService categorieService) {
        this.produitService = produitService;
        this.fournisseurService = fournisseurService;
        this.commandeService = commandeService;
        this.utilisateurService = utilisateurService;
        this.categorieService = categorieService;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        this.fournisseurs.forEach(fournisseurService::insert);
        this.categories.forEach(categorieService::insert);
        this.utilisateurs.forEach(utilisateurService::insert);
        this.commandes.forEach(commandeService::insert);
        this.produits.forEach(produitService::insert);

    }
}
