package Model;

import java.time.LocalDateTime;

public class Compte {
    public  static int cpt=0;
    private int numCompte;
    private double solde;
    private LocalDateTime dateCreation;
    private int  id_client;
    public Compte(double solde, LocalDateTime dateCreation, int id_client) {
        this.numCompte=++cpt;
        this.solde=solde;
        this.dateCreation=dateCreation;
        this.id_client = id_client;

    }

}
