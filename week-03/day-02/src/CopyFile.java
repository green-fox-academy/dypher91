import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.logging.FileHandler;


public class CopyFile {
    public static void main(String[] args) {
        // Write a function that copies a file to an other
        // It should take the filenames as parameters
        // It should return a boolean that shows if the copy was successful

        System.out.println(copyFileFromTo("origin.txt","duplicate.txt"));

    }
    public static boolean copyFileFromTo(String origin,String duplicate ){
       Path original = Paths.get(origin);
       Path copy = Paths.get(duplicate);

        try {
            Path putText = Files.write(original,"123548484858484".getBytes());
            List<String> toWrite2 = Files.readAllLines(original);
            Files.write(copy,toWrite2);
            return true;

        } catch (IOException e) {
            return false;
        }

    }



}
