import java.util.HashSet;
import java.util.Set;

public class Universiter{ 
    private Set<Etudiant> etudiants ;

    public Universiter{
        this.etudiants = new HashSet<>();
    }

    public void  ajouterEtudiant(Etudiant e){
        etudiants.add(e);
    }
    public boolean  rechercherEtudiantParMatricule(String matricule){
        etudiants.contains(matricule);
    }
}