import java.sql.SQLOutput;

public class UrlFixer {
    public static void main(String[] args) {
        String url = "https//www.reddit.com/r/nevertellmethebots";


        // Accidentally I got the wrong URL for a funny subreddit. It's probably "odds" and not "bots"
        // Also, the URL is missing a crutial component, find out what it is and insert it too!
        // Try to solve it more than once using different String functions!
        String newUrl = url.replace("bots", "odds");
        String newUrl2 = newUrl.replace("https", "https:");

        String substr = url.substring(5,38);
        String substr1 = url.substring(0,4);
        System.out.println(substr1+":"+substr+ "odds");


        String willSee = "bots";
        switch (willSee){
            case "dontKnow":
                System.out.println("error");
                break;
            case "bots":
                System.out.println("https://www.reddit.com/r/nevertellmetheodds");
                break;

        }


        for (int i = 0; i <= url.length() ; i++) {
            System.out.print(newUrl2.charAt(i));
            }
        System.out.println();

       System.out.println(newUrl2);


    }
}
