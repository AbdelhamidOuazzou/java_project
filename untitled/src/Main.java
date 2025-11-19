import Model.Client;
import Model.Compte;
import Model.CompteCourant;
import Model.CompteEpargne;

import java.text.Collator;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Compte> comptes=new ArrayList<>();

        Client cl=new Client("OUZZOU", "abdelhamid","W133200","gonzales123","settat","0606060606","abdo123@gmail.com","hay salam",comptes);
        Compte cp= new Compte(200, LocalDateTime.of(2004, 10, 10, 0, 0, 0),cl.getIdClient());
        Compte cp2 = new CompteEpargne(cp.getSolde(),cp.getDateCreation(),cp.getid_client(),10);
        CompteEpargne cp3 = (CompteEpargne) cp2;
        comptes.add(cp);
        comptes.add(cp2);
        LocalDateTime tenYearsAcc = LocalDateTime.now().minusYears(10);
        List<Compte> ancienComptes = comptes.stream()
        .filter(c->c.getDateCreation().isBefore(tenYearsAcc))
        .collect(Collectors.toList());
    
     for(Compte c : comptes){
            System.out.println( c);
        }
        }
    }
