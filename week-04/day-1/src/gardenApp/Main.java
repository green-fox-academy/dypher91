package gardenApp;

public class Main {
    public static void main(String[] args) {
        TheGarden garden = new TheGarden();

        TheFlower flower = new TheFlower("Yellow");
        TheFlower flower1 = new TheFlower("blue");
        TheTree tree = new TheTree("purple");
        TheTree tree1 = new TheTree("orange");

        garden.addFlower(flower);
        garden.addFlower(flower1);
        garden.addTree(tree);
        garden.addTree(tree1);


        garden.checkStatus();
        garden.waterPlants(40);
        garden.waterPlants(70);





    }
}
