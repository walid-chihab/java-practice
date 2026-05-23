import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.ArrayList;
import java.util.List;



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
       return null;//meme le null sera presenter comme un obj etudiant mais contient le null
    }

    public void afficherEtudiants(){
         for ( Etudiant e : etudiants){
            e.afficherInfo();
            System.out.println("----------------");
        }
    }

    public void afficherNotesEtudiant(Etudiant e){
        for (Map.Entry<String, Double> entry : e.getNotes().entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

    public List<Etudiant> filtrerEtudiantsParMatiere(String matiere){
        List<Etudiant> res = new ArrayList<>();

        for(Etudiant e : etudiants){
            if(e.getNotes().containsKey(matiere)){
                res.add(e);
            }
        }

        return res;
    }
    public double obtenirMoyenne(Etudiant e){

        double somme = 0;

        for(double note : e.getNotes().values()){
            somme += note;
        }

        return somme / e.getNotes().size();
    }

    public List<Etudiant> filtrerEtudiantsParMoyenne(double seuil){

        List<Etudiant> res = new ArrayList<>();

        for(Etudiant e : etudiants){

            if(obtenirMoyenne(e) > seuil){
                res.add(e);
            }
        }

        return res;
    }
}