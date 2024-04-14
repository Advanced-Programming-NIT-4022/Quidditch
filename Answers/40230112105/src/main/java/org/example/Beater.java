package org.example;

class Beater extends Player {
    public Beater(String name, int number) {
        super(name, number);
    }

    public boolean isSuccessful() {
        return (Math.random() < 0.4);
    }
}