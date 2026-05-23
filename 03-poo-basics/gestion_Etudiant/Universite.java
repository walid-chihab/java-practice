import java.util.HashSet;
import java.util.Set;

public class Universite{ 
    private Set<Etudiant> etudiants ;

    //constructeur 
    public Universite(){
        this.etudiants = new HashSet<>();
    }

    public void  ajouterEtudiant(Etudiant e){
        etudiants.add(e);
    }
    public Etudiant  rechercherEtudiantParMatricule(String matricule){
       // etudiants.contains(matricule);
       for ( Etudiant e : etudiants){
            if (e.getMatricule().equals(matricule)){
                return e;
            }

       }
       return null;
    }
}