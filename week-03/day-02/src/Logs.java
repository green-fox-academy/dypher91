import java.sql.SQLOutput;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Logs {
    public static void main(String[] args) {
        // Read all data from 'log.txt'.
        // Each line represents a log message from a web server
        // Write a function that returns an array with the unique IP adresses.
        // Write a function that returns the GET / POST request ratio.

        System.out.println(uniqueIP("log.txt"));
        System.out.println(getPostRatio("log.txt"));
    }

    public static List<String> uniqueIP(String filename) {
        Path file = Paths.get(filename);
        List<String> ip = new ArrayList<>();
        List<String> newIP = new ArrayList<>();

        try {
            List<String> lines = Files.readAllLines(file);

            for (int i = 0; i < lines.size(); i++) {
                newIP.add(lines.get(i).substring(24,40).trim());
            }

            for (int j = 0; j < newIP.size(); j++) {
                if (!ip.contains(newIP.get(j))) {
                    ip.add(newIP.get(j));
                }
            }

        } catch (
                IOException e) {
            e.printStackTrace();
        }
        return ip;
    }
    public static double getPostRatio(String filename) {
        Path myPath = Paths.get(filename);

        double GET = 0;
        double POST = 0;

        try {
            List<String> lines = Files.readAllLines(myPath);

            for (int i = 0; i < lines.size(); i++) {
                if (lines.get(i).contains("GET")) {
                    GET++;
                }
                if (lines.get(i).contains("POST")) {
                    POST++;
                }
            }

        } catch (IOException e) {
           e.printStackTrace();
        }
        return GET/POST;


    }
}