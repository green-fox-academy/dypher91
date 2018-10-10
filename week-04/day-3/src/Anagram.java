public class Anagram {
    String string1;// = "kolac";
    String string2;// = "calok";

    public Anagram(String string1, String string2) {
        this.string1 = string1;
        this.string2 = string2;
    }

    public Anagram(){
//        this.string1="kolac";
//        this.string2="calok";
    }

    public boolean validAnagram(String string1, String string2) {
        if (string1.length() != string2.length()) {
            return false;
        }for (int i = 0; i < string1.length(); i++) {
            char ch = string1.charAt(i);

            if (string2.indexOf(ch) == -1)
                return false;
            else
                string2 = string2.replaceFirst(String.valueOf(ch), " ");
        }return true;
    }
}
