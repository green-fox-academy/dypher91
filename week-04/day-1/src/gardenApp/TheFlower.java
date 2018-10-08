package gardenApp;

public class TheFlower extends ThePlant {

    public TheFlower(String color) {
        super(color);
    }

    public void water(double waterQ){
        if (waterLVL < 5){
            waterLVL += waterQ * 0.75;
        }

    }

    public void checkWater() {
        if (waterLVL < 5)
            System.out.println("The " +color + " " + "Flower needs water");
        else {
            System.out.println("The " +color + " " + "Flower doesn't need water");
        }
    }

    public boolean needsWater(){
        boolean needsWater = false;
        if (waterLVL< 5) {
            needsWater = true;
        }return needsWater;
    }
}
