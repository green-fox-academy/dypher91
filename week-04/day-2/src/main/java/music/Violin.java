package main.java.music;

public class Violin extends StringedInstrument {
    private String sound;

    public Violin() {
        super("Violin", 4);
        this.sound = "Screech";
    }

    public Violin(int numberOfStrings) {
        super("Violin", numberOfStrings);
        this.sound = "Screech";
    }

    @Override
    void sound() {
        System.out.println(name + ", a " + numberOfString + " stringed instrument that goes " + sound);
    }
}