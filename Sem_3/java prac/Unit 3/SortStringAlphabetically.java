import java.util.Arrays;
import java.util.Scanner;

public class SortStringAlphabetically {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter a word: ");
        String inputString   = scanner.nextLine();

        // Convert the input string to a character array
        char[] charArray = inputString.toCharArray();

        // Sort the character array in alphabetical order
        Arrays.sort(charArray);

        // Convert the sorted character array back to a string
        String sortedString = new String(charArray);

        // Display the sorted string
        System.out.println("Sorted string: " + sortedString);
    }
}
