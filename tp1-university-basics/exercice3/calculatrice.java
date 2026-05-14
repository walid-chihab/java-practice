package exercice3;

public class calculatrice {

    double res;

    public double addition(double a, double b) {
        res = a + b;
        return res;
    }
 
    public double soustraction(double a, double b) {
        res = a - b;
        return res;  
    public double multiplication(double a, double b) {
        res = a * b;
        return res;
    }

    public double division(double a, double b) {
        if (b == 0) {
            System.out.println("Erreur : division par zero detectee !");
            return Double.NaN;
        } else {
            res = a / b;
            return res;
        }
    }

    public double modulo(double a, double b) {
        if (b == 0) {
            System.out.println("Erreur : division par zero detectee !");
            return Double.NaN;
        } else {
            res = a % b;
            return res;
        }
    }

    public double puissance(double a, double b) {
        res = Math.pow(a, b);
        return res;
    }
}
