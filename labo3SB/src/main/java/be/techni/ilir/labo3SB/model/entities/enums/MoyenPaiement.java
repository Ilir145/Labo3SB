package be.techni.ilir.labo3SB.model.entities.enums;


public enum MoyenPaiement {
    PAYPAL(1),BANCONTACT(2),CARTECREDIT(3),VISA(4);

    int nPaiement;

    MoyenPaiement(int nPaiement) {
        this.nPaiement = nPaiement;
    }
}
