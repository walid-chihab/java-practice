package exercice4;

class CompteBancair {
    private String titulaire;
    private double solde;
    private final double TAUX_INTERET = 0.3;
    private static int numCompte = 0; 

    //Constructeur 
    public CompteBancair (String titulaire ,double solde){
        this.titulaire = titulaire;
        this.solde = solde;
        numCompte++;
    }

    //deposer
    public void deposer (double montant){
        this.solde += montant;
    }

    //retirer
    public void retirer (double montant){
        if (montant <= 0){
            System.out.println( "le montant doit etre superieure strictement a zero");
        } else if  (montant > this.solde){
            System.out.println("le montant doit etre inferieure ou egale a votre solde ");
        }else {
            this.solde -= montant;
        }
    }

    //Interet 
    public void calculerInteret(){
        this.solde += this.solde * TAUX_INTERET;
    }

    //numcompte    sans utiser un getteure 
    public static int numCompte(){
        return numCompte;
    }

    public String getTitulaire() {
        return titulaire;
    }

    public double getSolde () {
        return solde;
    }
    


}