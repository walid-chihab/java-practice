package invalid_age_exception;

public class InvalidAgeException extends Exception {
    // 1. Créez une classe d'exception personnalisée appelée InvalidAgeException qui hérite de Exception
    public InvalidAgeException(String message) {
        super(message);
    }   
}
