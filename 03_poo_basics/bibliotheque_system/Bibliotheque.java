import java.util.HashSet;

public class Bibliotheque {
    private HashSet<Livre> etagere1 = new HashSet<>();
    private HashSet<Livre> etagere2 = new HashSet<>();
    private HashSet<Livre> etagere3 = new HashSet<>();
    
    // Constructeur
    public  Bibliotheque (){
        this.etagere1 = new HashSet<>();
        this.etagere2 = new HashSet<>();
        this.etagere3 = new HashSet<>();
 
    }

    public void ajouterLivre( Livre livre , int numEtagere ){
        switch (numEtagere) {
            case 1 -> this.etagere1.add(livre);
            case 2 -> this.etagere2.add(livre);
            case 3 -> this.etagere3.add(livre);
            default -> System.out.println("Numero d'etagere invalide .");
        }
    }

    /*nous avons utliser ce code car nombre d'etageres est deja fix sinon
    pour une bibliotheque avec un nombre d'etageres variable on peut faire une
    liste d'etageres et parcourir la liste pour verifier si le livre existe ou pas 
    */

    //si un livre existe dans la bibliotheque
    public boolean contientLivre(Livre livre){
        return this.etagere1.contains(livre) || this.etagere2.contains(livre) || this.etagere3.contains(livre);
    }


    
     
}
