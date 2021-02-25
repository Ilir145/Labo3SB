import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { Produit } from './modeles/produit/produit.module';
import { ProduitsComponent } from './components/produits/produits.component';
import { DetailComponent } from './components/produits/detail/detail.component';

const routes: Routes = [
  { path : 'produits', component : ProduitsComponent},
  { path : 'produits/detail', component : DetailComponent},


  { path : '**', redirectTo : '/produits'}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
