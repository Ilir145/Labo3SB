import { Component, OnInit } from '@angular/core';
import { Produit } from 'src/app/modeles/produit/produit.module';
import { ProduitService } from 'src/app/services/produit.service';

@Component({
  selector: 'app-detail',
  templateUrl: './detail.component.html',
  styleUrls: ['./detail.component.css']
})
export class DetailComponent implements OnInit {

produits : Array<Produit>

  constructor(private service_Produit : ProduitService) { }

  ngOnInit(): void {
    this.service_Produit.getAllProduits
  }


}
