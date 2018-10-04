public class String2 {
    public static void main(String[] args) {
        // Given a string, compute recursively a new string where all the 'x' chars have been removed.

        String something = "Gooxxxxxgxxxxxle";
        System.out.println(something + " do magic... " + removeX(something));

    }
    public static String removeX(String something){
        if(something.length() == 0){
            return something;
        }else if (something.charAt(0)== 'x'){
            return "" + removeX(something.substring(1));
        }else {
            return something.charAt(0) + removeX(something.substring(1));
        }

    }
}
