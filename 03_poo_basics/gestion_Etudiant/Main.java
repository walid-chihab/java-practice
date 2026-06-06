import java.util.Set;

public class Main {

    public static void main(String[] args) {
        // Déclaration du point d'entrée du programme : méthode main
        
        // 1. Création d'une instance d'université
        Universite universite = new Universite();
        // Instancie un objet Universite qui va contenir la liste des étudiants

        // 2. Création de plusieurs étudiants avec noms et matricules différents
        Etudiant e1 = new Etudiant("Alice Dupont", "20240001");
        Etudiant e2 = new Etudiant("Bob Martin", "20240002");
        Etudiant e3 = new Etudiant("Charlie Durand", "20240003");
        // Chaque étudiant est créé avec son nom et son matricule (identifiant unique)

        // 3. Ajout des étudiants à l'université
        universite.ajouterEtudiant(e1);
        universite.ajouterEtudiant(e2);
        universite.ajouterEtudiant(e3);
        // La méthode ajouterEtudiant ajoute chaque étudiant à la collection interne de l'université

        // 4. Attribution de notes aux étudiants dans différentes matières
        // Pour Alice
        e1.ajouterNote("Mathématiques", 15.5);
        e1.ajouterNote("Physique", 14.0);
        e1.ajouterNote("Informatique", 18.0);
        // La méthode ajouterNote associe une matière (String) à une note (Double) dans la Map de l'étudiant

        // Pour Bob
        e2.ajouterNote("Mathématiques", 12.0);
        e2.ajouterNote("Anglais", 16.5);
        e2.ajouterNote("Histoire", 13.5);

        // Pour Charlie
        e3.ajouterNote("Physique", 17.0);
        e3.ajouterNote("Informatique", 19.5);
        e3.ajouterNote("Anglais", 14.0);

        // 5. (Optionnel) Affichage pour vérification
        System.out.println("=== Tous les étudiants de l'université ===");
        universite.afficherEtudiants(); // méthode hypothétique d'affichage

        System.out.println("\n=== Notes d'Alice ===");
        e1.afficherNotes(); // ou directement la méthode afficherNotesEtudiant(e1) si elle est dans Universite

        // Exemple d'utilisation de la méthode obtenirToutesMatieres()
        System.out.println("\n=== Toutes les matières enseignées ===");
        Set<String> matieres = universite.obtenirToutesMatieres();
        for (String matiere : matieres) {
            System.out.println(" - " + matiere);
        }
    }
}