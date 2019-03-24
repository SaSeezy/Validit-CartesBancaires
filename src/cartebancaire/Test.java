package cartebancaire;

public class Test {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        Banque ban1 = new Banque(new MasterCVerificateur("5326351192003591"));
        Banque ban2 = new Banque(new VisaVerificateur("4847352989263094"));
        Banque ban3 = new Banque(new AmerExpVerificateur("375987654321001"));
        
       ban1.verification();
       ban2.verification();
       ban3.verification();

    }

}
