import java.io.*;
import java.util.Scanner;

public class TerminalInputToFile {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        FileOutputStream fos = new FileOutputStream("a3.dat");

        System.out.println("Enter text (Press 'Q' to quit):");
        String input;
        while (!(input = scanner.nextLine()).equalsIgnoreCase("Q")) {
            fos.write((input + "\n").getBytes());
        }

        fos.close();
        System.out.println("Input saved to a3.dat.");
    }
}
