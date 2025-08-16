import java.io.File;

public class ListFilesInDirectory {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Usage: java ListFilesInDirectory <directory_name>");
            return;
        }

        File dir = new File(args[0]);

        if (dir.isDirectory()) {
            for (File file : dir.listFiles()) {
                System.out.println(file.getName());
            }
        } else {
            System.out.println(args[0] + " is not a directory.");
        }
    }
}
