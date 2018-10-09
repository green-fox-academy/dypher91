package main.java.music;

public abstract class StringedInstrument extends Instrument {
    int numberOfString;

    public StringedInstrument(String name, int numberOfString) {
        super(name);
        this.numberOfString=numberOfString;
    }

    @Override
    public void play(){
        sound();
    }

    abstract void sound();
}
