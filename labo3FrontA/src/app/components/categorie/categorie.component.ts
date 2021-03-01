import { Component, OnInit } from '@angular/core';
import { Categorie } from 'src/app/modeles/categorie/categorie.module';

@Component({
  selector: 'app-categorie',
  templateUrl: './categorie.component.html',
  styleUrls: ['./categorie.component.css']
})
export class CategorieComponent implements OnInit {

  categories : Array<Categorie>

  constructor() { }

  ngOnInit(): void {
  }

}
