import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WriteMultipleLines {
    public static void main(String[] args) throws IOException {
        // The path parameter should be a string, that describes the location of the file.
        // The word parameter should be a string, that will be written to the file as lines
        // The number parameter should describe how many lines the file should have.
        // So if the word is "apple" and the number is 5, than it should write 5 lines
        // to the file and each line should be "apple"
        // The function should not raise any error if it could not write the file.
        writeLines();
    }
    public static void writeLines () throws IOException {
       List<String> content = new ArrayList<>();
       Scanner scanner = new Scanner(System.in);

        System.out.println("Put the word, you want to should be in the file: ");
        String word = scanner.nextLine();
        System.out.println("Put the number of lines the file should have:");
        int number = scanner.nextInt();

        try {
            for (int i = 0; i < number; i++) {
                content.add(word);
            }
            Path pathFile = Paths.get("lines.txt");
            Files.write(pathFile,content);

        }catch (IOException e){
            System.out.println("If you read this, something terrible happend!");
        }

    }
}
