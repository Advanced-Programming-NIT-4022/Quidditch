package org.example;

public class Player implements Success{
    private String name;
    private int number;
    Player(String name, int number){
        this.name = name;
        this.number = number;
    }
    @Override
    public boolean isSuccessful() {
        return false;
    }
}
