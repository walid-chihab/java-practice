import java.util.LinkedList;

public class Etagere {
    private  int numEtagere ;
    private LinkedList<Livre> livres;
    private int nombreLivres;
    
    // Constructeur
    public Etagere ( int numEtagere){
        this.numEtagere = numEtagere;
        this.livres = new LinkedList<>();
        this.nombreLivres = 0;
     }

     public void ajouterLivre(Livre livre ){
        this.livres.add(livre);
        this.nombreLivres++;

     }

     // Méthode pour retirer un livre de l'étagère mentionner par son indice
    public void retirerLivre(Livre livre , int index ){
        if (index >= 0 && index < this.livres.size()){
            this.livres.remove(index);
            this.nombreLivres--;
        }else {
            System.out.println("Indice invalide . aucun livre a ete retirer .");
        }
    }

    //recuperer un livre de l'étagère mentionner par son indice
    public Livre getLivre (int index ){
        if (index >= 0 && index < this.livres.size()){
            return this.livres.get(index);
        }else {
            return null ;
        }
    }

    //est ce que ce livre existe dans l'étagère
    public boolean contientLivre(Livre livre) {
        return this.livres.contains(livre);  
    }



}
