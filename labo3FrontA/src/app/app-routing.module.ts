import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { Produit } from './modeles/produit/produit.module';
import { ProduitsComponent } from './components/produits/produits.component';
import { DetailComponent } from './components/produits/detail/detail.component';
import { UtilisateurComponent } from './components/utilisateur/utilisateur.component';
import { DetailUtilisateurComponent } from './components/utilisateur/detail-utilisateur/detail-utilisateur.component';
import { AccueilComponent } from './components/accueil/accueil.component';
import { AjoutProduitComponent } from './components/produits/ajout-produit/ajout-produit.component';

const routes: Routes = [
  { path : 'produits', component : ProduitsComponent},
  { path : 'detail', component : DetailComponent},
  {path : 'detail/:id', component : DetailComponent},
  {path : 'utilisateurs', component : UtilisateurComponent},
  { path :'detailUtilisateur', component : DetailUtilisateurComponent},
  {path : 'accueil', component : AccueilComponent},
  {path : 'ajout-produit', component : AjoutProduitComponent},

  { path : '**', redirectTo : '/accueil'}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
