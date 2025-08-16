import java.io.File;

public class FileOperations {
    public static void main(String[] args) {
        // Check if the file name is passed as a command-line argument
        if (args.length < 1) {
            System.out.println("Usage: java FileOperations <file_name>");
            return;
        }

        // Create a File object with the provided file name
        String fileName = args[0];
        File file = new File(fileName);

        // Check if the file exists
        if (!file.exists()) {
            System.out.println("The file does not exist: " + fileName);
            return;
        }

        // Display file properties
        System.out.println("File Name: " + file.getName());
        System.out.println("File Path: " + file.getAbsolutePath());
        System.out.println("File Length (bytes): " + file.length());
        System.out.println("Is Readable: " + file.canRead());
        System.out.println("Is Writable: " + file.canWrite());
        System.out.println("Is Hidden: " + file.isHidden());

        // Attempt to delete the file
        boolean isDeleted = file.delete();
        if (isDeleted) {
            System.out.println("File deleted successfully.");
        } else {
            System.out.println("Failed to delete the file.");
        }
    }
}
