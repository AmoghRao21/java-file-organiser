import java.nio.file.*;
import java.util.Scanner;
import java.io.IOException;

public class logic1 {
    public static void main(String[] args) throws IOException {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter target directory: ");
       Path dir = Paths.get(sc.nextLine());

       if (!Files.exists(dir)) {
           Files.createDirectories(dir);
           System.out.println("Directory created: " + dir);
       }

       System.out.println("Enter the file extension : ");
         String ext = sc.nextLine();

        try (DirectoryStream<Path> files = Files.newDirectoryStream(Paths.get("."), ext)) {
            for (Path file : files) {
               Files.move(file, dir.resolve(file.getFileName()), StandardCopyOption.REPLACE_EXISTING);
                System.out.println("Moved file: " + file.getFileName() + " to " + dir);
            }
        }
    }
}