import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.io.IOException;

public class PrintEachLine {
    public static void main(String[] args) throws IOException {
        openFile();

    }

    public static void openFile() throws IOException {
        Path mySecPath = Paths.get("my-file.txt");

        //if I don't create the file, by the line below, than exception catch it
        Files.write(mySecPath, "boolean\nchar\nint\nbyte\nshort\ndouble\nlong".getBytes());

        try {

            List<String> content = Files.readAllLines(mySecPath);
            for (String line: content) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("Unable to read file: " +mySecPath);
        }
    }




}
