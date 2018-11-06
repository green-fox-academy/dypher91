package com.greenfox.dypher91.bankofsimba.models;


import java.text.DecimalFormat;

public class BankAccount {
    String name;
    double balance;
    String animalType;
    String currency;
    String status;


    public BankAccount(String name, double balance, String animalType, String currency, String status) {
        this.name = name;
        this.balance = balance;
        this.animalType = animalType;
        this.currency = currency;
        this.status = status;
    }

    public BankAccount(){

    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public String getAnimalType() {
        return animalType;
    }

    public String getStatus() {
        return status;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
