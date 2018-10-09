package main.java.music;

public abstract class Violin extends StringedInstrument {
    private String sound;

    public Violin(String name, int numberOfStrings) {
        super(name, numberOfStrings);
    }

    public Violin(){
        super(" Violin ",4);
        this.sound = "Screech";
    }
}
