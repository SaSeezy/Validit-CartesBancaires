package cartebancaire;

public class AmerExpVerificateur extends Verificateur {

    public AmerExpVerificateur(String numerocompte) {
        // TODO Auto-generated constructor stub
        super(numerocompte);
    }

    @Override
    void VerifieCarte() {
        // TODO Auto-generated method stub
        
        int test = this.sumAddPlaces() + this.sumEvenPlaces();
        if(test % 10 == 0) {
            System.out.println("Numéro compte (American Express) : "+numerocompte+" ----> Valide");
        }else {
            System.out.println("Numéro compte (American Express) : "+numerocompte+" ----> Invalide");
        }
    }

    @Override
    int sumAddPlaces() {
        // TODO Auto-generated method stub
        int sum = 0;
        int[] numeroInt = convertToInt(numerocompte);
        
        int premierChiffre = numeroInt[0];
        int deuxiemeChiffre = numeroInt[1];
        
        if(numerocompte.length() == 15) { 
            if(premierChiffre == 3 && (deuxiemeChiffre == 4 || deuxiemeChiffre == 7 )) {
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
        
        if(numerocompte.length() == 15) { 
            if(premierChiffre == 3 && (deuxiemeChiffre == 4 || deuxiemeChiffre == 7 )) {
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
