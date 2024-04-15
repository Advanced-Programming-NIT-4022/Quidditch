class Seeker extends Player {
    public Seeker(String name, int number) {
        super(name, number);
    }

    @Override
    public boolean isSuccessful() {
        // Seeker has a 5% chance to find the golden snitch
        return Math.random() < 0.05;
    }
} // end class Seeker