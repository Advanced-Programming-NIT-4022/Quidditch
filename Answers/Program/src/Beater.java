class Beater extends Player {
    public Beater(String name, int number) {
        super(name, number);
    }

    @Override
    public boolean isSuccessful() {
        // Beater has a 40% chance to stop chasers
        return Math.random() < 0.4;
    }
} // end class Beater