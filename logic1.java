import java.nio.file.*;
import java.io.IOException;
import java.util.stream.*;
import java.nio.file.DirectoryStream;
public class logic1 {
    public static void main(String[] args) throws IOException {
        Path outputPath = Paths.get("output");

        if (!Files.exists(outputPath)) {
            try {
                Files.createDirectories(outputPath);
            } catch (IOException e) {
                System.err.println("Error creating output directory: " + e.getMessage());
            }

        try (DirectoryStream<Path> classFiles = Files.newDirectoryStream(Paths.get("."), ".class")) {
             
            for (Path file : classFiles) {
                Files.move(file, outputPath.resolve(file.getFileName()), StandardCopyOption.REPLACE_EXISTING);
            }
            System.out.println("Done");
        }
        }
    }
}
