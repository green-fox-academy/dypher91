public class PrintParams {


    public static void main(String[] args) {

        String[] words = {"first", "second", "third"};

        System.out.println(words.length);
        printParams(words);

    }

    public static void printParams(String[] params){


        for (int i = 0; i < params.length; i++) {

            System.out.print(params[i] + " ");
        }

    }

}