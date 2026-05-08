package exercice2;

public class Main {
    public static void main (String []args){
        comptBancaire compt1 = new comptBancaire("redwan " ,2000);
        comptBancaire compt2 = new comptBancaire("yassine " ,3000);

        compt1.afficherDetails();
        compt2.afficherDetails();
        
        compt1.deposer(3000);
        compt2.deposer(2000);
        
        compt1.afficherDetails();
        compt2.afficherDetails();

    System.out.println("--------------------------------------------------");
        compt1.retirer(1000);
        compt2.retirer(1000);

        compt1.afficherDetails();
        compt2.afficherDetails();


    }   
}
