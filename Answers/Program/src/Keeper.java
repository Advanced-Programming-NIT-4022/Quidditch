public class Keeper extends Player {
    public Keeper(String name, int number) {
        super(name, number);
    }

    @Override
    public boolean isSuccessful() {
        // Keeper has a 70% chance to save a goal
        return Math.random() < 0.7;
    }
} // end class Keeper