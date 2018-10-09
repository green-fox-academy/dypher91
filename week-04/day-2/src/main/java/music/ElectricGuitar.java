package main.java.music;

public abstract class ElectricGuitar extends StringedInstrument {
    private String sound;

    public ElectricGuitar(String name, int numberOfStrings) {
        super(name, numberOfStrings);
    }

    public ElectricGuitar(){
        super(" Electric Guitar ",6);
        this.sound=" Twang ";
    }
}
