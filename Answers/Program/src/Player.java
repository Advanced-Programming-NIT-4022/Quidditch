interface Success {
    boolean isSuccessful();
}

public class Player implements Success {
    private final String name;
    private final int number;

    public Player(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public boolean isSuccessful() {
        return false;
    }
}