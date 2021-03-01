import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Router } from '@angular/router';
import { Observable } from 'rxjs';
import { Utilisateur } from '../modeles/utilisateur/utilisateur.module';

@Injectable({
  providedIn: 'root'
})
export class UtilisateurService {

  private url : string = "http://localhost:8080/api";


  constructor(
    private _client : HttpClient,
    private _router : Router
  ) { }
 

  getAllUtilisateurs() : Observable<Array<Utilisateur>> {
    return this._client.get<Array<Utilisateur>>(this.url+"/utilisateurs")
  }

  
}
