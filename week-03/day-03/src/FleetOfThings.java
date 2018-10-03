public class FleetOfThings {

    public static void main(String[] args) {
        Fleet fleet = new Fleet();
        // Create a fleet of things to have this output:
        // 1. [ ] Get milk
        // 2. [ ] Remove the obstacles
        // 3. [x] Stand up
        // 4. [x] Eat lunch

        Thing milk = new Thing("Get milk");
        Thing remove = new Thing("Remove the obstacles");
        Thing stand = new Thing("Stand up");
        Thing eat = new Thing("Eat lunch");

        stand.complete();
        eat.complete();

        fleet.add(milk);
        fleet.add(remove);
        fleet.add(stand);
        fleet.add(eat);




        System.out.println(fleet);
    }
}