package cartebancaire;

abstract class Verificateur {

    protected String numerocompte;
    
    public Verificateur(String numerocompte) {
        // TODO Auto-generated constructor stub
        this.numerocompte = numerocompte;
    }
   
    /**
     * m�thode permettant de convertir le num�ro de compte bancaire
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
     * La m�thode addNombreAdeuxChiffres() permet d'additionner les chiffres
     * d'un nombre � deux chiffres.
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
     * La m�thode permettant de v�rifier la validit� de la carte bancaire
     */
    abstract void VerifieCarte();
    
    /**
     * La m�thode sumAddPlaces() accumule les chiffres allant 
     * de la taille max du num�ro du compte � 1 par pas de 2.
     * @return
     */
    abstract int sumAddPlaces();
    
    /**
     * La m�thode sumEvenPlaces() accumule les chiffres allant 
     * de la taille max moins un (taillMax - 1) du num�ro du 
     * compte � 0 en faisant � chaque indice 2*chiffre[i].
     * Si 2*chiffre[i] > 0, on fait appel � la m�thode 
     * addNombreAdeuxChiffres() pour additionner les deux chiffres. 
     * @return
     */
    abstract int sumEvenPlaces();

}
