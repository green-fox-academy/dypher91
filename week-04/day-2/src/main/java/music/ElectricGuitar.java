package main.java.music;

public class ElectricGuitar extends StringedInstrument {
    private String sound;

    public ElectricGuitar() {
        super("Electric Guitar", 6);
        this.sound = "Twang";
    }

    public ElectricGuitar(int numberOfStrings) {
        super("Electric Guitar", numberOfStrings);
        this.sound = "Twang";
    }

    @Override
    void sound() {
        System.out.println(name + ", a " + numberOfString + " stringed instrument that goes " + sound);
    }
}