import java.util.Scanner;

public class NumberConverter {
    public static void main(String[] args) {
        int onesDigit;
        int tensDigit;
        int hundredsDigit;




        String[] ones = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
                "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};

        String[] tens = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

        String[] hundreds = {"","one hundred", "two hundred", "three hundred", "four hundred", "five hundred",
                "six hundred", "seven hundred", "eight hundred", "nine hundred"};

        int value = 777;


        if (value < 20) {

            String result = ones[value];
            System.out.println(result);

        } else if (value > 20 && value < 100) {

            tensDigit = value / 10;
            onesDigit = value % 10;

            System.out.print(tens[tensDigit] + " " + ones[onesDigit]);


        } else if (value > 101 && value < 1000) {
            try {

                onesDigit = value % 10;
                hundredsDigit = value / 100;
                tensDigit = (value%100) / 10;


               System.out.print(hundreds[hundredsDigit] + " and "+ tens[tensDigit] + " " + ones[onesDigit]);

            } catch (IndexOutOfBoundsException e) {

                System.out.println(e);
            }
        }
    }
}