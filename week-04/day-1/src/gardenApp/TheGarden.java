package gardenApp;

import java.util.ArrayList;

public class TheGarden {

    ArrayList<ThePlant> allPlants = new ArrayList<>();

    public TheGarden() {

    }

    public void addFlower(TheFlower flower) {
        allPlants.add(flower);
    }

    public void addTree(TheTree tree) {
        allPlants.add(tree);
    }

    public void checkStatus() {
        for (int i = 0; i < allPlants.size(); i++) {
            allPlants.get(i).checkWater();
        }
    }
    public void waterPlants(double waterQ) {
        double noOfWaterNeeders = 0;
        for (int i = 0; i < allPlants.size(); i++) {
            if (allPlants.get(i).needsWater() == true) {
                noOfWaterNeeders++;
            }
        }
        System.out.println("Watering with: " + waterQ);
        for (int i = 0; i < allPlants.size(); i++) {
            allPlants.get(i).water(waterQ / noOfWaterNeeders);
        }
        for (int i = 0; i < allPlants.size(); i++) {
            allPlants.get(i).checkWater();
        }

    }

}
