package Model;

import java.time.LocalDateTime;
import java.util.Locale;

public class CompteCourant extends Compte{
    private double decouvertAutrise;

    public CompteCourant(double solde, LocalDateTime dateCreation, int id_client, double decouvertAutrise) {
        super(solde,dateCreation,id_client);
        this.decouvertAutrise=decouvertAutrise;
    }
}
