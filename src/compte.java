public class compte {
    String titulaire;
    double solde;

    public compte(String titulaire, double solde) {
        this.titulaire = titulaire;
        this.solde = solde;
    }

    public String getTitulaire() {
        return titulaire;
    }

    public void setTitulaire(String titulaire) {
        this.titulaire = titulaire;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    @Override
    public String toString() {
        return "compte{" +
                "titulaire='" + titulaire + '\'' +
                ", solde=" + solde +
                '}';
    }
    public double debiter( double mntDeb) throws SoldeNonDisponibleException{
        if(mntDeb<  this.solde){
            return  this.solde-mntDeb ;
        }
        else {
            throw new SoldeNonDisponibleException();
    }

}
public void crediter(double MntCre){
        this.solde=solde +MntCre ;
}
}