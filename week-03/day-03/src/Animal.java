public class Animal {

    int hunger;
    int thirst;


    public Animal(){
        this(50,50);
    }

    public Animal(int hunger, int thirst){
        this.hunger = hunger;
        this.thirst = hunger;
    }

    public void eat (){
        hunger--;
    }

    public void  drink (){
        thirst--;
    }

    public void play(){
        hunger++;
        thirst++;
    }

    public static void main(String[] args) {
        Animal animal = new Animal();
        System.out.println(animal.hunger +" "+animal.thirst);

        animal.play();
        System.out.println(animal.hunger +" "+animal.thirst);

        
    }





}
