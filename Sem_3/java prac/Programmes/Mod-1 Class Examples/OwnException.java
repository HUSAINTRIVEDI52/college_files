class InvalidAgeException extends Exception {
    public InvalidAgeException(String s) {
        super(s);
    }
}

 public class OwnException {

    
    static void validate(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Not valid");
        } else {
            System.out.println("You are eligible");
        }
    }

    public static void main(String[] args) {
        try {
            validate(12);
        } catch (InvalidAgeException e) {
            System.out.println("Enter valid age > 18");
            System.out.println("Rest of the code...");
}
}
}