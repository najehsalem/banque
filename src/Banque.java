import java.util.ArrayList;

public class Banque {
String nom;
ArrayList<compte> ListClient ;

    public Banque(String nom ) {
        this.nom = nom;
        ListClient = new ArrayList<compte>();
    }


    @Override
    public String toString() {
        return "Banque{" +
                "nom='" + nom + '\'' +
                ", ListClient=" + ListClient +
                '}';
    }
    
    public void addCompte (compte c){
        this.ListClient.add (c);
    }
}

