import java.util.SimpleTimeZone;

public class VariableMutation {
    public static void main(String[] args) {
        int a = 3;
        // make it bigger by 10
        System.out.println(a +10);
        int b = 100;
        // make it smaller by 7
        System.out.println(b -7);
        int c = 44;
        // please double c's value
        System.out.println(c * 2);
        int d = 125;
        // please divide by 5 d's value
        System.out.println(d /5);
        int e = 8;
        // please cube of e's value
        System.out.println(Math.pow(e,3));
        int f1 = 123;
        int f2 = 345;
        // tell if f1 is bigger than f2 (print as a boolean)
        if (f1 > f2){
            System.out.println("True");}else{
            System.out.println(("False"));
        }
        int g1 = 350;
        int g2 = 200;
        // tell if the double of g2 is bigger than g1 (print as a boolean)
        if ((g2 *2)  > g1){
            System.out.println("True");}else{
            System.out.println(("False"));
        }

        int h = 135798745;
        // tell if it has 11 as a divisor (print as a boolean)
        if (h % 11 ==0){
            System.out.println("True");}else{
            System.out.println(("False"));
        }
        int i1 = 10;
        int i2 = 3;
        // tell if i1 is higher than i2 squared and smaller than i2 cubed (print as a boolean)
        if (i1 > (Math.pow(i2,2)) && i1 < (Math.pow(i2,3))){
            System.out.println("True");}else{
            System.out.println(("False"));
        }
        int j = 1521;
        // tell if j is dividable by 3 or 5 (print as a boolean)
        if (j % 3 ==0 || j % 5 ==0){
            System.out.println("True");}else{
            System.out.println(("False"));
        }

        String k = "Apple";
        //fill the k variable with its cotnent 4 times
        for (int i=0;i<4;i++){
        System.out.println(k);}
    }
}
