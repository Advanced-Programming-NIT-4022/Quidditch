class Chaser extends Player {
    public Chaser(String name, int number) {
        super(name, number);
    }

    @Override
    public boolean isSuccessful() {
        // Chaser has a 30% chance to score a goal
        return Math.random() < 0.3;
    }
} // end class Chaser