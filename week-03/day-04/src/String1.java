public class String1 {
    public static void main(String[] args) {
        // Given a string, compute recursively (no loops) a new string where all the
        // lowercase 'x' chars have been changed to 'y' chars.
        String something = "yyyyxxxxxyyyyy";
        System.out.println(something + " do magic... " + changeX(something));

         }

    public static String changeX(String something){
        if(something.length() == 0){
            return something;

        }else if (something.charAt(0)== 'x'){
            return 'y' + changeX(something.substring(1));

        }else {
            return something.charAt(0) + changeX(something.substring(1));
        }

    }
}
