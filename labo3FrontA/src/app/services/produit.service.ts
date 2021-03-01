import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Router } from '@angular/router';
import { Observable, Subject, Subscription } from 'rxjs';
import { Categorie } from '../modeles/categorie/categorie.module';
import { NewProduitInfo } from '../modeles/new-produit-info/new-produit-info.module';
import { Produit } from '../modeles/produit/produit.module';

@Injectable({
  providedIn: 'root'
})
export class ProduitService {


   private url : string = "http://localhost:8080/api";


  constructor(
    private _client : HttpClient,
    private _router : Router
  ) { }
 

  getAllProduits() : Observable<Array<Produit>> {
    return this._client.get<Array<Produit>>(this.url+"/produits")
  }

  getOneProduits(id : number) : Observable<Produit>{
    return this._client.get<Produit>(this.url+"/produits/"+id)
  }

  insertProduits(produit : NewProduitInfo){
    this._client.post<NewProduitInfo>(this.url+"/produits",produit).subscribe(() => this._router.navigate(['']))

  }

}
