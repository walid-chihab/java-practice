package exercice5;

public class StringManipulation {

    public static String formatName( String fullName){
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

    public static String reverseString(String input) {
        /*  
            ## tostring : Convertit un objet en une chaîne de caractères.Dans ce cas,
            il convertit le StringBuilder en une chaîne
            ## reverse : Inverse l'ordre des caractères dans le StringBuilder.
            ## stringbuilder :StringBuilder est une classe en Java qui permet de créer un objet modifiable (mutable)             à partir d'une chaîne de caractères String, sans modifier la chaîne originale (qui reste immutable)            ## new : est un opérateur en Java utilisé pour créer de nouveaux objets. Dans ce cas, 
            il est utilisé pour créer une nouvelle instance de StringBuilder à partir de la chaîne d'entrée.
        */
        return new StringBuilder(input).reverse().toString();//tostring metter lobjet de stringbuiled en string et reverse inverse lordre des caracteres dans le stringbuilder
    }


    public static int countWords(String input) {
        //cree tableau de chain eleminant les espace et separent les mots par lexpression regulaire  "\\s+" 
        //retourner le nombre de mots dans words length
        String[] words = input.trim().split("\\s+");
        return words.length;

    }

    public static String replaceVowels(String input, char symbol){

        //remplace les voyelles par le symbole
        //si ya pas de [] on aura cherch tout le mots mais avec [] chaqun separement
        // String.valueOf(symbol) sert a convertir un char en String.  car replaceAll attend une chaîne de caractères comme deuxième argument,
        // et symbol est un caractère. En utilisant String.valueOf(symbol), on convertit le caractère en une chaîne de caractères, ce qui permet à replaceAll de fonctionner correctement. 
        return input.replaceAll("[AEIOUaeiou]", String.valueOf(symbol));

    }

    
}
 