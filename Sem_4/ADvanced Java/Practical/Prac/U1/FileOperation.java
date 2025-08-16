import java.io.File;

public class FileOperation {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Usage: java FileOperations <file_name>");
            return;
        }

        File file = new File(args[0]);

        System.out.println("File Name: " + file.getName());
        System.out.println("File Path: " + file.getPath());
        System.out.println("File Length: " + file.length());
        System.out.println("Readable: " + file.canRead());
        System.out.println("Writable: " + file.canWrite());
        System.out.println("Hidden: " + file.isHidden());
        System.out.println("Exists: " + file.exists());
        System.out.println("Deleted: " + file.delete());
    }
}
