package exercice3;

import java.util.Scanner ;

public class Main {
    public static void main (string []args ){
        Scanner sc = new Scanner(System.in) ;
        System.out.println("entrer tes deux vars:");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.println("1 - addition .");
        System.out.println("2 - soustraction .");
        System.out.println("3 - multiplication .");
        System.out.println("4 - division .");
        System.out.println("5 - modulo .");
        System.out.println("6 - puissance .");
        int choix = sc.nextInt();
        if (choix > 6 || choix < 1 ){
            System.out.println("hors range operation");
        else {
            //si tout estca se passe bien on trait les instruction that have a relation whith calculatrice class file
            calculatrice calc = new calculatrice () ; 
            switch(choix){

                case 1 -> System.out.println(calc.addition(a, b));
                case 2 -> System.out.println(calc.soustraction(a, b));
                case 3 -> System.out.println(calc.multiplication(a, b));
                case 4 -> System.out.println(calc.division(a, b));
                case 5 -> System.out.println(calc.modulo(a, b));
                case 6 -> System.out.println(calc.puissance(a, b));
                default -> System.out.println ("choix introvable !");
            }
        }

        Scanner.close() ;
    
    }
}
