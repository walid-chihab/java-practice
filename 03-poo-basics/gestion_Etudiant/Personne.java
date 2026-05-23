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

    public int  getId(){
        return this.id;
    }
    public String getNom(){
        return this.nom;
    }
    public String getPrenom(){
        return this.prenom;
    }
    public void setId(int id ){
        this.id = id ;
    }
    public void setNom (String  nom){
        this.nom = nom;

    }
    public void setPrenom(string prenom){
        this.prenom = prenom;
    }

    //    // méthode abstraite (pas de corps)
    abstract  public void affich_Info();
}