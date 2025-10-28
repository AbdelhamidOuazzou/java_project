package Model;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static int cpt=0;
    private int idClient;
    private String nom;
    private String prenom;
    private String cin;
    private String password;
    private String adresse;
    private String telephone;
    private String email;
    private String adresseAgence;
    private List<Compte> comptes=new ArrayList<>();
    public Client(String nom ,String prenom ,String cin ,String password,String adresse,String telephone,String email,String adresseAgence,List<Compte> comptes) {
        idClient = ++cpt;
        this.nom = nom;
        this.prenom = prenom;
        this.cin=cin;
        this.password=password;
        this.adresse=adresse;
        this.telephone=telephone;
        this.email=email;
        this.adresseAgence=adresseAgence;
        comptes.addAll(comptes);
    }

    public int getIdClient() {
        return idClient;
    }
}
