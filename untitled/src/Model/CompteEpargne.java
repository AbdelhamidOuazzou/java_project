package Model;

import java.time.LocalDateTime;

public class CompteEpargne extends Compte{

        private double tauxInteret;
    public CompteEpargne(double solde, LocalDateTime dateCreation, int id_client, double tauxInteret) {
        super(solde,dateCreation,id_client);
        this.tauxInteret=tauxInteret;
    }

}
