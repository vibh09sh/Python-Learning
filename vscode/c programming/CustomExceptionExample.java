public class CustomExceptionExample {
    public static void main(String[] args) {
    try {
    int age = 15;
    validateAge(age);
    System.out.println("Age is valid");
    } catch (InvalidAgeException e) {
    System.out.println("InvalidAgeException occurred: " + e.getMessage());
    } 
}
    static void validateAge(int age) throws InvalidAgeException {
    if (age < 18) {
    throw new InvalidAgeException("Age must be 18 or above");
    }  
}
    static class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
    super(message);
    } 
}
    }
    