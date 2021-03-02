import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { Categorie } from 'src/app/modeles/categorie/categorie.module';
import { Produit } from 'src/app/modeles/produit/produit.module';
import { CategorieService } from 'src/app/services/categorie.service';
import { ProduitService } from 'src/app/services/produit.service';

@Component({
  selector: 'app-categorie',
  templateUrl: './categorie.component.html',
  styleUrls: ['./categorie.component.css']
})
export class CategorieComponent implements OnInit {

  categories : Array<Categorie>



  constructor(
    private service_Categorie : CategorieService
  ) { }

  ngOnInit(): void {
      this.service_Categorie.getAllCategorie().subscribe(c => this.categories = c)
  }



}
