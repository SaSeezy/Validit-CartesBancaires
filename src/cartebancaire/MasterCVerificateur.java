package cartebancaire;


public class MasterCVerificateur extends Verificateur {

    public MasterCVerificateur(String numerocompte) {
        // TODO Auto-generated constructor stub
        super(numerocompte);
    }

    
    @Override
    void VerifieCarte() {
        // TODO Auto-generated method stub
        
        int test = this.sumAddPlaces() + this.sumEvenPlaces();
        if(test % 10 == 0) {
            System.out.println("Numéro compte (MasterCard) : "+numerocompte+" -------> Valide");
        }else {
            System.out.println("Numéro compte (MasterCard) : "+numerocompte+" -------> Invalide");
        }
        
    }
    
    int sumAddPlaces() {
        // TODO Auto-generated method stub
        int sum = 0;
        int[] numeroInt = convertToInt(numerocompte);
        
        int premierChiffre = numeroInt[0];
        int deuxiemeChiffre = numeroInt[1];
        
        if(numerocompte.length()==16) { 
            if(premierChiffre == 5 && (deuxiemeChiffre >= 1 || deuxiemeChiffre <= 5 )) {
                        for(int i = numeroInt.length - 1; i > 0; i-=2) { 
                            sum +=  numeroInt[i] ;
                        }
            }
        }
        return sum;
    }

    @Override
    int sumEvenPlaces() {
        // TODO Auto-generated method stub
        int sum = 0;
        int[] numeroInt = convertToInt(numerocompte);
        
        int premierChiffre = numeroInt[0];
        int deuxiemeChiffre = numeroInt[1];
        
        if(numerocompte.length()==16) { 
            if(premierChiffre == 5 && (deuxiemeChiffre >= 1 || deuxiemeChiffre <= 5 )) {
                        for(int i = numeroInt.length - 2; i >= 0; i-=2) {
                            numeroInt[i] = 2 * numeroInt[i];
                            if(numeroInt[i] > 9) {
                                sum += addNombreAdeuxChiffres(numeroInt[i]);
                            }else{
                                sum +=  numeroInt[i] ;
                            }
                        }
            }
        }
        return sum;
    }
    
    
}
