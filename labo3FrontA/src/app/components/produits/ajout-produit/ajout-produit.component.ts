import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { Builder } from 'protractor';
import { NewProduitInfo } from 'src/app/modeles/new-produit-info/new-produit-info.module';
import { ProduitService } from 'src/app/services/produit.service';

@Component({
  selector: 'app-ajout-produit',
  templateUrl: './ajout-produit.component.html',
  styleUrls: ['./ajout-produit.component.css']
})
export class AjoutProduitComponent implements OnInit {


  fg : FormGroup

  constructor(
    private _builder : FormBuilder,
    private produit_service: ProduitService
  ) { }

  ngOnInit(): void {
    this.initForm();
  }

  initForm() {
    this.fg = this._builder.group({
      nom :	[''],
      description : [''],
      prix : [''],
      quantite : [''],
      tva : ['']
    })
  }

  onSubmit() {
    let values = this.fg.value
    let newProduit = new NewProduitInfo()
    newProduit.nom = values['nom']
    newProduit.description = values['description']
    newProduit.prix = values['prix']
    newProduit.quantite = values['quantite']
    newProduit.tva = values['tva']

    this.produit_service.insertProduits(newProduit)
  }

}
