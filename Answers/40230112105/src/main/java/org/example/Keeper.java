package org.example;

class Keeper extends Player {
    public Keeper(String name, int number) {
        super(name, number);
    }

    public boolean isSuccessful() {
        return (Math.random() < 0.7);
    }
}