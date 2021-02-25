package be.techni.ilir.labo3SB.model.entities.enums;

public enum StatutSocial {
    EIRL(1),SARL(2),EURL(3),SAS(4),SASU(5),SA(6),SNC(7);
    int nStatutSocial;

    StatutSocial(int nStatutSocial) {
        this.nStatutSocial = nStatutSocial;
    }
}
