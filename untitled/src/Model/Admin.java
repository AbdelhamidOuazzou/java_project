package Model;

public class Admin {
    public static int cpt=0;
    private int idAdmin;
    private String nom;
    private String prenom;
    private String Email;
    private String password;
    public Admin(String nom, String prenom, String Email, String password) {
        idAdmin=++cpt;
        this.nom=nom;
        this.prenom=prenom;
        this.Email=Email;
        this.password=password;
    }
}
