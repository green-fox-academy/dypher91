package com.greenfox.foxclub.dypher.programmerfoxclub.models;

import java.util.ArrayList;
import java.util.List;

public class Tricks {
    private List<String> trickOptions = new ArrayList<>();

    public Tricks() {
        trickOptions.add("Drink 10 beers in 10 minutes");
        trickOptions.add("C#");
        trickOptions.add("Nothing");
        trickOptions.add("Play with others");
        trickOptions.add("Say ugly trues");
    }

    public List<String> getTrickOptions() {
        return trickOptions;
    }

    public void setTrickOptions(List<String> trickOptions) {
        this.trickOptions = trickOptions;
    }
}
