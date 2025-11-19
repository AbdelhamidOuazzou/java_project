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

public int getNumCompte() {
        return numCompte; 
    }
    public double getSolde() {
        return solde;
    }

    public LocalDateTime getDateCreation() {
        return dateCreation;
    }
 
    public int getid_client() {
        return id_client;
    }

    @Override
    public String toString(){
        return "id de client: "+id_client+"le solde est : "+solde+"date de creation est : " +dateCreation;
    }


}
