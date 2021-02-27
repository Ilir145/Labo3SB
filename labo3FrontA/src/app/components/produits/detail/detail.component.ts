import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Produit } from 'src/app/modeles/produit/produit.module';
import { ProduitService } from 'src/app/services/produit.service';

@Component({
  selector: 'app-detail',
  templateUrl: './detail.component.html',
  styleUrls: ['./detail.component.css']
})
export class DetailComponent implements OnInit {

  produit : Produit

  constructor(
    private service_Produit : ProduitService,
    private _ar : ActivatedRoute
    ) { }

  ngOnInit(): void {
    let id = this._ar.snapshot.params['id']
    this.service_Produit.getOneProduits(id).subscribe(p => {
      this.produit = p
    })
  }


}
