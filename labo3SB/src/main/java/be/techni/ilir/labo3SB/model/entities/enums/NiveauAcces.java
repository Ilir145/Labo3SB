package be.techni.ilir.labo3SB.model.entities.enums;

public enum NiveauAcces {
    CLIENT(1),GERANT(2),EMPLOYE(3),ADMINISTRATEUR(4);

    int nNiveauAcces;

    NiveauAcces(int nNiveauAcces){
        this.nNiveauAcces = nNiveauAcces;
    }
}
