package org.example;

class Chaser extends Player {
    public Chaser(String name, int number) {
        super(name, number);
    }

    public boolean isSuccessful() {
        return (Math.random() < 0.3);
    }
}