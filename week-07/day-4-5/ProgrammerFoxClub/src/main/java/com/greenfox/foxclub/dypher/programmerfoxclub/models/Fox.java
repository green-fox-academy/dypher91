package com.greenfox.foxclub.dypher.programmerfoxclub.models;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Fox {
    private String name;
    private String favoriteFood;
    private String favoriteDrink;

    private List<String> allActions = new ArrayList<>();
    private List<String> learntTricks = new ArrayList<>();

    public Fox(String name) {
        this.name = name;
        favoriteDrink = "coke";
        favoriteFood = "pizza";
        learntTricks.add("nada");
    }

    public Fox(String name, String favoriteDrink, String favoriteFood) {
        this.name = name;
        this.favoriteDrink = favoriteDrink;
        this.favoriteFood = favoriteFood;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }

    public String getFavoriteDrink() {
        return favoriteDrink;
    }

    public void setFavoriteDrink(String favoriteDrink) {
        this.favoriteDrink = favoriteDrink;
    }

    public List<String> getAllActions() {
        return allActions;
    }

    public void setAllActions(List<String> allActions) {
        this.allActions = allActions;
    }

    public List<String> getLearntTricks() {
        return learntTricks;
    }

    public void setLearntTricks(List<String> learntTricks) {
        this.learntTricks = learntTricks;
    }

    public Integer getNumberOfLearntTricks() {
        return getLearntTricks().size();
    }

    public void addAction(String action) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MMMM dd. HH:mm:ss");
        String formattedDateTime = now.format(formatter);
        allActions.add(formattedDateTime + " : " + action);
    }

    public void learnTrick(String trick) {
        learntTricks.add(trick);
    }
}

