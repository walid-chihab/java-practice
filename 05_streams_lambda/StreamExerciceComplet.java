import java.util.*;
import java.util.stream.Collectors;

public class StreamExerciceComplet {

    public static void main(String[] args) {
        // 1. Création de la liste d'entiers
        List<Integer> nombres = Arrays.asList(12, 7, 19, 4, 21, 8, 3, 10, 14, 5);

        // a. Afficher les éléments de la liste
        System.out.println("a. Tous les éléments :");
        nombres.stream().forEach(System.out::println);
        // ou plus simplement : nombres.forEach(System.out::println);

        // b. Afficher tous les nombres pairs
        System.out.println("\nb. Nombres pairs :");
        nombres.stream()
               .filter(n -> n % 2 == 0)
               .forEach(System.out::println);

        // c. Récupérer les nombres impairs, les multiplier par 2, puis les afficher
        System.out.println("\nc. Nombres impairs multipliés par 2 :");
        nombres.stream()
               .filter(n -> n % 2 != 0)  // filtre les impairs
               .map(n -> n * 2)          // multiplication par 2
               .forEach(System.out::println);

        // d. Récupérer les nombres impairs dans un Set
        Set<Integer> impairsSet = nombres.stream()
                .filter(n -> n % 2 != 0)
                .collect(Collectors.toSet());
        System.out.println("\nd. Set des nombres impairs : " + impairsSet);

        // e. Utiliser « reduce » pour calculer la somme des nombres pairs
        int sommePairs = nombres.stream()
                .filter(n -> n % 2 == 0)
                .reduce(0, Integer::sum);
        System.out.println("\ne. Somme des nombres pairs : " + sommePairs);

        // f. Utiliser « reduce » pour chercher le maximum des nombres impairs
        Optional<Integer> maxImpair = nombres.stream()
                .filter(n -> n % 2 != 0)
                .reduce(Integer::max);//trouve le max parmi les impairs, retourne un Optional pour gérer le cas où il n'y aurait aucun impair
        System.out.println("\nf. Maximum des nombres impairs : " + 
                (maxImpair.isPresent() ? maxImpair.get() : "aucun"));//gère le cas où il n'y aurait aucun impair

        // g. Calculer la somme des carrés des nombres impairs
        int sommeCarresImpairs = nombres.stream()
                .filter(n -> n % 2 != 0)
                .map(n -> n * n)
                .reduce(0, Integer::sum);//somme les carrés des impairs dans la listes'appelle sommeCarresImpairs
        System.out.println("\ng. Somme des carrés des impairs : " + sommeCarresImpairs);

        // h. Déterminer le maximum des carrés des nombres impairs qui ne dépassent pas 100
        Optional<Integer> maxCarreInf100 = nombres.stream()
                .filter(n -> n % 2 != 0)
                .map(n -> n * n)
                .filter(carre -> carre <= 100)//garde les carrés inférieurs ou égaux à 100
                .max(Integer::compareTo);//trouve le max parmi les carrés filtrés
        System.out.println("\nh. Maximum des carrés impairs ≤ 100 : " + (maxCarreInf100.isPresent() ? maxCarreInf100.get() : "aucun"));

        // i. Collecter les nombres supérieurs à 10 dans une liste triée en ordre décroissant
        List<Integer> superieurs10Desc = nombres.stream()//flux des nombres [12, 7, 19, 4, 21, 8, 3, 10, 14, 5]
                .filter(n -> n > 10) //garde les nombres > 10 → [12, 19, 21, 14]
                .sorted(Comparator.reverseOrder())// trie en ordre décroissant → [21, 19, 14, 12]
                .collect(Collectors.toList());// transforme le flux en une List → [21, 19, 14, 12]
        System.out.println("\ni. Nombres > 10 triés décroissants : " + superieurs10Desc);

        // j. Trouver le plus petit nombre carré impair
        Optional<Integer> plusPetitCarreImpair = nombres.stream()//parcourt la liste de nombres
                .filter(n -> n % 2 != 0)
                .map(n -> n * n)
                .min(Integer::compareTo);//trouve le minimum parmi les carrés impairs
        System.out.println("\nj. Plus petit carré impair : " + 
                (plusPetitCarreImpair.isPresent() ? plusPetitCarreImpair.get() : "aucun"));
    }
}