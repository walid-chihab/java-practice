import java.util.*;
import java.util.stream.Collectors;


public class Magasin {
    private List<Vetement> vetements;

    // Constructeur : initialise la liste avec une LinkedList
    public Magasin() {
        vetements = new LinkedList<>();
    }

    // Méthode utilitaire pour ajouter un vêtement (facilite le test)
    public void ajouterVetement(Vetement v) {
        vetements.add(v);
    }

    // a. Lister les vêtements en promotion
    public void listerPromotions() {
        System.out.println("=== Articles en promotion ===");
        vetements.stream()
                .filter(Vetement::isOnSale)
                .forEach(v -> System.out.println(v.getName() + " - " + v.getPrice() + " dh"));
    }

    // b. Trouver les 3 articles les moins chers
    public void troisMoinsChers() {
        System.out.println("\n=== 3 articles les moins chers ===");
        vetements.stream()
                .sorted(Comparator.comparingDouble(Vetement::getPrice))
                .limit(3)// limite à 3 éléments
                .forEach(v -> System.out.println(v.getName() + " : " + v.getPrice() + " dh"));
    }

    // c. Calculer la valeur totale du stock
    public void valeurTotaleStock() {
        double total = vetements.stream()
                //pourquoi pas map ? 
                .mapToDouble(v -> v.getPrice() * v.getStock()) 
                .sum();
        System.out.printf("\n=== Valeur totale du stock ===\n%.2f dh\n", total);
    } 

    // d. Regrouper les vêtements par catégorie
    public void regroupementParCategorie() {
        Map<String, List<Vetement>> parCategorie = vetements.stream()
                .collect(Collectors.groupingBy(Vetement::getCategory));
        System.out.println("\n=== Regroupement par catégorie ===");
        parCategorie.forEach((cat, liste) -> {
            System.out.println(cat + " (" + liste.size() + " article(s)) :");
            liste.forEach(v -> System.out.println("   " + v.getName()));
        });
    }

    // e. Lister les noms des vêtements avec stock > 20
    public void nomsStockSup20() {
        List<String> noms = vetements.stream()
                .filter(v -> v.getStock() > 20)
                .map(Vetement::getName)
                .collect(Collectors.toList());
        System.out.println("\n=== Vêtements avec stock > 20 ===");
        System.out.println(noms);
    }

    // f. Vérifier si tous les articles sont en stock (stock > 0)
    public void tousEnStock() {
        boolean resultat = vetements.stream()
                .allMatch(v -> v.getStock() > 0);
        System.out.println("\n=== Tous les articles sont-ils en stock ? ===");
        System.out.println(resultat ? "Oui" : "Non (au moins un article a un stock <= 0)");
    }

    // g. Appliquer une remise de 20% sur les articles en promotion
    //    (création d'une nouvelle liste, sans modifier l'originale)
    public void appliquerRemiseSurPromos() {
        List<Vetement> remises = vetements.stream()
                .filter(Vetement::isOnSale)
                .map(v -> new Vetement(v.getId(), v.getName(), v.getCategory(),
                        v.getPrice() * 0.8, v.getStock(), v.isOnSale()))
                .collect(Collectors.toList());
        System.out.println("\n=== Articles après remise (20% sur promos) ===");
        remises.forEach(v -> System.out.println(v.getName() + " -> " + v.getPrice() + " dh"));
    }

    // h. Créer un affichage personnalisé pour chaque article (via map)
     public void affichagePersonnalise() {
        System.out.println("\n=== Affichage personnalisé ===");
        vetements.stream()
                .map(v -> String.format("ID: %d | Nom: %s | Prix: %.2fdh | Stock: %d",
                        v.getId(), v.getName(), v.getPrice(), v.getStock()))
                .forEach(System.out::println);
    }

    // Méthode main (point d'entrée)
    public static void main(String[] args) {
        Magasin magasin = new Magasin();

        // Ajout de quelques vêtements pour tester
        magasin.ajouterVetement(new Vetement(1, "T-shirt Blanc", "T-shirt", 150, 30, true));
        magasin.ajouterVetement(new Vetement(2, "Jean Bleu", "Pantalon", 300, 10, false));
        magasin.ajouterVetement(new Vetement(3, "Chemise Verte", "Chemise", 250, 5, true));
        magasin.ajouterVetement(new Vetement(4, "Robe Noire", "Robe", 400, 0, false));
        magasin.ajouterVetement(new Vetement(5, "T-shirt Rouge", "T-shirt", 180, 50, true));
        magasin.ajouterVetement(new Vetement(6, "Short", "Short", 120, 15, false));
        magasin.ajouterVetement(new Vetement(7, "Pantalon Noir", "Pantalon", 280, 25, false));
        magasin.ajouterVetement(new Vetement(8, "Chemise Blanche", "Chemise", 220, 2, true));

        // Appel de toutes les méthodes demandées
        magasin.listerPromotions();
        magasin.troisMoinsChers();
        magasin.valeurTotaleStock();
        magasin.regroupementParCategorie();
        magasin.nomsStockSup20();
        magasin.tousEnStock();
        magasin.appliquerRemiseSurPromos();
        magasin.affichagePersonnalise();
    }
}