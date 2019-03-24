package cartebancaire;

abstract class Verificateur {

    protected String numerocompte;
    
    public Verificateur(String numerocompte) {
        // TODO Auto-generated constructor stub
        this.numerocompte = numerocompte;
    }
   
    /**
     * méthode permettant de convertir le numéro de compte bancaire
     * en tableau d'entier.
     * @param numerocompte
     * @return
     */
    public int[] convertToInt(String numerocompte) {
        String[] numeroArray = numerocompte.split(""); 
        int[] numeroInt = new int[numerocompte.length()];
        for (int i = 0; i < numerocompte.length(); i++){
            numeroInt[i] = Integer.parseInt(numeroArray[i]); 
        //Parses the integer for each string.
       }
        
        return numeroInt;
    }
    
    /**
     * La méthode addNombreAdeuxChiffres() permet d'additionner les chiffres
     * d'un nombre à deux chiffres.
     * @param nombreAdeuxChiffres
     * @return
     */
    public int addNombreAdeuxChiffres(int nombreAdeuxChiffres) {
        
        int somme = 0;
        String chaine = Integer.toString(nombreAdeuxChiffres);
        String[] numeroArray = chaine.split(""); 
        for (int i = 0; i < numeroArray.length; i++){
            somme += Integer.parseInt(numeroArray[i]); 
        //Parses the integer for each string.
       }
        return somme;
    }

    /**
     * La méthode permettant de vérifier la validité de la carte bancaire
     */
    abstract void VerifieCarte();
    
    /**
     * La méthode sumAddPlaces() accumule les chiffres allant 
     * de la taille max du numéro du compte à 1 par pas de 2.
     * @return
     */
    abstract int sumAddPlaces();
    
    /**
     * La méthode sumEvenPlaces() accumule les chiffres allant 
     * de la taille max moins un (taillMax - 1) du numéro du 
     * compte à 0 en faisant à chaque indice 2*chiffre[i].
     * Si 2*chiffre[i] > 0, on fait appel à la méthode 
     * addNombreAdeuxChiffres() pour additionner les deux chiffres. 
     * @return
     */
    abstract int sumEvenPlaces();

}
