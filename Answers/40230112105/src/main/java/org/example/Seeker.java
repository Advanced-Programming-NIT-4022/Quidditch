package org.example;

class Seeker extends Player {
    public Seeker(String name, int number) {
        super(name, number);
    }

    public boolean isSuccessful() {
        return (Math.random() < 0.05);
    }
}