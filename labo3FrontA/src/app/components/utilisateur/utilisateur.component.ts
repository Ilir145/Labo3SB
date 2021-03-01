import { Component, OnInit } from '@angular/core';
import { Utilisateur } from 'src/app/modeles/utilisateur/utilisateur.module';
import { UtilisateurService } from 'src/app/services/utilisateur.service';

@Component({
  selector: 'app-utilisateur',
  templateUrl: './utilisateur.component.html',
  styleUrls: ['./utilisateur.component.css']
})
export class UtilisateurComponent implements OnInit {

utilisateurs : Array<Utilisateur>

  constructor(
    private service_Utilisateur: UtilisateurService
  ) { }

  ngOnInit(): void {
    this.service_Utilisateur.getAllUtilisateurs().subscribe(u => {
      this.utilisateurs = u
    })
  }

}
