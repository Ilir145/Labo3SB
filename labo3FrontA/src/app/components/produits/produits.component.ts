import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Produit } from 'src/app/modeles/produit/produit.module';
import { ProduitService } from 'src/app/services/produit.service';

@Component({
  selector: 'app-produits',
  templateUrl: './produits.component.html',
  styleUrls: ['./produits.component.css']
})
export class ProduitsComponent implements OnInit {

  produits : Array<Produit>


  constructor(
    private service_Produit : ProduitService,
    private _router : Router
  ) { }

  ngOnInit(): void {
    this.service_Produit.getAllProduits().subscribe(p => {
       this.produits = p
     })
    
  }
  
  deleteProduit(id : number){
    this.service_Produit.deleteProduit(id)
  }


}
