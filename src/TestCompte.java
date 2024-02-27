public class TestCompte {
    public static void main (String[]args){
        Banque B1 = new Banque("STB");
        compte C1 = new compte("salah" , 1005.450 );
        compte C2 = new compte("fatma" , 5000.555 );
        compte C3 = new compte("ali" , 8254.450 );
        B1.addCompte(C1);
        B1.addCompte(C2);
        B1.addCompte(C3);
        C1.crediter(2000);
        System.out.println("Banque :"+B1.nom+B1.ListClient);

        try{
            System.out.println("le solde est "+C2.debiter(4000));

        }
        catch (SoldeNonDisponibleException e){
            System.out.println(e);


        }



    }
}
