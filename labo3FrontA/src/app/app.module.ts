import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { NbThemeModule, NbLayoutModule, NbMenuComponent, NbMenuModule, NbSidebarComponent, NbSidebarModule, NbIconModule, NbListModule, NbCardModule, NbDialogModule } from '@nebular/theme';
import { NbEvaIconsModule } from '@nebular/eva-icons';
import { ReactiveFormsModule } from '@angular/forms';

import { HttpClientModule, HTTP_INTERCEPTORS } from '@angular/common/http';
import { ProduitsComponent } from './components/produits/produits.component';
import { DetailComponent } from './components/produits/detail/detail.component';
import { UtilisateurComponent } from './components/utilisateur/utilisateur.component';
import { DetailUtilisateurComponent } from './components/utilisateur/detail-utilisateur/detail-utilisateur.component';
import { AccueilComponent } from './components/accueil/accueil.component';
import { NavComponent } from './components/nav/nav.component';
import { CategorieComponent } from './components/categorie/categorie.component';
import { AjoutProduitComponent } from './components/produits/ajout-produit/ajout-produit.component';

@NgModule({
  declarations: [
    AppComponent,
    ProduitsComponent,
    DetailComponent,
    UtilisateurComponent,
    DetailUtilisateurComponent,
    AccueilComponent,
    NavComponent,
    CategorieComponent,
    AjoutProduitComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    NbThemeModule.forRoot({ name: 'dark' }),
    NbLayoutModule,
    NbEvaIconsModule,
    NbMenuModule.forRoot(),
    NbSidebarModule.forRoot(),
    NbIconModule,
    NbListModule,
    NbCardModule,
    ReactiveFormsModule,
    NbDialogModule.forRoot(),
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
