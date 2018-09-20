import java.util.concurrent.TimeUnit;

public class IWontCheatOnTheExams {
    public static void main(String[] args) {
        // Create a program that writes this line 100 times:
        // "I won't cheat on the exam!"

        for (int i = 0; i < 101; i++) {
            try {
                Thread.sleep(500);

            }

            catch (InterruptedException ex)

            {

                // do nothing

            }

            System.out.println("I won't cheat on the exam!");

        }


    }
}
