public class StringMethodsDemo {
    public static void main(String[] args) {
        // Create a String object
        String str = "Hello, World!";

        // Method: length
        System.out.println("Length of the string: " + str.length());

        // Method: charAt
        System.out.println("Character at index 1: " + str.charAt(1));

        // Method: substring
        System.out.println("Substring from index 7: " + str.substring(7));
        System.out.println("Substring from index 0 to 5: " + str.substring(0, 5));

        // Method: contains
        System.out.println("Contains 'World': " + str.contains("World"));

        // Method: equals
        System.out.println("Equals 'Hello, World!': " + str.equals("Hello, World!"));

        // Method: equalsIgnoreCase
        System.out.println("Equals ignoring case 'hello, world!': " + str.equalsIgnoreCase("hello, world!"));

        // Method: compareTo
        System.out.println("Compare to 'Hello, Java!': " + str.compareTo("Hello, Java!"));

        // Method: indexOf
        System.out.println("Index of 'World': " + str.indexOf("World"));

        // Method: lastIndexOf
        System.out.println("Last index of 'o': " + str.lastIndexOf('o'));

        // Method: toLowerCase
        System.out.println("To lower case: " + str.toLowerCase());

        // Method: toUpperCase
        System.out.println("To upper case: " + str.toUpperCase());

        // Method: trim
        String strWithSpaces = "   Hello, World!   ";
        System.out.println("Trimmed string: '" + strWithSpaces.trim() + "'");

        // Method: replace
        System.out.println("Replace 'World' with 'Java': " + str.replace("World", "Java"));

        // Method: split
        String[] splitArray = str.split(", ");
        System.out.println("Split the string by ', ': ");
        for (String part : splitArray) {
            System.out.println(part);
        }

        // Method: startsWith
        System.out.println("Starts with 'Hello': " + str.startsWith("Hello"));

        // Method: endsWith
        System.out.println("Ends with 'World!': " + str.endsWith("World!"));

        // Method: isEmpty
        System.out.println("Is the string empty: " + str.isEmpty());

        // Method: join
        String joinedString = String.join("-", "Hello", "Java", "World");
        System.out.println("Joined string with '-': " + joinedString);
    }
}
