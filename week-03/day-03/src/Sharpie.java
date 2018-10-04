import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sharpie {
    String color;
    double width;
    double inkAmout;


    public Sharpie(){
        this ("",0);
    }

    public Sharpie(String color, double width){
        this.color=color;
        this.width=width;
        inkAmout = 100;
    }

    public void use() {
        inkAmout--;
    }



    public static void main(String[] args) {
        Sharpie blue = new Sharpie("blue", 2);
        Sharpie black = new Sharpie("black", 2);
        Sharpie red = new Sharpie("red", 2);
        red.use();


        Sharpies sharpies = new Sharpies();
        sharpies.addSharpie(black);
        sharpies.addSharpie(blue);
        sharpies.addSharpie(red);

        System.out.println(blue.color);

        sharpies.checkSharpies();
  


    }







}
