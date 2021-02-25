### Labo n°3 Gestion de stock
Notre application doit être capable de gérer une collection de produits.
Le produit est caractérisé par
- un identifiant unique
- un nom
- une description (facultative)
- une ou plusieurs catégorie
- une date d'entrée du produit
- une date de mise à jour du produit
- une date de péremption (en fonction du type de produit)
- un prix d'achat
- une quantité
- un fournisseur

Un fournisseur est caractérisé par
- un id
- un nom d'entreprise
- statut social de l'entreprise
- secteur d'activité
- dates d'insertion / mise à jour
- Listes des produits qu'ils proposent

Chaque utilisateur est caratérisé par
- un id
- un nom / société
- un prénom
- un niveau d'accès
  - Client
  - Gérant / Employé
  - Administrateur
- un pseudo
- un mot de passe
- une adresse
- une liste de commandes (s'il est client)

Chaque commande est caractérisée par
- un id
- une reference
- une date de création
- une liste de produits
- un prix total calculé par rapport à la liste de produits
- tva
- est payée
- moyen de paiement
- l'utilisateur qui à passer la commande
