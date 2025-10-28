import Model.Client;
import Model.Compte;
import Model.CompteCourant;
import Model.CompteEpargne;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Compte> comptes=new ArrayList<>();

        Client cl=new Client("OUZZOU", "abdelhamid","W133200","gonzales123","settat","0606060606","abdo123@gmail.com","hay salam",comptes);
        Compte cp= new Compte(200, LocalDateTime.now(),cl.getIdClient());
        Compte cp2 = new CompteEpargne();
        CompteEpargne cp3 = (CompteEpargne) cp2;
        comptes.add(cp);
        comptes.add(cp2);
        }
    }
