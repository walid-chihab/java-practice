package exercice1;

public class Main {

    public static void main(String[] args) {
        Animal A1 = new Animal("dog", "mammal", 5);
        Animal A2 = new Animal("Jane", "Smith", 22);

        A1.affichInfo();
        A2.affichInfo();
        A1.setAge(0);
        A1.setNom("Buddy");
        A1.setType("canine");
        System.out.println("After modification of Animal 1:");
        A1.affichInfo();

    }


}