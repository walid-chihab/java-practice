import java.util.HashMap;
import java.util.Map;

public class Etudiant extends Personne {
    
    private String  matricule;
    private Map<String ,Double > notes;

    public Etudiant(int id ,String nom, String prenom, String matricule){
        super (id ,nom, prenom);
        this.matricule = matricule;
        this.notes = new HashMap<>();
    }

    @Override
    public void affich_Info(){
        System.out.println("nom :"+getNom());
        System.out.println("id"+getId());
        System.out.println("prenom :"+getPrenom());
        System.out.print("matricule:"+matricule);
        System.out.println("notes"+notes);
    }

    public  void ajouterNote(String matiere, double note) {
        notes.put(matiere,note);
    }

    @Override
    public boolean equals(Object var1){
        if (this == obj)
            return true;
        else if( obj != null && this.class() == obj.getClass()){
            //maintenant on peut faire le cast 
            Etudiant var2 = (Etudiant)var1;
            return this.matricule.equals(var2);
      }
      else 
        return false;
    }
}