package main.java.music;

public abstract class BassGuitar extends StringedInstrument{
    private String sound;

    public BassGuitar(String name, int numberOfStrings) {
        super(name, numberOfStrings);
    }

    public BassGuitar(int numberOfStrings){
        super(" Bass Guitar ",numberOfStrings);
        this.sound=" Duum-duum-duum ";
    }


}
