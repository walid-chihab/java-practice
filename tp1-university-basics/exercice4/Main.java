package exercice4;

public class Main {
    public static void main( String [] args) {
        CompteBancair  compte1 = new CompteBancair ("maissae", 1000.0);
        CompteBancair  compte2 = new CompteBancair("anas " , 1500.0);


        System.out.println("le solde de compte1 est :" + compte1.getSolde());
        System.out.println("le solde de compte2 est : " + compte2.getSolde());
        System.out.println("-------------------------------------------------------------");

        compte1.deposer(500.0);
        compte2.retirer(500);
        System.out.println("apres depot de 500.0 , le solde de compt1 sera : "+ compte1.getSolde());
        System.out.println("apres retrait de 500 dh "+ compte2.getSolde());
        

        
    }
    
    
}
