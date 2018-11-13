package com.greenfox.foxclub.dypher.programmerfoxclub.service;
import com.greenfox.foxclub.dypher.programmerfoxclub.models.Fox;

import java.util.ArrayList;
import java.util.List;

public class FoxClub {
   List<Fox> foxClub = new ArrayList<>();

    public FoxClub() {
        foxClub.add(new Fox("Pablos","water","salad"));
        foxClub.add(new Fox("Wulf", "beer", "steak"));
    }


    public  Fox findTheFox(String name) {
        for (Fox oneFox : foxClub) {
            if (oneFox.getName().equals(name)) {
                return oneFox;
            }
        }
        return null;
    }

    public  boolean isMember(String name) {
        for (Fox oneFox : foxClub) {
            if (oneFox.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    public  void addMember(String name) {
        foxClub.add(new Fox(name));
    }
}
