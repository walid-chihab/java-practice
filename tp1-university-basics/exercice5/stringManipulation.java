package exercic5;

public class StringManipulation {
    public static String formatName(String fullName){
        // Supprimer les espaces en début et en fin de la chaîne
        fullName = fullName.trim();

        // Diviser la chaîne en parties  selon le separateure (all whitespace :espace, tabulation, etc.)
        String [] nameparts = fullName.split("\\s+");

        // Vérifier si la chaîne contient au moins deux parties (prénom et nom)
        if (nameparts.length < 2) {
            return "Format de nom invalide. Veuillez fournir un prénom et un nom.";
        }   
        // Extraire le prénom et le nom
        String firstName = nameparts[0];
        String lastName = nameparts[1];

        return " Nom : " + lastName + " , Prenom : " + firstName;
    }
}
