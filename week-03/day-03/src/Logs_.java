import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Logs_ {
    public static void main(String[] args) {
        System.out.println(getUniqieIps("log.txt").size());
        System.out.println(getIpsOnlyOnce("log.txt").size());
        System.out.println(getRatio("log.txt"));

    }
    public static List<String> getIpsOnlyOnce(String filename){
        List<String> uniqueIp = new ArrayList<>(); //new List uniqueIp, in right must be ArrayList
        Map<String, Integer> countIp = new HashMap<>(0);
        try {
            List<String> lines = Files.readAllLines(Paths.get(filename)); //you put it in empty list
            for (String line : lines ) {
                    String currentIP = line.split("   ")[1];
                if (!countIp.containsKey(currentIP)){
                    countIp.put(currentIP,1);
                }else {
                    countIp.put(currentIP, countIp.get(currentIP)+1);
                }
            }

        }catch (IOException e){
            e.printStackTrace();
        }
        for (String ip : countIp.keySet()){
            if (countIp.get(ip)==1){
                uniqueIp.add(ip);
            }
        }
        return uniqueIp;
    }

    public static List<String> getUniqieIps(String filename){
        List<String> uniqueIp = new ArrayList<>(); //new List uniqueIp, in right must be ArrayList
        //you can put exeption to the first line or do it like that
        try {
        List<String> lines = Files.readAllLines(Paths.get(filename)); //you put it in empty list
            for (String line : lines ) {
                //use the function split that actually put a string in a arraystring
                //basically split list, make the data in it to a collums
               ////// System.out.println(line.split("   ")[1]);
                String currentIP = line.split("   ")[1];
                if (!uniqueIp.contains(currentIP)){
                    uniqueIp.add((currentIP));
                }
            }

        }catch (IOException e){
            e.printStackTrace();
        }

        return uniqueIp;

    }
    public static double getRatio(String filename){

       int post = 0, get = 0;
        try {
            List<String> lines = Files.readAllLines(Paths.get(filename));
            for (String line : lines ) {

               if(line.contains("POST")){
                   post++;

                }
                if(line.contains("GET")){
                    get++;
                }
            }

        }catch (IOException e){
            e.printStackTrace();
        }

        return (double) get/ (double) post;

    }
}
