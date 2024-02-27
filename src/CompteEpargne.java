public class CompteEpargne extends compte{
    float tauxBenificie = 6;

    public CompteEpargne(String titulaire, double solde) {
        super(titulaire, solde);

    }
    public void CalculInterets(){
        solde = solde *(1+tauxBenificie/100);
    }

    @Override
    public String toString() {
        return "CompteEpargne{" +
                "tauxBenificie=" + tauxBenificie +
                '}';
    }
}
