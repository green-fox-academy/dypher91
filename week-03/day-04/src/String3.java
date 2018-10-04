public class String3 {
    public static void main(String[] args) {
        // Given a string, compute recursively a new string where all the
        // adjacent chars are now separated by a "*".
        String something = "SOMETHING";
        System.out.println(changeBy(something));
    }

    public static String changeBy(String something) {
        if (something.length() == 1) {
            return something;
        } else {
            return something.charAt(0) + "*" + changeBy(something.substring(1));
        }
    }
}
