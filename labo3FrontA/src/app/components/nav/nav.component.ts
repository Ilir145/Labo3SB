import { Component, OnInit } from '@angular/core';
import { NbMenuItem } from '@nebular/theme';

@Component({
  selector: 'app-nav',
  templateUrl: './nav.component.html',
  styleUrls: ['./nav.component.css']
})
export class NavComponent implements OnInit {

  public items : NbMenuItem[]

  constructor() { }

  ngOnInit(): void {
    this.items = [
      { link : '/accueil', title : 'accueil', icon : 'home' },
      { link : '/produits', title : 'Produits', icon : 'book' },
      { link : '/utilisateurs', title : 'Utilisateur', icon : 'people-outline'}
      
    ]
  }

}
