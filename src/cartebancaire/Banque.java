package cartebancaire;

public class Banque {

    protected Verificateur verifie;
    
    public Banque(Verificateur verifie) {
        // TODO Auto-generated constructor stub
        this.verifie = verifie;
    }
    
    public void verification() {
        verifie.VerifieCarte();
    }
    

}
