import java.util.ArrayList;
import java.util.List;

public class Sharpies {
    List<Sharpie> sharpieList = new ArrayList<>();


   /* public SharpieSet(){

    }*/

    public void addSharpie(Sharpie blue) {
        sharpieList.add(blue);
    }

    public void checkSharpies() {
        for (int i = 0; i < sharpieList.size(); i++) {
            System.out.println(sharpieList.get(i).inkAmout + " " + sharpieList.get(i).color);
        }
    }
}



