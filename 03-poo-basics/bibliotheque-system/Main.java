public class Main {
    public static void main (String [] args ){

        // creation de la bibliotheque
        Bibliotheque biblio = new Bibliotheque();

        // creation de quelques livres
        Livre livre1 = new Livre("Le Petit Prince", "Antoine de Saint-Exupéry");
        Livre livre2 = new Livre("1984", "George Orwell");
        Livre livre3 = new Livre("Moby" , "Herman Melville");
        // ajout des livres a la bibliotheque
        biblio.ajouterLivre(livre1 , 1);
        biblio.ajouterLivre(livre2 , 2);
        biblio.ajouterLivre(livre3 , 3);

        // verification de l'existence d'un livre
        System.out.println("La bibliotheque contient '1984' ? " + biblio.contientLivre(livre2));
         System.out.println("La bibliotheque contient 'Le Petit Prince' ? " + biblio.contientLivre(livre1));
         System.out.println("La bibliotheque contient 'Moby' ? " + biblio.contientLivre(livre3));

         // verification de l'existence d'un livre qui n'existe pas
            Livre livre4 = new Livre("Le Seigneur des Anneaux", "J.R.R. Tolkien");
            System.out.println("La bibliotheque contient 'Le Seigneur des Anneaux' ? " + biblio.contientLivre(livre4));
    }
}