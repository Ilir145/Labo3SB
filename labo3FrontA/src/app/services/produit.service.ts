import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Router } from '@angular/router';
import { Observable, Subject, Subscription } from 'rxjs';
import { Categorie } from '../modeles/categorie/categorie.module';
import { Produit } from '../modeles/produit/produit.module';

@Injectable({
  providedIn: 'root'
})
export class ProduitService {


   private url : string = "http://localhost:8080/api";


  constructor(
    private _client : HttpClient
  ) { }
 

  getAllProduits() : Observable<Array<Produit>> {
    return this._client.get<Array<Produit>>(this.url+"/produits")
  }

  getOneProduits(id : number) : Observable<Produit>{
    return this._client.get<Produit>(this.url+"/produits/"+id)
  }

}
