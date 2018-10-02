import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.io.IOException;


public class CountLines {
    public static void main(String[] args) throws IOException {
        countLines();


    }

    public static void countLines() throws IOException {
        Path mySecPath = Paths.get("my-file.txt");

        Files.write(mySecPath, "boolean\nchar\nint\nbyte\nshort\ndouble\nlong".getBytes());

        int count=0;


        try {
            List<String> content = Files.readAllLines(mySecPath);
            for (int i = 0; i <content.size() ; i++) {
                count++;

            } System.out.println(count);

        } catch (IOException e) {
            System.out.println("0");
        }
    }




}
