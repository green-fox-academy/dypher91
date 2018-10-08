package gardenApp;

public class TheTree extends ThePlant {


    public TheTree(String color) {
        super(color);
    }

    public void water (double waterQ){
        if (waterLVL < 10){
            waterLVL += waterQ * 0.4;
        }
    }

    public void checkWater(){
        if (waterLVL < 10){
            System.out.println("The " +color + " " + "Tree needs water");
        }else {
            System.out.println("The " +color + " " + "Tree doesn't need water");
        }
    }

    public boolean needsWater(){
        boolean needsWater = false;
        if (waterLVL < 10){
            needsWater = true;
        }return needsWater;
    }
}
