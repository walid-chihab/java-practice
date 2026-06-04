
import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {

    // 2. Écrivez une méthode validateAge(int age) qui vérifie si l'âge est valide
    public static void validateAge(int age) throws InvalidAgeException {
        // 3. Si l'âge est inférieur à 18, levez une exception de type InvalidAgeException
        if (age < 18) {
            throw new InvalidAgeException("Erreur : Vous devez avoir au moins 18 ans pour vous inscrire ! (Âge saisi : " + age + ")");
        }
        // Si l'âge est >= 18, tout va bien
        System.out.println("Validation réussie : Âge valide pour l'inscription.");
    }

    // 4. Dans la méthode main, demandez à l'utilisateur de saisir son âge, validez-le et gérez l'exception
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Veuillez saisir votre âge : ");
            int userAge = scanner.nextInt();

            // Appel de la méthode de validation (qui peut lever l'exception)
            validateAge(userAge);
            
            System.out.println("Inscription finalisée avec succès !");

        } catch (InvalidAgeException e) {
            // Interception de ton exception personnalisée
            System.err.println(e.getMessage());
        } catch (InputMismatchException e) {
            // Sécurité bonus : si l'utilisateur saisit des lettres au lieu d'un nombre mrc hihi
            System.err.println("Erreur : Veuillez entrer un nombre entier pour l'âge.");
        } finally {
            // Fermeture propre du scanner
            scanner.close();
            System.out.println("Fin du programme.");
        }
    }
}