 package pile_exercice;

public class Pile {
    
    private final static int taille = 10;
    // La pile est représentée par un tableau d'objets de taille fixe
    private Object[] pile;
    private int pos; // Représente le prochain index libre (et le nombre d'éléments)

    // Constructeur
    public Pile() {
        this.pile = new Object[taille];
        this.pos = 0; // La pile commence à l'index 0
    }

    // Méthode pour empiler
    public void empiler(Object o) throws PilePleine {
        try {
            // Si pos >= 10, cette ligne va générer un ArrayIndexOutOfBoundsException
            this.pile[this.pos] = o;
            this.pos++;
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new PilePleine("Erreur : Impossible d'empiler, la pile est pleine (max " + taille + ").");
        }
    }

    // Méthode pour dépiler
    public Object depiler() throws PileVide {
        try { 
            // Si la pile est vide (pos = 0), (pos - 1) donne -1. 
            // Accéder à pile[-1] va générer un ArrayIndexOutOfBoundsException
            Object element = this.pile[this.pos - 1];
            this.pos--;
            return element;
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new PileVide("Erreur : Impossible de dépiler, la pile est vide.");
        }
    }
}