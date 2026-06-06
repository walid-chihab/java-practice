package exercice2;

public class comptBancaire {
    private String titulaire ;
    private double sold ;

    public comptBancaire ( String titulaire ,double sold ){
        this.titulaire = titulaire ;
        this.sold = sold ;
    }

    public void deposer ( double mantant ){
       if (mantant > 0) {
           this.sold += mantant;
       }
       else {
            System.out.println("Le montant doit être positif.");
       }
    }
    public void retirer (double mantant){
       if (mantant > 0) {
           if (mantant <= this.sold) {
               this.sold -= mantant;
               System.out.println("Retrait de " + mantant + " dh effectué avec succès.");
            }
            else {
               System.out.println("Fonds insuffisants pour effectuer le retrait.");
           }
       } else {
           System.out.println("Le montant doit être positif.");
       }

    }

    public void afficherDetails (){
        System.out.println("titulaire : " +titulaire+ ", sold : " +sold+ "dh");
        System.out.println("--------------------------------------------------");
    }

    public void verser (double mantant , comptBancaire autreCompt){
        if (mantant > 0 && mantant <= this.sold){
            this.retirer(mantant);
            autreCompt.deposer(mantant);
            System.out.println("virement de " + mantant+ "dh effectue avec succes ");
            System.out.println("de " +this.titulaire+ "vers :" +autreCompt.titulaire+);

        }
        else {
            System.out.println("votre sold est pas effectue");
        }

    }
}

