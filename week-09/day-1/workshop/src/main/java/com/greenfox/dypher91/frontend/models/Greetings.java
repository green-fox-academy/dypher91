package com.greenfox.dypher91.frontend.models;

public class Greetings {
    private String welcome_message;


    public Greetings(String welcome_message) {
        this.welcome_message = welcome_message;
    }

    public String getWelcome_message() {
        return welcome_message;
    }

    public void setWelcomeMessage(String name, String title) {
        this.welcome_message = "Oh, hi there " + name + ", my dear " + title + "!";
    }

    @Override
    public String toString() {
        return "Message{" +
                "welcome_message='" + welcome_message + '\'' +
                '}';
    }

}
