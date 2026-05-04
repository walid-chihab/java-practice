package exercice1;

public class Animal {
    private String nom;
    private String type;
    private int age;

    // constructor paramétré
    public Animal(String _nom, String _type, int _age) {
        this.nom = _nom;
        this.type = _type;
        this.age = _age;
    }

    public void affichInfo(){
        System.out.println("le nom est " +nom+ ",\t le type est " +type+ " \t l'age est :"+age );
    }

    // getters 
    public String getNom(){
        return this.nom;
    }

    // setters
    public void setNom(String _nom ){
        this.nom = _nom ;
    }

    public String getType(){
        return this.type;
    }

    public void setType(String _type){
        this.type = _type ;
    }

    public int  getAge (){
        return this.age;
    }

    public void setAge (int _age){
        this.age = _age ;
    }


}
