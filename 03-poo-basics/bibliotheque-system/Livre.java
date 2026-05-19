public class Livre {

    private String titre;
    private String auteur;

    // Constructeur
    public Livre(String titre , String auteur ){
        this.titre = titre ; 
        this.auteur = auteur ;
    }
    
    //getters
    public String getTitre (){
        return this.titre;
    }
    public String getAuteur(){
        return this.auteur;
    }

    //setters
    public void setTitre(String titre){
        this.titre = titre ; 
    }
    public void setAuteur(String auteur){
        this.auteur = auteur ;
    }


    @Override
    public boolean equals(Object obj) {

        // 1. même objet mémoire
        if (this == obj)
            return true;

        // 2. null ou mauvais type
        if (obj == null || getClass() != obj.getClass())
            return false;

        // 3. cast sécurisé
        Livre l = (Livre) obj;

        // 4. comparaison des attributs
        return this.titre.equals(l.titre) && this.auteur.equals(l.auteur);
    }
    
}