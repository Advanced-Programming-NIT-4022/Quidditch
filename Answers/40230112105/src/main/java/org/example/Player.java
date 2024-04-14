package org.example;

class Player implements Success {
    String name;
    int number;

    public Player(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public boolean isSuccessful() {
        return false;
    }
}