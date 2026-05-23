abstract class Personne {

    private int id ;
    private string nom ;
    private string prenom ;

    //constructeur 
    public Personne(int id, string nom, string prenom ){
        this.id = id ;
        this.nom = nom ;
        this.prenom = prenom ;
    }

    //    // méthode abstraite (pas de corps)
    abstract  public void affich_Info();
}